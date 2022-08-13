<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="种公羊数量" prop="man">
        <el-input
          v-model="queryParams.man"
          placeholder="请输入种公羊数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="种公羊总存栏" prop="mantotal">
        <el-input
          v-model="queryParams.mantotal"
          placeholder="请输入种公羊总存栏"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="种公羊可售出" prop="mansale">
        <el-input
          v-model="queryParams.mansale"
          placeholder="请输入种公羊可售出"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="种母羊数量" prop="women">
        <el-input
          v-model="queryParams.women"
          placeholder="请输入种母羊数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="种母羊总存栏" prop="womentotal">
        <el-input
          v-model="queryParams.womentotal"
          placeholder="请输入种母羊总存栏"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="种母羊可售出" prop="womensale">
        <el-input
          v-model="queryParams.womensale"
          placeholder="请输入种母羊可售出"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品羊数量" prop="salesheep">
        <el-input
          v-model="queryParams.salesheep"
          placeholder="请输入商品羊数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品羊总存栏" prop="salesheeptotal">
        <el-input
          v-model="queryParams.salesheeptotal"
          placeholder="请输入商品羊总存栏"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品羊可售出" prop="salesheepsale">
        <el-input
          v-model="queryParams.salesheepsale"
          placeholder="请输入商品羊可售出"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出售量" prop="ablesale">
        <el-input
          v-model="queryParams.ablesale"
          placeholder="请输入出售量"
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
          v-hasPermi="['deal:deal_left_3:add']"
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
          v-hasPermi="['deal:deal_left_3:edit']"
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
          v-hasPermi="['deal:deal_left_3:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['deal:deal_left_3:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="deal_left_3List" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键ID无意义" align="center" prop="id" />
      <el-table-column label="种公羊数量" align="center" prop="man" />
      <el-table-column label="种公羊总存栏" align="center" prop="mantotal" />
      <el-table-column label="种公羊可售出" align="center" prop="mansale" />
      <el-table-column label="种母羊数量" align="center" prop="women" />
      <el-table-column label="种母羊总存栏" align="center" prop="womentotal" />
      <el-table-column label="种母羊可售出" align="center" prop="womensale" />
      <el-table-column label="商品羊数量" align="center" prop="salesheep" />
      <el-table-column label="商品羊总存栏" align="center" prop="salesheeptotal" />
      <el-table-column label="商品羊可售出" align="center" prop="salesheepsale" />
      <el-table-column label="出售量" align="center" prop="ablesale" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['deal:deal_left_3:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['deal:deal_left_3:remove']"
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

    <!-- 添加或修改左 3对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="种公羊数量" prop="man">
          <el-input v-model="form.man" placeholder="请输入种公羊数量" />
        </el-form-item>
        <el-form-item label="种公羊总存栏" prop="mantotal">
          <el-input v-model="form.mantotal" placeholder="请输入种公羊总存栏" />
        </el-form-item>
        <el-form-item label="种公羊可售出" prop="mansale">
          <el-input v-model="form.mansale" placeholder="请输入种公羊可售出" />
        </el-form-item>
        <el-form-item label="种母羊数量" prop="women">
          <el-input v-model="form.women" placeholder="请输入种母羊数量" />
        </el-form-item>
        <el-form-item label="种母羊总存栏" prop="womentotal">
          <el-input v-model="form.womentotal" placeholder="请输入种母羊总存栏" />
        </el-form-item>
        <el-form-item label="种母羊可售出" prop="womensale">
          <el-input v-model="form.womensale" placeholder="请输入种母羊可售出" />
        </el-form-item>
        <el-form-item label="商品羊数量" prop="salesheep">
          <el-input v-model="form.salesheep" placeholder="请输入商品羊数量" />
        </el-form-item>
        <el-form-item label="商品羊总存栏" prop="salesheeptotal">
          <el-input v-model="form.salesheeptotal" placeholder="请输入商品羊总存栏" />
        </el-form-item>
        <el-form-item label="商品羊可售出" prop="salesheepsale">
          <el-input v-model="form.salesheepsale" placeholder="请输入商品羊可售出" />
        </el-form-item>
        <el-form-item label="出售量" prop="ablesale">
          <el-input v-model="form.ablesale" placeholder="请输入出售量" />
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
import { listDeal_left_3, getDeal_left_3, delDeal_left_3, addDeal_left_3, updateDeal_left_3 } from "@/api/deal/deal_left_3";

export default {
  name: "Deal_left_3",
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
      // 左 3表格数据
      deal_left_3List: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        man: null,
        mantotal: null,
        mansale: null,
        women: null,
        womentotal: null,
        womensale: null,
        salesheep: null,
        salesheeptotal: null,
        salesheepsale: null,
        ablesale: null
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
    /** 查询左 3列表 */
    getList() {
      this.loading = true;
      listDeal_left_3(this.queryParams).then(response => {
        this.deal_left_3List = response.rows;
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
        man: null,
        mantotal: null,
        mansale: null,
        women: null,
        womentotal: null,
        womensale: null,
        salesheep: null,
        salesheeptotal: null,
        salesheepsale: null,
        ablesale: null
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
      this.title = "添加左 3";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDeal_left_3(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改左 3";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDeal_left_3(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDeal_left_3(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除左 3编号为"' + ids + '"的数据项？').then(function() {
        return delDeal_left_3(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('deal/deal_left_3/export', {
        ...this.queryParams
      }, `deal_left_3_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
