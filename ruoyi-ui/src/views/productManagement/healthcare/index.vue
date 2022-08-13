<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="保健时间">
        <el-date-picker
          v-model="daterangeHealthdate"
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
      <el-form-item label="数量" prop="amount">
        <el-input
          v-model="queryParams.amount"
          placeholder="请输入数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="平均体重" prop="weight">
        <el-input
          v-model="queryParams.weight"
          placeholder="请输入平均体重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="阶段" prop="stage">
        <el-input
          v-model="queryParams.stage"
          placeholder="请输入阶段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="保健药名称" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入保健药名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="投喂方式" prop="method">
        <el-input
          v-model="queryParams.method"
          placeholder="请输入投喂方式"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="剂量" prop="dose">
        <el-input
          v-model="queryParams.dose"
          placeholder="请输入剂量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="总投喂量(kg)" prop="volume">
        <el-input
          v-model="queryParams.volume"
          placeholder="请输入总投喂量(kg)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="投喂疗程(天)" prop="period">
        <el-input
          v-model="queryParams.period"
          placeholder="请输入投喂疗程(天)"
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
      <el-form-item label="视频" prop="video">
        <el-input
          v-model="queryParams.video"
          placeholder="请输入视频"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注信息" prop="remarks">
        <el-input
          v-model="queryParams.remarks"
          placeholder="请输入备注信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核是否通过" prop="bak1">
        <el-input
          v-model="queryParams.bak1"
          placeholder="请输入审核是否通过"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="未通过原因" prop="bak2">
        <el-input
          v-model="queryParams.bak2"
          placeholder="请输入未通过原因"
          clearable
          @keyup.enter.native="handleQuery"
        />
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
          v-hasPermi="['productManagement:healthcare:add']"
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
          v-hasPermi="['productManagement:healthcare:edit']"
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
          v-hasPermi="['productManagement:healthcare:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:healthcare:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="healthcareList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="保健时间" align="center" prop="healthdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.healthdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="数量" align="center" prop="amount" />
      <el-table-column label="平均体重" align="center" prop="weight" />
      <el-table-column label="阶段" align="center" prop="stage" />
      <el-table-column label="保健药名称" align="center" prop="name" />
      <el-table-column label="投喂方式" align="center" prop="method" />
      <el-table-column label="剂量" align="center" prop="dose" />
      <el-table-column label="总投喂量(kg)" align="center" prop="volume" />
      <el-table-column label="投喂疗程(天)" align="center" prop="period" />
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
      <el-table-column label="视频" align="center" prop="video" />
      <el-table-column label="备注信息" align="center" prop="remarks" />
      <el-table-column label="审核是否通过" align="center" prop="bak1" />
      <el-table-column label="未通过原因" align="center" prop="bak2" />
      <el-table-column label="养殖场" align="center" prop="bak3" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['productManagement:healthcare:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:healthcare:remove']"
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

    <!-- 添加或修改保健档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="保健时间" prop="healthdate">
          <el-date-picker clearable
            v-model="form.healthdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择保健时间">
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
          <el-input v-model="form.stage" placeholder="请输入阶段" />
        </el-form-item>
        <el-form-item label="保健药名称" prop="name">
          <el-input v-model="form.name" placeholder="请输入保健药名称" />
        </el-form-item>
        <el-form-item label="投喂方式" prop="method">
          <el-input v-model="form.method" placeholder="请输入投喂方式" />
        </el-form-item>
        <el-form-item label="剂量" prop="dose">
          <el-input v-model="form.dose" placeholder="请输入剂量" />
        </el-form-item>
        <el-form-item label="总投喂量(kg)" prop="volume">
          <el-input v-model="form.volume" placeholder="请输入总投喂量(kg)" />
        </el-form-item>
        <el-form-item label="投喂疗程(天)" prop="period">
          <el-input v-model="form.period" placeholder="请输入投喂疗程(天)" />
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
          <el-input v-model="form.video" placeholder="请输入视频" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarks">
          <el-input v-model="form.remarks" placeholder="请输入备注信息" />
        </el-form-item>
        <el-form-item label="审核是否通过" prop="bak1">
          <el-input v-model="form.bak1" placeholder="请输入审核是否通过" />
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
import { listHealthcare, getHealthcare, delHealthcare, addHealthcare, updateHealthcare } from "@/api/productManagement/healthcare";

export default {
  name: "Healthcare",
  data() {
    return {
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
      // 保健档案表格数据
      healthcareList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeHealthdate: [],
      // 养殖场时间范围
      daterangeStartdate: [],
      // 养殖场时间范围
      daterangeEnddate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        healthdate: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        eartagid: null,
        amount: null,
        weight: null,
        stage: null,
        name: null,
        method: null,
        dose: null,
        volume: null,
        period: null,
        startdate: null,
        enddate: null,
        video: null,
        remarks: null,
        bak1: null,
        bak2: null,
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
    /** 查询保健档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeHealthdate && '' != this.daterangeHealthdate) {
        this.queryParams.params["beginHealthdate"] = this.daterangeHealthdate[0];
        this.queryParams.params["endHealthdate"] = this.daterangeHealthdate[1];
      }
      if (null != this.daterangeStartdate && '' != this.daterangeStartdate) {
        this.queryParams.params["beginStartdate"] = this.daterangeStartdate[0];
        this.queryParams.params["endStartdate"] = this.daterangeStartdate[1];
      }
      if (null != this.daterangeEnddate && '' != this.daterangeEnddate) {
        this.queryParams.params["beginEnddate"] = this.daterangeEnddate[0];
        this.queryParams.params["endEnddate"] = this.daterangeEnddate[1];
      }
      listHealthcare(this.queryParams).then(response => {
        this.healthcareList = response.rows;
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
        healthdate: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        eartagid: null,
        amount: null,
        weight: null,
        stage: null,
        name: null,
        method: null,
        dose: null,
        volume: null,
        period: null,
        startdate: null,
        enddate: null,
        video: null,
        remarks: null,
        bak1: null,
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
      this.daterangeHealthdate = [];
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
      this.title = "添加保健档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getHealthcare(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改保健档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateHealthcare(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addHealthcare(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除保健档案编号为"' + ids + '"的数据项？').then(function() {
        return delHealthcare(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/healthcare/export', {
        ...this.queryParams
      }, `healthcare_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
