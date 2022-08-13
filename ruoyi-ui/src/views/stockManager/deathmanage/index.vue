<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="耳编号" prop="eartagid">
        <el-input
          v-model="queryParams.eartagid"
          placeholder="请输入耳编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="死亡时间">
        <el-date-picker
          v-model="daterangeDeathdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="体重" prop="nweight">
        <el-input
          v-model="queryParams.nweight"
          placeholder="请输入体重"
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
      <el-form-item label="毛色" prop="colour">
        <el-input
          v-model="queryParams.colour"
          placeholder="请输入毛色"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="月龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入月龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="品种" prop="category">
        <el-input
          v-model="queryParams.category"
          placeholder="请输入品种"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="因病死亡" prop="deathsick">
        <el-select v-model="queryParams.deathsick" placeholder="请选择因病死亡" clearable>
          <el-option
            v-for="dict in dict.type.cause_death"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="自然灾害" prop="disaster">
        <el-select v-model="queryParams.disaster" placeholder="请选择自然灾害" clearable>
          <el-option
            v-for="dict in dict.type.natural_disaster"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="意外死亡" prop="accident">
        <el-select v-model="queryParams.accident" placeholder="请选择意外死亡" clearable>
          <el-option
            v-for="dict in dict.type.accidental_death"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="无害化处理" prop="harmless">
        <el-select v-model="queryParams.harmless" placeholder="请选择无害化处理" clearable>
          <el-option
            v-for="dict in dict.type.Harmless_treatment"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="视频图片" prop="video">
        <el-input
          v-model="queryParams.video"
          placeholder="请输入视频图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="报险" prop="riskreporting">
        <el-input
          v-model="queryParams.riskreporting"
          placeholder="请输入报险"
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
          v-hasPermi="['stockManager:deathmanage:add']"
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
          v-hasPermi="['stockManager:deathmanage:edit']"
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
          v-hasPermi="['stockManager:deathmanage:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['stockManager:deathmanage:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="deathmanageList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="死亡时间" align="center" prop="deathdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.deathdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="体重" align="center" prop="nweight" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="毛色" align="center" prop="colour" />
      <el-table-column label="月龄" align="center" prop="age" />
      <el-table-column label="品类" align="center" prop="goattype" />
      <el-table-column label="品种" align="center" prop="category" />
      <el-table-column label="因病死亡" align="center" prop="deathsick">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.cause_death" :value="scope.row.deathsick"/>
        </template>
      </el-table-column>
      <el-table-column label="自然灾害" align="center" prop="disaster">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.natural_disaster" :value="scope.row.disaster"/>
        </template>
      </el-table-column>
      <el-table-column label="意外死亡" align="center" prop="accident">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.accidental_death" :value="scope.row.accident"/>
        </template>
      </el-table-column>
      <el-table-column label="无害化处理" align="center" prop="harmless">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.Harmless_treatment" :value="scope.row.harmless"/>
        </template>
      </el-table-column>
      <el-table-column label="视频图片" align="center" prop="video" />
      <el-table-column label="报险" align="center" prop="riskreporting" />
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
            v-hasPermi="['stockManager:deathmanage:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['stockManager:deathmanage:remove']"
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

    <!-- 添加或修改死亡管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="耳编号" prop="eartagid">
          <el-input v-model="form.eartagid" placeholder="请输入耳编号" />
        </el-form-item>
        <el-form-item label="死亡时间" prop="deathdate">
          <el-date-picker clearable
            v-model="form.deathdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择死亡时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="体重" prop="nweight">
          <el-input v-model="form.nweight" placeholder="请输入体重" />
        </el-form-item>
        <el-form-item label="栋号" prop="buildingnum">
          <el-input v-model="form.buildingnum" placeholder="请输入栋号" />
        </el-form-item>
        <el-form-item label="栏号" prop="columnnum">
          <el-input v-model="form.columnnum" placeholder="请输入栏号" />
        </el-form-item>
        <el-form-item label="毛色" prop="colour">
          <el-input v-model="form.colour" placeholder="请输入毛色" />
        </el-form-item>
        <el-form-item label="月龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入月龄" />
        </el-form-item>
        <el-form-item label="品种" prop="category">
          <el-input v-model="form.category" placeholder="请输入品种" />
        </el-form-item>
        <el-form-item label="因病死亡" prop="deathsick">
          <el-select v-model="form.deathsick" placeholder="请选择因病死亡">
            <el-option
              v-for="dict in dict.type.cause_death"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="自然灾害" prop="disaster">
          <el-select v-model="form.disaster" placeholder="请选择自然灾害">
            <el-option
              v-for="dict in dict.type.natural_disaster"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="意外死亡" prop="accident">
          <el-select v-model="form.accident" placeholder="请选择意外死亡">
            <el-option
              v-for="dict in dict.type.accidental_death"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="无害化处理" prop="harmless">
          <el-select v-model="form.harmless" placeholder="请选择无害化处理">
            <el-option
              v-for="dict in dict.type.Harmless_treatment"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="视频图片" prop="video">
          <el-input v-model="form.video" placeholder="请输入视频图片" />
        </el-form-item>
        <el-form-item label="报险" prop="riskreporting">
          <el-input v-model="form.riskreporting" placeholder="请输入报险" />
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
import { listDeathmanage, getDeathmanage, delDeathmanage, addDeathmanage, updateDeathmanage } from "@/api/stockManager/deathmanage";

export default {
  name: "Deathmanage",
  dicts: ['accidental_death', 'Harmless_treatment', 'cause_death', 'natural_disaster'],
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
      // 死亡管理表格数据
      deathmanageList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeDeathdate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        eartagid: null,
        deathdate: null,
        nweight: null,
        buildingnum: null,
        columnnum: null,
        colour: null,
        age: null,
        goattype: null,
        category: null,
        deathsick: null,
        disaster: null,
        accident: null,
        harmless: null,
        video: null,
        riskreporting: null,
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
    /** 查询死亡管理列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeDeathdate && '' != this.daterangeDeathdate) {
        this.queryParams.params["beginDeathdate"] = this.daterangeDeathdate[0];
        this.queryParams.params["endDeathdate"] = this.daterangeDeathdate[1];
      }
      listDeathmanage(this.queryParams).then(response => {
        this.deathmanageList = response.rows;
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
        eartagid: null,
        deathdate: null,
        nweight: null,
        buildingnum: null,
        columnnum: null,
        colour: null,
        age: null,
        goattype: null,
        category: null,
        deathsick: null,
        disaster: null,
        accident: null,
        harmless: null,
        video: null,
        riskreporting: null,
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
      this.daterangeDeathdate = [];
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
      this.title = "添加死亡管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDeathmanage(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改死亡管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDeathmanage(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDeathmanage(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除死亡管理编号为"' + ids + '"的数据项？').then(function() {
        return delDeathmanage(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('stockManager/deathmanage/export', {
        ...this.queryParams
      }, `deathmanage_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
