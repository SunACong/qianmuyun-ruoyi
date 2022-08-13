<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="圈舍号" prop="enclosure">
        <el-input
          v-model="queryParams.enclosure"
          placeholder="请输入圈舍号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="时间">
        <el-date-picker
          v-model="daterangeProductTime"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="出生" prop="born">
        <el-input
          v-model="queryParams.born"
          placeholder="请输入出生"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="调入" prop="transferIn">
        <el-input
          v-model="queryParams.transferIn"
          placeholder="请输入调入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="调出" prop="transferOut">
        <el-input
          v-model="queryParams.transferOut"
          placeholder="请输入调出"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="死亡" prop="death">
        <el-input
          v-model="queryParams.death"
          placeholder="请输入死亡"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="存栏数量" prop="number">
        <el-input
          v-model="queryParams.number"
          placeholder="请输入存栏数量"
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
          v-hasPermi="['productManagement:productrecordMy:add']"
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
          v-hasPermi="['productManagement:productrecordMy:edit']"
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
          v-hasPermi="['productManagement:productrecordMy:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:productrecordMy:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="productrecordMyList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="圈舍号" align="center" prop="enclosure" />
      <el-table-column label="时间" align="center" prop="productTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.productTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="出生" align="center" prop="born" />
      <el-table-column label="调入" align="center" prop="transferIn" />
      <el-table-column label="调出" align="center" prop="transferOut" />
      <el-table-column label="死亡" align="center" prop="death" />
      <el-table-column label="存栏数量" align="center" prop="number" />
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
            v-hasPermi="['productManagement:productrecordMy:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:productrecordMy:remove']"
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

    <!-- 添加或修改生产记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="圈舍号" prop="enclosure">
          <el-input v-model="form.enclosure" placeholder="请输入圈舍号" />
        </el-form-item>
        <el-form-item label="时间" prop="productTime">
          <el-date-picker clearable
            v-model="form.productTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="出生" prop="born">
          <el-input v-model="form.born" placeholder="请输入出生" />
        </el-form-item>
        <el-form-item label="调入" prop="transferIn">
          <el-input v-model="form.transferIn" placeholder="请输入调入" />
        </el-form-item>
        <el-form-item label="调出" prop="transferOut">
          <el-input v-model="form.transferOut" placeholder="请输入调出" />
        </el-form-item>
        <el-form-item label="死亡" prop="death">
          <el-input v-model="form.death" placeholder="请输入死亡" />
        </el-form-item>
        <el-form-item label="存栏数量" prop="number">
          <el-input v-model="form.number" placeholder="请输入存栏数量" />
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
import { listProductrecordMy, getProductrecordMy, delProductrecordMy, addProductrecordMy, updateProductrecordMy } from "@/api/productManagement/productrecordMy";

export default {
  name: "ProductrecordMy",
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
      // 生产记录表格数据
      productrecordMyList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 创建时间时间范围
      daterangeProductTime: [],
      // 创建时间时间范围
      daterangeCreatTime: [],
      // 创建时间时间范围
      daterangeUpdateTime: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        enclosure: null,
        productTime: null,
        born: null,
        transferIn: null,
        transferOut: null,
        death: null,
        number: null,
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
    /** 查询生产记录列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeProductTime && '' != this.daterangeProductTime) {
        this.queryParams.params["beginProductTime"] = this.daterangeProductTime[0];
        this.queryParams.params["endProductTime"] = this.daterangeProductTime[1];
      }
      if (null != this.daterangeCreatTime && '' != this.daterangeCreatTime) {
        this.queryParams.params["beginCreatTime"] = this.daterangeCreatTime[0];
        this.queryParams.params["endCreatTime"] = this.daterangeCreatTime[1];
      }
      if (null != this.daterangeUpdateTime && '' != this.daterangeUpdateTime) {
        this.queryParams.params["beginUpdateTime"] = this.daterangeUpdateTime[0];
        this.queryParams.params["endUpdateTime"] = this.daterangeUpdateTime[1];
      }
      listProductrecordMy(this.queryParams).then(response => {
        this.productrecordMyList = response.rows;
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
        enclosure: null,
        productTime: null,
        born: null,
        transferIn: null,
        transferOut: null,
        death: null,
        number: null,
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
      this.daterangeProductTime = [];
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
      this.title = "添加生产记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getProductrecordMy(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改生产记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateProductrecordMy(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addProductrecordMy(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除生产记录编号为"' + ids + '"的数据项？').then(function() {
        return delProductrecordMy(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/productrecordMy/export', {
        ...this.queryParams
      }, `productrecordMy_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
