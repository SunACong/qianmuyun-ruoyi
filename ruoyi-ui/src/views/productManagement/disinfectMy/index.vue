<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="时间">
        <el-date-picker
          v-model="daterangeDisinfectTime"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="消毒场所" prop="disinfectPosition">
        <el-input
          v-model="queryParams.disinfectPosition"
          placeholder="请输入消毒场所"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="消毒药名称" prop="disinfectDrug">
        <el-input
          v-model="queryParams.disinfectDrug"
          placeholder="请输入消毒药名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用药剂量" prop="drugDose">
        <el-input
          v-model="queryParams.drugDose"
          placeholder="请输入用药剂量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="消毒方法" prop="drugMethod">
        <el-input
          v-model="queryParams.drugMethod"
          placeholder="请输入消毒方法"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作员签字" prop="signOperation">
        <el-input
          v-model="queryParams.signOperation"
          placeholder="请输入操作员签字"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="用户编号" prop="userId">-->
<!--        <el-input-->
<!--          v-model="queryParams.userId"-->
<!--          placeholder="请输入用户编号"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="部门编号" prop="deptId">-->
<!--        <el-input-->
<!--          v-model="queryParams.deptId"-->
<!--          placeholder="请输入部门编号"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="创建时间">-->
<!--        <el-date-picker-->
<!--          v-model="daterangeCreatTime"-->
<!--          style="width: 240px"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          type="daterange"-->
<!--          range-separator="-"-->
<!--          start-placeholder="开始日期"-->
<!--          end-placeholder="结束日期"-->
<!--        ></el-date-picker>-->
<!--      </el-form-item>-->
<!--      <el-form-item label="更新时间">-->
<!--        <el-date-picker-->
<!--          v-model="daterangeUpdateTime"-->
<!--          style="width: 240px"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          type="daterange"-->
<!--          range-separator="-"-->
<!--          start-placeholder="开始日期"-->
<!--          end-placeholder="结束日期"-->
<!--        ></el-date-picker>-->
<!--      </el-form-item>-->
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
          v-hasPermi="['productManagement:disinfectMy:add']"
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
          v-hasPermi="['productManagement:disinfectMy:edit']"
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
          v-hasPermi="['productManagement:disinfectMy:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:disinfectMy:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="disinfectMyList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="时间" align="center" prop="disinfectTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.disinfectTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="消毒场所" align="center" prop="disinfectPosition" />
      <el-table-column label="消毒药名称" align="center" prop="disinfectDrug" />
      <el-table-column label="用药剂量" align="center" prop="drugDose" />
      <el-table-column label="消毒方法" align="center" prop="drugMethod" />
      <el-table-column label="操作员签字" align="center" prop="signOperation" />
      <el-table-column label="备注" align="center" prop="remark" />
<!--      <el-table-column label="用户编号" align="center" prop="userId" />-->
<!--      <el-table-column label="部门编号" align="center" prop="deptId" />-->
<!--      <el-table-column label="创建时间" align="center" prop="creatTime" width="180">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ parseTime(scope.row.creatTime, '{y}-{m}-{d}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->
<!--      <el-table-column label="更新时间" align="center" prop="updateTime" width="180">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ parseTime(scope.row.updateTime, '{y}-{m}-{d}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['productManagement:disinfectMy:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:disinfectMy:remove']"
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

    <!-- 添加或修改消毒记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="时间" prop="disinfectTime">
          <el-date-picker clearable
            v-model="form.disinfectTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="消毒场所" prop="disinfectPosition">
          <el-input v-model="form.disinfectPosition" placeholder="请输入消毒场所" />
        </el-form-item>
        <el-form-item label="消毒药名称" prop="disinfectDrug">
          <el-input v-model="form.disinfectDrug" placeholder="请输入消毒药名称" />
        </el-form-item>
        <el-form-item label="用药剂量" prop="drugDose">
          <el-input v-model="form.drugDose" placeholder="请输入用药剂量" />
        </el-form-item>
        <el-form-item label="消毒方法" prop="drugMethod">
          <el-input v-model="form.drugMethod" placeholder="请输入消毒方法" />
        </el-form-item>
        <el-form-item label="操作员签字" prop="signOperation">
          <el-input v-model="form.signOperation" placeholder="请输入操作员签字" />
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
<!--        <el-form-item label="用户编号" prop="userId">-->
<!--          <el-input v-model="form.userId" placeholder="请输入用户编号" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="部门编号" prop="deptId">-->
<!--          <el-input v-model="form.deptId" placeholder="请输入部门编号" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="创建时间" prop="creatTime">-->
<!--          <el-date-picker clearable-->
<!--            v-model="form.creatTime"-->
<!--            type="date"-->
<!--            value-format="yyyy-MM-dd"-->
<!--            placeholder="请选择创建时间">-->
<!--          </el-date-picker>-->
<!--        </el-form-item>-->
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listDisinfectMy, getDisinfectMy, delDisinfectMy, addDisinfectMy, updateDisinfectMy } from "@/api/productManagement/disinfectMy";

export default {
  name: "DisinfectMy",
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
      showSearch: true,
      // 总条数
      total: 0,
      // 消毒记录表格数据
      disinfectMyList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 创建时间时间范围
      daterangeDisinfectTime: [],
      // 创建时间时间范围
      daterangeCreatTime: [],
      // 创建时间时间范围
      daterangeUpdateTime: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        disinfectTime: null,
        disinfectPosition: null,
        disinfectDrug: null,
        drugDose: null,
        drugMethod: null,
        signOperation: null,
        remark: null,
        userId: null,
        deptId: null,
        creatTime: null,
        updateTime: null
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
    /** 查询消毒记录列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeDisinfectTime && '' != this.daterangeDisinfectTime) {
        this.queryParams.params["beginDisinfectTime"] = this.daterangeDisinfectTime[0];
        this.queryParams.params["endDisinfectTime"] = this.daterangeDisinfectTime[1];
      }
      if (null != this.daterangeCreatTime && '' != this.daterangeCreatTime) {
        this.queryParams.params["beginCreatTime"] = this.daterangeCreatTime[0];
        this.queryParams.params["endCreatTime"] = this.daterangeCreatTime[1];
      }
      if (null != this.daterangeUpdateTime && '' != this.daterangeUpdateTime) {
        this.queryParams.params["beginUpdateTime"] = this.daterangeUpdateTime[0];
        this.queryParams.params["endUpdateTime"] = this.daterangeUpdateTime[1];
      }
      listDisinfectMy(this.queryParams).then(response => {
        this.disinfectMyList = response.rows;
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
        disinfectTime: null,
        disinfectPosition: null,
        disinfectDrug: null,
        drugDose: null,
        drugMethod: null,
        signOperation: null,
        remark: null,
        userId: null,
        deptId: null,
        creatTime: null,
        updateTime: null
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
      this.daterangeDisinfectTime = [];
      this.daterangeCreatTime = [];
      this.daterangeUpdateTime = [];
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
      this.title = "添加消毒记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDisinfectMy(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改消毒记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDisinfectMy(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDisinfectMy(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除消毒记录编号为"' + ids + '"的数据项？').then(function() {
        return delDisinfectMy(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/disinfectMy/export', {
        ...this.queryParams
      }, `disinfectMy_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
