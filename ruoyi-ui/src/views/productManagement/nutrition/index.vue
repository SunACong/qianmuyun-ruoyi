<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="使用时间">
        <el-date-picker
          v-model="daterangeNutritiondate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="场区" prop="region">
        <el-input
          v-model="queryParams.region"
          placeholder="请输入场区"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="栋号" prop="buildingnum">
        <el-input
          v-model="queryParams.buildingnum"
          placeholder="请输入栋号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="栏号" prop="columnnum">
        <el-input
          v-model="queryParams.columnnum"
          placeholder="请输入栏号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="耳编号" prop="eartagid">
        <el-input
          v-model="queryParams.eartagid"
          placeholder="请输入耳编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="查询开始时间">
        <el-date-picker
          v-model="daterangeStartdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="查询截止时间">
        <el-date-picker
          v-model="daterangeEnddate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['productManagement:nutrition:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['productManagement:nutrition:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['productManagement:nutrition:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:nutrition:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="nutritionList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="使用时间" align="center" prop="nutritiondate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.nutritiondate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="数量" align="center" prop="amount" />
      <el-table-column label="平均体重" align="center" prop="weight" />
      <el-table-column label="阶段" align="center" prop="stage">
        <template slot-scope="scope">
          <dict-tag :options="dict.type. nutrition" :value="scope.row.stage"/>
        </template>
      </el-table-column>
      <el-table-column label="精料配方" align="center" prop="concentrate" />
      <el-table-column label="粗料配方" align="center" prop="roughage" />
      <el-table-column label="平均每天每只饲料量" align="center" prop="feedingnum" />
      <el-table-column label="用料总量" align="center" prop="totalnum" />
      <el-table-column label="全价料每只斤" align="center" prop="fullpriceper" />
      <el-table-column label="查询开始时间" align="center" prop="startdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.startdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="查询截止时间" align="center" prop="enddate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.enddate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="视频地址" align="center" prop="video">
        <template slot-scope="scope">
          <el-dialog title="视频" :visible.sync="dialogPlay" width="30%" @close="closeDialog">
            <video :src="videoUrl" controls autoplay width="100%"></video>
          </el-dialog>
          <div v-show="scope.row.video==''?false:true" @click="playVideo(scope.row)" style="color: #00afff">查看视频</div>
        </template>
      </el-table-column>
      <el-table-column label="备注信息" align="center" prop="remarks" />
      <el-table-column label="审核是否通过" align="center" prop="bak1">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_yes_no" :value="scope.row.bak1"/>
        </template>
      </el-table-column>
      <el-table-column label="未通过原因" align="center" prop="bak2" />
      <el-table-column label="养殖场" align="center" prop="bak3" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['productManagement:nutrition:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:nutrition:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改阶段营养档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="使用时间" prop="nutritiondate">
          <el-date-picker clearable
            v-model="form.nutritiondate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择使用时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="场区" prop="region">
          <el-input v-model="form.region" placeholder="请输入场区" />
        </el-form-item>
        <el-form-item label="栋号" prop="buildingnum">
          <el-input v-model="form.buildingnum" placeholder="请输入栋号" />
        </el-form-item>
        <el-form-item label="栏号" prop="columnnum">
          <el-input v-model="form.columnnum" placeholder="请输入栏号" />
        </el-form-item>
        <el-form-item label="耳编号" prop="eartagid">
          <el-input v-model="form.eartagid" placeholder="请输入耳编号" />
        </el-form-item>
        <el-form-item label="数量" prop="amount">
          <el-input v-model="form.amount" placeholder="请输入数量" />
        </el-form-item>
        <el-form-item label="平均体重" prop="weight">
          <el-input v-model="form.weight" placeholder="请输入平均体重" />
        </el-form-item>
        <el-form-item label="阶段" prop="stage">
          <el-select v-model="form.stage" placeholder="请选择阶段">
            <el-option
              v-for="dict in dict.type. nutrition"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="精料配方" prop="concentrate">
          <el-input v-model="form.concentrate" placeholder="请输入精料配方" />
        </el-form-item>
        <el-form-item label="粗料配方" prop="roughage">
          <el-input v-model="form.roughage" placeholder="请输入粗料配方" />
        </el-form-item>
        <el-form-item label="平均每天每只饲料量" prop="feedingnum">
          <el-input v-model="form.feedingnum" placeholder="请输入平均每天每只饲料量" />
        </el-form-item>
        <el-form-item label="用料总量" prop="totalnum">
          <el-input v-model="form.totalnum" placeholder="请输入用料总量" />
        </el-form-item>
        <el-form-item label="全价料每只斤" prop="fullpriceper">
          <el-input v-model="form.fullpriceper" placeholder="请输入全价料每只斤" />
        </el-form-item>
        <el-form-item label="查询开始时间" prop="startdate">
          <el-date-picker clearable
            v-model="form.startdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择查询开始时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="查询截止时间" prop="enddate">
          <el-date-picker clearable
            v-model="form.enddate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择查询截止时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarks">
          <el-input v-model="form.remarks" placeholder="请输入备注信息" />
        </el-form-item>
        <el-form-item label="审核是否通过">
          <el-radio-group v-model="form.bak1">
            <el-radio
              v-for="dict in dict.type.sys_yes_no"
              :key="dict.value"
:label="dict.value"
            >{{dict.label}}</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="未通过原因" prop="bak2">
          <el-input v-model="form.bak2" placeholder="请输入未通过原因" />
        </el-form-item>
        <el-form-item label="养殖场" prop="bak3">
          <el-input v-model="form.bak3" placeholder="请输入养殖场" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listNutrition, getNutrition, delNutrition, addNutrition, updateNutrition } from "@/api/productManagement/nutrition";

export default {
  name: "Nutrition",
  dicts: [' nutrition', 'sys_yes_no'],
  data() {
    return {
      dialogPlay: false,
      videoUrl:'',
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: false,
      // 总条数
      total: 0,
      // 阶段营养档案表格数据
      nutritionList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeNutritiondate: [],
      // 养殖场时间范围
      daterangeStartdate: [],
      // 养殖场时间范围
      daterangeEnddate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        nutritiondate: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        eartagid: null,
        startdate: null,
        enddate: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 视频播放 */
    playVideo(row) {
      this.dialogPlay = true;
      this.videoUrl = row.video;
    },
    closeDialog() {
      this.videoUrl = ""; //清空数据 关闭视频播放
    },
    /** 查询阶段营养档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeNutritiondate && '' != this.daterangeNutritiondate) {
        this.queryParams.params["beginNutritiondate"] = this.daterangeNutritiondate[0];
        this.queryParams.params["endNutritiondate"] = this.daterangeNutritiondate[1];
      }
      if (null != this.daterangeStartdate && '' != this.daterangeStartdate) {
        this.queryParams.params["beginStartdate"] = this.daterangeStartdate[0];
        this.queryParams.params["endStartdate"] = this.daterangeStartdate[1];
      }
      if (null != this.daterangeEnddate && '' != this.daterangeEnddate) {
        this.queryParams.params["beginEnddate"] = this.daterangeEnddate[0];
        this.queryParams.params["endEnddate"] = this.daterangeEnddate[1];
      }
      listNutrition(this.queryParams).then(response => {
        this.nutritionList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        nutritiondate: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        eartagid: null,
        amount: null,
        weight: null,
        stage: null,
        concentrate: null,
        roughage: null,
        feedingnum: null,
        totalnum: null,
        fullpriceper: null,
        startdate: null,
        enddate: null,
        video: null,
        remarks: null,
        bak1: "0",
        bak2: null,
        bak3: null,
        createBy: null,
        createDate: null,
        updateBy: null,
        updateDate: null,
        delFlag: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.daterangeNutritiondate = [];
      this.daterangeStartdate = [];
      this.daterangeEnddate = [];
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加阶段营养档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getNutrition(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改阶段营养档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateNutrition(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addNutrition(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除阶段营养档案编号为"' + ids + '"的数据项？').then(function() {
        return delNutrition(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/nutrition/export', {
        ...this.queryParams
      }, `nutrition_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
