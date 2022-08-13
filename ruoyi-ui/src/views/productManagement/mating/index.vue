<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="配种时间" prop="matingdate">
        <el-date-picker clearable
          v-model="queryParams.matingdate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择配种时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="母羊编号" prop="femaleid">
        <el-input
          v-model="queryParams.femaleid"
          placeholder="请输入母羊编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="公羊编号" prop="maleid">
        <el-input
          v-model="queryParams.maleid"
          placeholder="请输入公羊编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生产时间">
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
          v-hasPermi="['productManagement:mating:add']"
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
          v-hasPermi="['productManagement:mating:edit']"
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
          v-hasPermi="['productManagement:mating:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:mating:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="matingList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="配种时间" align="center" prop="matingdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.matingdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="母羊编号" align="center" prop="femaleid" />
      <el-table-column label="公羊编号" align="center" prop="maleid" />
      <el-table-column label="近亲测定" align="center" prop="nrelation" />
      <el-table-column label="母羊场区" align="center" prop="region" />
      <el-table-column label="母羊栋号" align="center" prop="buildingnum" />
      <el-table-column label="母羊栏号" align="center" prop="columnnum" />
      <el-table-column label="孕检情况" align="center" prop="matingmode" />
      <el-table-column label="检查结果" align="center" prop="birthmode" />
      <el-table-column label="流产原因" align="center" prop="abortionreason" />
      <el-table-column label="羔羊场区" align="center" prop="newregion" />
      <el-table-column label="羔羊栋号" align="center" prop="newbuilding" />
      <el-table-column label="羔羊栏号" align="center" prop="newcolumn" />
      <el-table-column label="配种方式" align="center" prop="method">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.mating_way" :value="scope.row.method"/>
        </template>
      </el-table-column>
      <el-table-column label="生产时间" align="center" prop="birthdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.birthdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="产子数" align="center" prop="birthnum" />
      <el-table-column label="公羔数" align="center" prop="birthmale" />
      <el-table-column label="母羔数" align="center" prop="birthfemale" />
      <el-table-column label="胎次" align="center" prop="parity" />
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
            v-hasPermi="['productManagement:mating:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:mating:remove']"
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

    <!-- 添加或修改配种档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="配种时间" prop="matingdate">
          <el-date-picker clearable
            v-model="form.matingdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择配种时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="母羊编号" prop="femaleid">
          <el-input v-model="form.femaleid" placeholder="请输入母羊编号" />
        </el-form-item>
        <el-form-item label="公羊编号" prop="maleid">
          <el-input v-model="form.maleid" placeholder="请输入公羊编号" />
        </el-form-item>
        <el-form-item label="近亲测定" prop="nrelation">
          <el-input v-model="form.nrelation" placeholder="请输入近亲测定" />
        </el-form-item>
        <el-form-item label="母羊场区" prop="region">
          <el-input v-model="form.region" placeholder="请输入母羊场区" />
        </el-form-item>
        <el-form-item label="母羊栋号" prop="buildingnum">
          <el-input v-model="form.buildingnum" placeholder="请输入母羊栋号" />
        </el-form-item>
        <el-form-item label="母羊栏号" prop="columnnum">
          <el-input v-model="form.columnnum" placeholder="请输入母羊栏号" />
        </el-form-item>
        <el-form-item label="孕检情况" prop="matingmode">
          <el-input v-model="form.matingmode" placeholder="请输入孕检情况" />
        </el-form-item>
        <el-form-item label="检查结果" prop="birthmode">
          <el-input v-model="form.birthmode" placeholder="请输入检查结果" />
        </el-form-item>
        <el-form-item label="流产原因" prop="abortionreason">
          <el-input v-model="form.abortionreason" placeholder="请输入流产原因" />
        </el-form-item>
        <el-form-item label="羔羊场区" prop="newregion">
          <el-input v-model="form.newregion" placeholder="请输入羔羊场区" />
        </el-form-item>
        <el-form-item label="羔羊栋号" prop="newbuilding">
          <el-input v-model="form.newbuilding" placeholder="请输入羔羊栋号" />
        </el-form-item>
        <el-form-item label="羔羊栏号" prop="newcolumn">
          <el-input v-model="form.newcolumn" placeholder="请输入羔羊栏号" />
        </el-form-item>
        <el-form-item label="配种方式" prop="method">
          <el-select v-model="form.method" placeholder="请选择配种方式">
            <el-option
              v-for="dict in dict.type.mating_way"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="生产时间" prop="birthdate">
          <el-date-picker clearable
            v-model="form.birthdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择生产时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="产子数" prop="birthnum">
          <el-input v-model="form.birthnum" placeholder="请输入产子数" />
        </el-form-item>
        <el-form-item label="公羔数" prop="birthmale">
          <el-input v-model="form.birthmale" placeholder="请输入公羔数" />
        </el-form-item>
        <el-form-item label="母羔数" prop="birthfemale">
          <el-input v-model="form.birthfemale" placeholder="请输入母羔数" />
        </el-form-item>
        <el-form-item label="胎次" prop="parity">
          <el-input v-model="form.parity" placeholder="请输入胎次" />
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
import { listMating, getMating, delMating, addMating, updateMating } from "@/api/productManagement/mating";

export default {
  name: "Mating",
  dicts: ['sys_yes_no', 'mating_way'],
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
      // 配种档案表格数据
      matingList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeBirthdate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        matingdate: null,
        femaleid: null,
        maleid: null,
        birthdate: null,
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
    /** 查询配种档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeBirthdate && '' != this.daterangeBirthdate) {
        this.queryParams.params["beginBirthdate"] = this.daterangeBirthdate[0];
        this.queryParams.params["endBirthdate"] = this.daterangeBirthdate[1];
      }
      listMating(this.queryParams).then(response => {
        this.matingList = response.rows;
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
        matingdate: null,
        femaleid: null,
        maleid: null,
        nrelation: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        matingmode: null,
        birthmode: null,
        abortionreason: null,
        newregion: null,
        newbuilding: null,
        newcolumn: null,
        method: null,
        birthdate: null,
        birthnum: null,
        birthmale: null,
        birthfemale: null,
        parity: null,
        bak1: "0",
        bak2: null,
        bak3: null,
        createBy: null,
        createDate: null,
        remarks: null,
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
      this.daterangeBirthdate = [];
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
      this.title = "添加配种档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getMating(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改配种档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateMating(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addMating(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除配种档案编号为"' + ids + '"的数据项？').then(function() {
        return delMating(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/mating/export', {
        ...this.queryParams
      }, `mating_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
