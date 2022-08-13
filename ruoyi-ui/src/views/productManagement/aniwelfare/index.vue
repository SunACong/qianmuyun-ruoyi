<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="检查时间">
        <el-date-picker
          v-model="daterangeCheckdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
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
      <el-form-item label="养殖场" prop="bak3">
        <el-input
          v-model="queryParams.bak3"
          placeholder="请输入养殖场"
          clearable
          @keyup.enter.native="handleQuery"
        />
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
          v-hasPermi="['productManagement:aniwelfare:add']"
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
          v-hasPermi="['productManagement:aniwelfare:edit']"
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
          v-hasPermi="['productManagement:aniwelfare:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:aniwelfare:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="aniwelfareList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="检查时间" align="center" prop="checkdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.checkdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作流程是否规范" align="center" prop="operation">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.operation"/>
        </template>
      </el-table-column>
      <el-table-column label="饲料房卫生是否清洁" align="center" prop="feedhouse">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.feedhouse"/>
        </template>
      </el-table-column>
      <el-table-column label="灭鼠是否到位" align="center" prop="killrat">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.killrat"/>
        </template>
      </el-table-column>
      <el-table-column label="羊舍通风采光是否良好" align="center" prop="ventilation">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.ventilation"/>
        </template>
      </el-table-column>
      <el-table-column label="羊舍卫生是否清洁" align="center" prop="goathouse">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.goathouse"/>
        </template>
      </el-table-column>
      <el-table-column label="环境卫生是否清洁" align="center" prop="environment">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.environment"/>
        </template>
      </el-table-column>
      <el-table-column label="饲草饲料是否霉变" align="center" prop="forgegrass">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.forgegrass"/>
        </template>
      </el-table-column>
      <el-table-column label="冬季防寒保暖是否到位" align="center" prop="coldproof">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.coldproof"/>
        </template>
      </el-table-column>
      <el-table-column label="灭蚊是否到位" align="center" prop="mosquitocontrol">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yes_no" :value="scope.row.mosquitocontrol"/>
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
            v-hasPermi="['productManagement:aniwelfare:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:aniwelfare:remove']"
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

    <!-- 添加或修改动物福利对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="检查时间" prop="checkdate">
          <el-date-picker clearable
            v-model="form.checkdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择检查时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="操作流程是否规范" prop="operation">
          <el-select v-model="form.operation" placeholder="请选择操作流程是否规范">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="饲料房卫生是否清洁" prop="feedhouse">
          <el-select v-model="form.feedhouse" placeholder="请选择饲料房卫生是否清洁">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="灭鼠是否到位" prop="killrat">
          <el-select v-model="form.killrat" placeholder="请选择灭鼠是否到位">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="羊舍通风采光是否良好" prop="ventilation">
          <el-select v-model="form.ventilation" placeholder="请选择羊舍通风采光是否良好">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="羊舍卫生是否清洁" prop="goathouse">
          <el-select v-model="form.goathouse" placeholder="请选择羊舍卫生是否清洁">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="环境卫生是否清洁" prop="environment">
          <el-select v-model="form.environment" placeholder="请选择环境卫生是否清洁">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="饲草饲料是否霉变" prop="forgegrass">
          <el-select v-model="form.forgegrass" placeholder="请选择饲草饲料是否霉变">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="冬季防寒保暖是否到位" prop="coldproof">
          <el-select v-model="form.coldproof" placeholder="请选择冬季防寒保暖是否到位">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="灭蚊是否到位" prop="mosquitocontrol">
          <el-select v-model="form.mosquitocontrol" placeholder="请选择灭蚊是否到位">
            <el-option
              v-for="dict in dict.type.yes_no"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" type="textarea" placeholder="请输入内容" />
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
import { listAniwelfare, getAniwelfare, delAniwelfare, addAniwelfare, updateAniwelfare } from "@/api/productManagement/aniwelfare";

export default {
  name: "Aniwelfare",
  dicts: ['sys_yes_no', 'yes_no'],
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
      // 动物福利表格数据
      aniwelfareList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeCheckdate: [],
      // 养殖场时间范围
      daterangeStartdate: [],
      // 养殖场时间范围
      daterangeEnddate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        checkdate: null,
        startdate: null,
        enddate: null,
        bak3: null,
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
    /** 查询动物福利列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeCheckdate && '' != this.daterangeCheckdate) {
        this.queryParams.params["beginCheckdate"] = this.daterangeCheckdate[0];
        this.queryParams.params["endCheckdate"] = this.daterangeCheckdate[1];
      }
      if (null != this.daterangeStartdate && '' != this.daterangeStartdate) {
        this.queryParams.params["beginStartdate"] = this.daterangeStartdate[0];
        this.queryParams.params["endStartdate"] = this.daterangeStartdate[1];
      }
      if (null != this.daterangeEnddate && '' != this.daterangeEnddate) {
        this.queryParams.params["beginEnddate"] = this.daterangeEnddate[0];
        this.queryParams.params["endEnddate"] = this.daterangeEnddate[1];
      }
      listAniwelfare(this.queryParams).then(response => {
        this.aniwelfareList = response.rows;
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
        checkdate: null,
        operation: null,
        feedhouse: null,
        killrat: null,
        ventilation: null,
        goathouse: null,
        environment: null,
        forgegrass: null,
        coldproof: null,
        mosquitocontrol: null,
        video: null,
        startdate: null,
        enddate: null,
        bak1: "0",
        bak2: null,
        bak3: null,
        createBy: null,
        createDate: null,
        updateBy: null,
        updateDate: null,
        remarks: null,
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
      this.daterangeCheckdate = [];
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
      this.title = "添加动物福利";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAniwelfare(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改动物福利";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAniwelfare(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAniwelfare(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除动物福利编号为"' + ids + '"的数据项？').then(function() {
        return delAniwelfare(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/aniwelfare/export', {
        ...this.queryParams
      }, `aniwelfare_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
