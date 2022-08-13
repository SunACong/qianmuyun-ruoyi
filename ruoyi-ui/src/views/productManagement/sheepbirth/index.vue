<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
<!--      <el-form-item label="外键" prop="matingid">-->
<!--        <el-input-->
<!--          v-model="queryParams.matingid"-->
<!--          placeholder="请输入外键"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item label="耳编号" prop="eartagid">
        <el-input
          v-model="queryParams.eartagid"
          placeholder="请输入耳编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="母耳标" prop="motherid">
        <el-input
          v-model="queryParams.motherid"
          placeholder="请输入母耳标"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="父耳标" prop="fatherid">
        <el-input
          v-model="queryParams.fatherid"
          placeholder="请输入父耳标"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="sex">
        <el-select v-model="queryParams.sex" placeholder="请选择性别" clearable>
          <el-option
            v-for="dict in dict.type.sys_user_sex"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="毛色" prop="colour">
        <el-input
          v-model="queryParams.colour"
          placeholder="请输入毛色"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出生重" prop="birthweight">
        <el-input
          v-model="queryParams.birthweight"
          placeholder="请输入出生重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="羔羊状态" prop="status">
        <el-input
          v-model="queryParams.status"
          placeholder="请输入羔羊状态"
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
      <el-form-item label="断奶时间">
        <el-date-picker
          v-model="daterangeWeaningdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="断奶重" prop="weaningweight">
        <el-input
          v-model="queryParams.weaningweight"
          placeholder="请输入断奶重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="羔羊类型" prop="type">
        <el-input
          v-model="queryParams.type"
          placeholder="请输入羔羊类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="移至场区" prop="newregion">
        <el-input
          v-model="queryParams.newregion"
          placeholder="请输入移至场区"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="移至羊舍" prop="newbuilding">
        <el-input
          v-model="queryParams.newbuilding"
          placeholder="请输入移至羊舍"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="移至羊栏" prop="newcolumn">
        <el-input
          v-model="queryParams.newcolumn"
          placeholder="请输入移至羊栏"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="视频" prop="video">
        <el-input
          v-model="queryParams.video"
          placeholder="请输入视频"
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
<!--      <el-form-item label="创建者" prop="createBy">-->
<!--        <el-input-->
<!--          v-model="queryParams.createBy"-->
<!--          placeholder="请输入创建者"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="创建时间" prop="createDate">-->
<!--        <el-date-picker clearable-->
<!--          v-model="queryParams.createDate"-->
<!--          type="date"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          placeholder="请选择创建时间">-->
<!--        </el-date-picker>-->
<!--      </el-form-item>-->
<!--      <el-form-item label="更新者" prop="updateBy">-->
<!--        <el-input-->
<!--          v-model="queryParams.updateBy"-->
<!--          placeholder="请输入更新者"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="更新时间" prop="updateDate">-->
<!--        <el-date-picker clearable-->
<!--          v-model="queryParams.updateDate"-->
<!--          type="date"-->
<!--          value-format="yyyy-MM-dd"-->
<!--          placeholder="请选择更新时间">-->
<!--        </el-date-picker>-->
<!--      </el-form-item>-->
<!--      <el-form-item label="备注信息" prop="remarks">-->
<!--        <el-input-->
<!--          v-model="queryParams.remarks"-->
<!--          placeholder="请输入备注信息"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="逻辑删除标记" prop="delFlag">-->
<!--        <el-input-->
<!--          v-model="queryParams.delFlag"-->
<!--          placeholder="请输入逻辑删除标记"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
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
          v-hasPermi="['productManagement:sheepbirth:add']"
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
          v-hasPermi="['productManagement:sheepbirth:edit']"
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
          v-hasPermi="['productManagement:sheepbirth:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:sheepbirth:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="sheepbirthList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="外键" align="center" prop="matingid" />
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="母耳标" align="center" prop="motherid" />
      <el-table-column label="父耳标" align="center" prop="fatherid" />
      <el-table-column label="性别" align="center" prop="sex">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_user_sex" :value="scope.row.sex"/>
        </template>
      </el-table-column>
      <el-table-column label="毛色" align="center" prop="colour" />
      <el-table-column label="出生重" align="center" prop="birthweight" />
      <el-table-column label="羔羊状态" align="center" prop="status" />
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="断奶时间" align="center" prop="weaningdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.weaningdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="断奶重" align="center" prop="weaningweight" />
      <el-table-column label="羔羊类型" align="center" prop="type" />
      <el-table-column label="移至场区" align="center" prop="newregion" />
      <el-table-column label="移至羊舍" align="center" prop="newbuilding" />
      <el-table-column label="移至羊栏" align="center" prop="newcolumn" />
      <el-table-column label="视频" align="center" prop="video" />
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
            v-hasPermi="['productManagement:sheepbirth:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:sheepbirth:remove']"
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

    <!-- 添加或修改产子档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="外键" prop="matingid">
          <el-input v-model="form.matingid" placeholder="请输入外键" />
        </el-form-item>
        <el-form-item label="耳编号" prop="eartagid">
          <el-input v-model="form.eartagid" placeholder="请输入耳编号" />
        </el-form-item>
        <el-form-item label="母耳标" prop="motherid">
          <el-input v-model="form.motherid" placeholder="请输入母耳标" />
        </el-form-item>
        <el-form-item label="父耳标" prop="fatherid">
          <el-input v-model="form.fatherid" placeholder="请输入父耳标" />
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-select v-model="form.sex" placeholder="请选择性别">
            <el-option
              v-for="dict in dict.type.sys_user_sex"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="毛色" prop="colour">
          <el-input v-model="form.colour" placeholder="请输入毛色" />
        </el-form-item>
        <el-form-item label="出生重" prop="birthweight">
          <el-input v-model="form.birthweight" placeholder="请输入出生重" />
        </el-form-item>
        <el-form-item label="羔羊状态" prop="status">
          <el-input v-model="form.status" placeholder="请输入羔羊状态" />
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
        <el-form-item label="断奶时间" prop="weaningdate">
          <el-date-picker clearable
            v-model="form.weaningdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择断奶时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="断奶重" prop="weaningweight">
          <el-input v-model="form.weaningweight" placeholder="请输入断奶重" />
        </el-form-item>
        <el-form-item label="羔羊类型" prop="type">
          <el-input v-model="form.type" placeholder="请输入羔羊类型" />
        </el-form-item>
        <el-form-item label="移至场区" prop="newregion">
          <el-input v-model="form.newregion" placeholder="请输入移至场区" />
        </el-form-item>
        <el-form-item label="移至羊舍" prop="newbuilding">
          <el-input v-model="form.newbuilding" placeholder="请输入移至羊舍" />
        </el-form-item>
        <el-form-item label="移至羊栏" prop="newcolumn">
          <el-input v-model="form.newcolumn" placeholder="请输入移至羊栏" />
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" placeholder="请输入视频" />
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
import { listSheepbirth, getSheepbirth, delSheepbirth, addSheepbirth, updateSheepbirth } from "@/api/productManagement/sheepbirth";

export default {
  name: "Sheepbirth",
  dicts: ['sys_user_sex'],
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
      // 产子档案表格数据
      sheepbirthList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeWeaningdate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        matingid: null,
        eartagid: null,
        motherid: null,
        fatherid: null,
        sex: null,
        colour: null,
        birthweight: null,
        status: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        weaningdate: null,
        weaningweight: null,
        type: null,
        newregion: null,
        newbuilding: null,
        newcolumn: null,
        video: null,
        bak1: null,
        bak2: null,
        bak3: null,
        createBy: null,
        createDate: null,
        updateBy: null,
        updateDate: null,
        remarks: null,
        delFlag: null
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
    /** 查询产子档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeWeaningdate && '' != this.daterangeWeaningdate) {
        this.queryParams.params["beginWeaningdate"] = this.daterangeWeaningdate[0];
        this.queryParams.params["endWeaningdate"] = this.daterangeWeaningdate[1];
      }
      listSheepbirth(this.queryParams).then(response => {
        this.sheepbirthList = response.rows;
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
        matingid: null,
        eartagid: null,
        motherid: null,
        fatherid: null,
        sex: null,
        colour: null,
        birthweight: null,
        status: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        weaningdate: null,
        weaningweight: null,
        type: null,
        newregion: null,
        newbuilding: null,
        newcolumn: null,
        video: null,
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
      this.daterangeWeaningdate = [];
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
      this.title = "添加产子档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSheepbirth(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改产子档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSheepbirth(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSheepbirth(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除产子档案编号为"' + ids + '"的数据项？').then(function() {
        return delSheepbirth(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/sheepbirth/export', {
        ...this.queryParams
      }, `sheepbirth_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
