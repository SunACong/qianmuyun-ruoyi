<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="出售时间">
        <el-date-picker
          v-model="daterangeSelldate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="耳编号" prop="eartagid">
        <el-input
          v-model="queryParams.eartagid"
          placeholder="请输入耳编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
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
      <el-form-item label="生日">
        <el-date-picker
          v-model="daterangeBirthdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="月龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入月龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="体重" prop="nweight">
        <el-input
          v-model="queryParams.nweight"
          placeholder="请输入体重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="毛色" prop="colour">
        <el-input
          v-model="queryParams.colour"
          placeholder="请输入毛色"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="等级" prop="rankm">
        <el-input
          v-model="queryParams.rankm"
          placeholder="请输入等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="购买单位" prop="unit">
        <el-input
          v-model="queryParams.unit"
          placeholder="请输入购买单位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单号" prop="ordernum">
        <el-input
          v-model="queryParams.ordernum"
          placeholder="请输入订单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="采购数量" prop="purchasenum">
        <el-input
          v-model="queryParams.purchasenum"
          placeholder="请输入采购数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="预留1" prop="bak1">-->
<!--        <el-input-->
<!--          v-model="queryParams.bak1"-->
<!--          placeholder="请输入预留1"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="预留2" prop="bak2">-->
<!--        <el-input-->
<!--          v-model="queryParams.bak2"-->
<!--          placeholder="请输入预留2"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="预留3" prop="bak3">-->
<!--        <el-input-->
<!--          v-model="queryParams.bak3"-->
<!--          placeholder="请输入预留3"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="创建时间">-->
<!--        <el-date-picker-->
<!--          v-model="daterangeCreateDate"-->
<!--          style="width: 240px"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          type="daterange"-->
<!--          range-separator="-"-->
<!--          start-placeholder="开始日期"-->
<!--          end-placeholder="结束日期"-->
<!--        ></el-date-picker>-->
<!--      </el-form-item>-->
<!--      <el-form-item label="更新者" prop="updateBy">-->
<!--        <el-input-->
<!--          v-model="queryParams.updateBy"-->
<!--          placeholder="请输入更新者"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="更新时间">-->
<!--        <el-date-picker-->
<!--          v-model="daterangeUpdateDate"-->
<!--          style="width: 240px"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          type="daterange"-->
<!--          range-separator="-"-->
<!--          start-placeholder="开始日期"-->
<!--          end-placeholder="结束日期"-->
<!--        ></el-date-picker>-->
<!--      </el-form-item>-->
      <el-form-item label="备注信息" prop="remarks">
        <el-input
          v-model="queryParams.remarks"
          placeholder="请输入备注信息"
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
          v-hasPermi="['stockManager:goatsell:add']"
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
          v-hasPermi="['stockManager:goatsell:edit']"
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
          v-hasPermi="['stockManager:goatsell:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['stockManager:goatsell:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="goatsellList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="出售时间" align="center" prop="selldate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.selldate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="生日" align="center" prop="birthdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.birthdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="品类" align="center" prop="goattype" />
      <el-table-column label="月龄" align="center" prop="age" />
      <el-table-column label="体重" align="center" prop="nweight" />
      <el-table-column label="毛色" align="center" prop="colour" />
      <el-table-column label="等级" align="center" prop="rankm" />
      <el-table-column label="购买单位" align="center" prop="unit" />
      <el-table-column label="订单号" align="center" prop="ordernum" />
      <el-table-column label="采购数量" align="center" prop="purchasenum" />
<!--      <el-table-column label="预留1" align="center" prop="bak1" />-->
<!--      <el-table-column label="预留2" align="center" prop="bak2" />-->
<!--      <el-table-column label="预留3" align="center" prop="bak3" />-->
<!--      <el-table-column label="创建时间" align="center" prop="createDate" width="180">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ parseTime(scope.row.createDate, '{y}-{m}-{d}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->
<!--      <el-table-column label="更新者" align="center" prop="updateBy" />-->
<!--      <el-table-column label="更新时间" align="center" prop="updateDate" width="180">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ parseTime(scope.row.updateDate, '{y}-{m}-{d}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->
      <el-table-column label="备注信息" align="center" prop="remarks" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['stockManager:goatsell:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['stockManager:goatsell:remove']"
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

    <!-- 添加或修改出售管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="出售时间" prop="selldate">
          <el-date-picker clearable
            v-model="form.selldate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择出售时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="耳编号" prop="eartagid">
          <el-input v-model="form.eartagid" placeholder="请输入耳编号" />
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
        <el-form-item label="生日" prop="birthdate">
          <el-date-picker clearable
            v-model="form.birthdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择生日">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="月龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入月龄" />
        </el-form-item>
        <el-form-item label="体重" prop="nweight">
          <el-input v-model="form.nweight" placeholder="请输入体重" />
        </el-form-item>
        <el-form-item label="毛色" prop="colour">
          <el-input v-model="form.colour" placeholder="请输入毛色" />
        </el-form-item>
        <el-form-item label="等级" prop="rankm">
          <el-input v-model="form.rankm" placeholder="请输入等级" />
        </el-form-item>
        <el-form-item label="购买单位" prop="unit">
          <el-input v-model="form.unit" placeholder="请输入购买单位" />
        </el-form-item>
        <el-form-item label="订单号" prop="ordernum">
          <el-input v-model="form.ordernum" placeholder="请输入订单号" />
        </el-form-item>
        <el-form-item label="采购数量" prop="purchasenum">
          <el-input v-model="form.purchasenum" placeholder="请输入采购数量" />
        </el-form-item>
<!--        <el-form-item label="预留1" prop="bak1">-->
<!--          <el-input v-model="form.bak1" placeholder="请输入预留1" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="预留2" prop="bak2">-->
<!--          <el-input v-model="form.bak2" placeholder="请输入预留2" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="预留3" prop="bak3">-->
<!--          <el-input v-model="form.bak3" placeholder="请输入预留3" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="创建时间" prop="createDate">-->
<!--          <el-date-picker clearable-->
<!--            v-model="form.createDate"-->
<!--            type="date"-->
<!--            value-format="yyyy-MM-dd"-->
<!--            placeholder="请选择创建时间">-->
<!--          </el-date-picker>-->
<!--        </el-form-item>-->
<!--        <el-form-item label="更新时间" prop="updateDate">-->
<!--          <el-date-picker clearable-->
<!--            v-model="form.updateDate"-->
<!--            type="date"-->
<!--            value-format="yyyy-MM-dd"-->
<!--            placeholder="请选择更新时间">-->
<!--          </el-date-picker>-->
<!--        </el-form-item>-->
        <el-form-item label="备注信息" prop="remarks">
          <el-input v-model="form.remarks" placeholder="请输入备注信息" />
        </el-form-item>
<!--        <el-form-item label="逻辑删除标记" prop="delFlag">-->
<!--          <el-input v-model="form.delFlag" placeholder="请输入逻辑删除标记" />-->
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
import { listGoatsell, getGoatsell, delGoatsell, addGoatsell, updateGoatsell } from "@/api/stockManager/goatsell";

export default {
  name: "Goatsell",
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
      // 出售管理表格数据
      goatsellList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 逻辑删除标记时间范围
      daterangeSelldate: [],
      // 逻辑删除标记时间范围
      daterangeBirthdate: [],
      // 逻辑删除标记时间范围
      daterangeCreateDate: [],
      // 逻辑删除标记时间范围
      daterangeUpdateDate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        selldate: null,
        eartagid: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        birthdate: null,
        goattype: null,
        age: null,
        nweight: null,
        colour: null,
        rankm: null,
        unit: null,
        ordernum: null,
        purchasenum: null,
        bak1: null,
        bak2: null,
        bak3: null,
        createDate: null,
        updateBy: null,
        updateDate: null,
        remarks: null,
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
    /** 查询出售管理列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeSelldate && '' != this.daterangeSelldate) {
        this.queryParams.params["beginSelldate"] = this.daterangeSelldate[0];
        this.queryParams.params["endSelldate"] = this.daterangeSelldate[1];
      }
      if (null != this.daterangeBirthdate && '' != this.daterangeBirthdate) {
        this.queryParams.params["beginBirthdate"] = this.daterangeBirthdate[0];
        this.queryParams.params["endBirthdate"] = this.daterangeBirthdate[1];
      }
      if (null != this.daterangeCreateDate && '' != this.daterangeCreateDate) {
        this.queryParams.params["beginCreateDate"] = this.daterangeCreateDate[0];
        this.queryParams.params["endCreateDate"] = this.daterangeCreateDate[1];
      }
      if (null != this.daterangeUpdateDate && '' != this.daterangeUpdateDate) {
        this.queryParams.params["beginUpdateDate"] = this.daterangeUpdateDate[0];
        this.queryParams.params["endUpdateDate"] = this.daterangeUpdateDate[1];
      }
      listGoatsell(this.queryParams).then(response => {
        this.goatsellList = response.rows;
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
        selldate: null,
        eartagid: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        birthdate: null,
        goattype: null,
        age: null,
        nweight: null,
        colour: null,
        rankm: null,
        unit: null,
        ordernum: null,
        purchasenum: null,
        bak1: null,
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
      this.daterangeSelldate = [];
      this.daterangeBirthdate = [];
      this.daterangeCreateDate = [];
      this.daterangeUpdateDate = [];
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
      this.title = "添加出售管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getGoatsell(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改出售管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateGoatsell(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGoatsell(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除出售管理编号为"' + ids + '"的数据项？').then(function() {
        return delGoatsell(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('stockManager/goatsell/export', {
        ...this.queryParams
      }, `goatsell_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
