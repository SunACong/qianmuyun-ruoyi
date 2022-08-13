<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="消毒时间">
        <el-date-picker
          v-model="daterangeDisinfectdate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="查询开始时间" prop="startdate">
        <el-date-picker clearable
          v-model="queryParams.startdate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择查询开始时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="查询截止时间" prop="enddate">
        <el-date-picker clearable
          v-model="queryParams.enddate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择查询截止时间">
        </el-date-picker>
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
          v-hasPermi="['productManagement:disinfect:add']"
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
          v-hasPermi="['productManagement:disinfect:edit']"
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
          v-hasPermi="['productManagement:disinfect:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:disinfect:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="disinfectList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="消毒时间" align="center" prop="disinfectdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.disinfectdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="消毒场所" align="center" prop="disinfectloc" />
      <el-table-column label="消毒场区" align="center" prop="disinfectregion" />
      <el-table-column label="消毒羊舍" align="center" prop="disinfectbuilding" />
      <el-table-column label="消毒药" align="center" prop="disinfectmedicine">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.disinfect" :value="scope.row.disinfectmedicine"/>
        </template>
      </el-table-column>
      <el-table-column label="消毒方法" align="center" prop="disinfectmethod" />
      <el-table-column label="剂量" align="center" prop="dose" />
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
            v-hasPermi="['productManagement:disinfect:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:disinfect:remove']"
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

    <!-- 添加或修改消毒档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="消毒时间" prop="disinfectdate">
          <el-date-picker clearable
            v-model="form.disinfectdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择消毒时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="消毒场所" prop="disinfectloc">
          <el-input v-model="form.disinfectloc" placeholder="请输入消毒场所" />
        </el-form-item>
        <el-form-item label="消毒场区" prop="disinfectregion">
          <el-input v-model="form.disinfectregion" placeholder="请输入消毒场区" />
        </el-form-item>
        <el-form-item label="消毒羊舍" prop="disinfectbuilding">
          <el-input v-model="form.disinfectbuilding" placeholder="请输入消毒羊舍" />
        </el-form-item>
        <el-form-item label="消毒药" prop="disinfectmedicine">
          <el-select v-model="form.disinfectmedicine" placeholder="请选择消毒药">
            <el-option
              v-for="dict in dict.type.disinfect"
              :key="dict.value"
              :label="dict.label"
:value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="消毒方法" prop="disinfectmethod">
          <el-input v-model="form.disinfectmethod" placeholder="请输入消毒方法" />
        </el-form-item>
        <el-form-item label="剂量" prop="dose">
          <el-input v-model="form.dose" placeholder="请输入剂量" />
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
import { listDisinfect, getDisinfect, delDisinfect, addDisinfect, updateDisinfect } from "@/api/productManagement/disinfect";

export default {
  name: "Disinfect",
  dicts: ['sys_yes_no', 'disinfect'],
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
      // 消毒档案表格数据
      disinfectList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 养殖场时间范围
      daterangeDisinfectdate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        disinfectdate: null,
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
    /** 查询消毒档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeDisinfectdate && '' != this.daterangeDisinfectdate) {
        this.queryParams.params["beginDisinfectdate"] = this.daterangeDisinfectdate[0];
        this.queryParams.params["endDisinfectdate"] = this.daterangeDisinfectdate[1];
      }
      listDisinfect(this.queryParams).then(response => {
        this.disinfectList = response.rows;
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
        disinfectdate: null,
        disinfectloc: null,
        disinfectregion: null,
        disinfectbuilding: null,
        disinfectmedicine: null,
        disinfectmethod: null,
        dose: null,
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
      this.daterangeDisinfectdate = [];
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
      this.title = "添加消毒档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDisinfect(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改消毒档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDisinfect(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDisinfect(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除消毒档案编号为"' + ids + '"的数据项？').then(function() {
        return delDisinfect(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/disinfect/export', {
        ...this.queryParams
      }, `disinfect_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
