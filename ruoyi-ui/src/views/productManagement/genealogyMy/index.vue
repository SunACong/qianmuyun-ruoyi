<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="品种" prop="sheepType">
        <el-input
          v-model="queryParams.sheepType"
          placeholder="请输入品种"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="耳标号" prop="sheepNumber">
        <el-input
          v-model="queryParams.sheepNumber"
          placeholder="请输入耳标号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="sex">
        <el-input
          v-model="queryParams.sex"
          placeholder="请输入性别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出生日期">
        <el-date-picker
          v-model="daterangeBornTime"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="同胞数" prop="number">
        <el-input
          v-model="queryParams.number"
          placeholder="请输入同胞数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="胎次" prop="bornNumber">
        <el-input
          v-model="queryParams.bornNumber"
          placeholder="请输入胎次"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="级别" prop="rankm">
        <el-input
          v-model="queryParams.rankm"
          placeholder="请输入级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出场日期">
        <el-date-picker
          v-model="daterangeOutTime"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="出场体重" prop="outKg">
        <el-input
          v-model="queryParams.outKg"
          placeholder="请输入出场体重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="父号" prop="fatherNumber">
        <el-input
          v-model="queryParams.fatherNumber"
          placeholder="请输入父号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="父父号" prop="ffatherNumber">
        <el-input
          v-model="queryParams.ffatherNumber"
          placeholder="请输入父父号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="父母号" prop="fmotherNumber">
        <el-input
          v-model="queryParams.fmotherNumber"
          placeholder="请输入父母号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="母号" prop="motherNumber">
        <el-input
          v-model="queryParams.motherNumber"
          placeholder="请输入母号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="母父号" prop="mfatherNumber">
        <el-input
          v-model="queryParams.mfatherNumber"
          placeholder="请输入母父号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="母母号" prop="mmotherNumber">
        <el-input
          v-model="queryParams.mmotherNumber"
          placeholder="请输入母母号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="年龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入年龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="体重" prop="kHeavy">
        <el-input
          v-model="queryParams.kHeavy"
          placeholder="请输入体重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="体高" prop="kHeight">
        <el-input
          v-model="queryParams.kHeight"
          placeholder="请输入体高"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="体长" prop="kLong">
        <el-input
          v-model="queryParams.kLong"
          placeholder="请输入体长"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="胸围" prop="kChest">
        <el-input
          v-model="queryParams.kChest"
          placeholder="请输入胸围"
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
          v-hasPermi="['productManagement:genealogyMy:add']"
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
          v-hasPermi="['productManagement:genealogyMy:edit']"
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
          v-hasPermi="['productManagement:genealogyMy:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:genealogyMy:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="genealogyMyList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="品种" align="center" prop="sheepType" />
      <el-table-column label="耳标号" align="center" prop="sheepNumber" />
      <el-table-column label="性别" align="center" prop="sex" />
      <el-table-column label="出生日期" align="center" prop="bornTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.bornTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="同胞数" align="center" prop="number" />
      <el-table-column label="胎次" align="center" prop="bornNumber" />
      <el-table-column label="级别" align="center" prop="rankm" />
      <el-table-column label="出场日期" align="center" prop="outTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.outTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="出场体重" align="center" prop="outKg" />
      <el-table-column label="父号" align="center" prop="fatherNumber" />
      <el-table-column label="父父号" align="center" prop="ffatherNumber" />
      <el-table-column label="父母号" align="center" prop="fmotherNumber" />
      <el-table-column label="母号" align="center" prop="motherNumber" />
      <el-table-column label="母父号" align="center" prop="mfatherNumber" />
      <el-table-column label="母母号" align="center" prop="mmotherNumber" />
      <el-table-column label="年龄" align="center" prop="age" />
      <el-table-column label="体重" align="center" prop="kHeavy" />
      <el-table-column label="体高" align="center" prop="kHeight" />
      <el-table-column label="体长" align="center" prop="kLong" />
      <el-table-column label="胸围" align="center" prop="kChest" />
      <el-table-column label="图片" align="center" prop="picture" />
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
            v-hasPermi="['productManagement:genealogyMy:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:genealogyMy:remove']"
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

    <!-- 添加或修改系谱记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="品种" prop="sheepType">
          <el-input v-model="form.sheepType" placeholder="请输入品种" />
        </el-form-item>
        <el-form-item label="耳标号" prop="sheepNumber">
          <el-input v-model="form.sheepNumber" placeholder="请输入耳标号" />
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-input v-model="form.sex" placeholder="请输入性别" />
        </el-form-item>
        <el-form-item label="出生日期" prop="bornTime">
          <el-date-picker clearable
            v-model="form.bornTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择出生日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="同胞数" prop="number">
          <el-input v-model="form.number" placeholder="请输入同胞数" />
        </el-form-item>
        <el-form-item label="胎次" prop="bornNumber">
          <el-input v-model="form.bornNumber" placeholder="请输入胎次" />
        </el-form-item>
        <el-form-item label="级别" prop="rankm">
          <el-input v-model="form.rankm" placeholder="请输入级别" />
        </el-form-item>
        <el-form-item label="出场日期" prop="outTime">
          <el-date-picker clearable
            v-model="form.outTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择出场日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="出场体重" prop="outKg">
          <el-input v-model="form.outKg" placeholder="请输入出场体重" />
        </el-form-item>
        <el-form-item label="父号" prop="fatherNumber">
          <el-input v-model="form.fatherNumber" placeholder="请输入父号" />
        </el-form-item>
        <el-form-item label="父父号" prop="ffatherNumber">
          <el-input v-model="form.ffatherNumber" placeholder="请输入父父号" />
        </el-form-item>
        <el-form-item label="父母号" prop="fmotherNumber">
          <el-input v-model="form.fmotherNumber" placeholder="请输入父母号" />
        </el-form-item>
        <el-form-item label="母号" prop="motherNumber">
          <el-input v-model="form.motherNumber" placeholder="请输入母号" />
        </el-form-item>
        <el-form-item label="母父号" prop="mfatherNumber">
          <el-input v-model="form.mfatherNumber" placeholder="请输入母父号" />
        </el-form-item>
        <el-form-item label="母母号" prop="mmotherNumber">
          <el-input v-model="form.mmotherNumber" placeholder="请输入母母号" />
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入年龄" />
        </el-form-item>
        <el-form-item label="体重" prop="kHeavy">
          <el-input v-model="form.kHeavy" placeholder="请输入体重" />
        </el-form-item>
        <el-form-item label="体高" prop="kHeight">
          <el-input v-model="form.kHeight" placeholder="请输入体高" />
        </el-form-item>
        <el-form-item label="体长" prop="kLong">
          <el-input v-model="form.kLong" placeholder="请输入体长" />
        </el-form-item>
        <el-form-item label="胸围" prop="kChest">
          <el-input v-model="form.kChest" placeholder="请输入胸围" />
        </el-form-item>
        <el-form-item label="图片" prop="picture">
          <el-input v-model="form.picture" type="textarea" placeholder="请输入内容" />
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
import { listGenealogyMy, getGenealogyMy, delGenealogyMy, addGenealogyMy, updateGenealogyMy } from "@/api/productManagement/genealogyMy";

export default {
  name: "GenealogyMy",
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
      // 系谱记录表格数据
      genealogyMyList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 创建时间时间范围
      daterangeBornTime: [],
      // 创建时间时间范围
      daterangeOutTime: [],
      // 创建时间时间范围
      daterangeCreatTime: [],
      // 创建时间时间范围
      daterangeUpdateTime: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        sheepType: null,
        sheepNumber: null,
        sex: null,
        bornTime: null,
        number: null,
        bornNumber: null,
        rankm: null,
        outTime: null,
        outKg: null,
        fatherNumber: null,
        ffatherNumber: null,
        fmotherNumber: null,
        motherNumber: null,
        mfatherNumber: null,
        mmotherNumber: null,
        age: null,
        kHeavy: null,
        kHeight: null,
        kLong: null,
        kChest: null,
        picture: null,
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
    /** 查询系谱记录列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeBornTime && '' != this.daterangeBornTime) {
        this.queryParams.params["beginBornTime"] = this.daterangeBornTime[0];
        this.queryParams.params["endBornTime"] = this.daterangeBornTime[1];
      }
      if (null != this.daterangeOutTime && '' != this.daterangeOutTime) {
        this.queryParams.params["beginOutTime"] = this.daterangeOutTime[0];
        this.queryParams.params["endOutTime"] = this.daterangeOutTime[1];
      }
      if (null != this.daterangeCreatTime && '' != this.daterangeCreatTime) {
        this.queryParams.params["beginCreatTime"] = this.daterangeCreatTime[0];
        this.queryParams.params["endCreatTime"] = this.daterangeCreatTime[1];
      }
      if (null != this.daterangeUpdateTime && '' != this.daterangeUpdateTime) {
        this.queryParams.params["beginUpdateTime"] = this.daterangeUpdateTime[0];
        this.queryParams.params["endUpdateTime"] = this.daterangeUpdateTime[1];
      }
      listGenealogyMy(this.queryParams).then(response => {
        this.genealogyMyList = response.rows;
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
        sheepType: null,
        sheepNumber: null,
        sex: null,
        bornTime: null,
        number: null,
        bornNumber: null,
        rankm: null,
        outTime: null,
        outKg: null,
        fatherNumber: null,
        ffatherNumber: null,
        fmotherNumber: null,
        motherNumber: null,
        mfatherNumber: null,
        mmotherNumber: null,
        age: null,
        kHeavy: null,
        kHeight: null,
        kLong: null,
        kChest: null,
        picture: null,
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
      this.daterangeBornTime = [];
      this.daterangeOutTime = [];
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
      this.title = "添加系谱记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getGenealogyMy(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改系谱记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateGenealogyMy(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGenealogyMy(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除系谱记录编号为"' + ids + '"的数据项？').then(function() {
        return delGenealogyMy(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/genealogyMy/export', {
        ...this.queryParams
      }, `genealogyMy_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
