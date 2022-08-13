<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="录入时间">
        <el-date-picker
          v-model="daterangeRecorddate"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="养殖场" prop="ranch">
        <el-input
          v-model="queryParams.ranch"
          placeholder="请输入养殖场"
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
      <el-form-item label="性别" prop="gender">
        <el-input
          v-model="queryParams.gender"
          placeholder="请输入性别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="品种" prop="species">
        <el-input
          v-model="queryParams.species"
          placeholder="请输入品种"
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
      <el-form-item label="月龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入月龄"
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
      <el-form-item label="体重" prop="weight">
        <el-input
          v-model="queryParams.weight"
          placeholder="请输入体重"
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
      <el-form-item label="预留3" prop="bak3">
        <el-input
          v-model="queryParams.bak3"
          placeholder="请输入预留3"
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
          v-hasPermi="['stockManager:firstrecord:add']"
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
          v-hasPermi="['stockManager:firstrecord:edit']"
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
          v-hasPermi="['stockManager:firstrecord:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['stockManager:firstrecord:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="firstrecordList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="录入时间" align="center" prop="recorddate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.recorddate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="养殖场" align="center" prop="ranch" />
      <el-table-column label="耳编号" align="center" prop="eartagid" />
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="性别" align="center" prop="gender" />
      <el-table-column label="品种" align="center" prop="species" />
      <el-table-column label="品类" align="center" prop="type" />
      <el-table-column label="阶段" align="center" prop="stage" />
      <el-table-column label="月龄" align="center" prop="age" />
      <el-table-column label="毛色" align="center" prop="colour" />
      <el-table-column label="体重" align="center" prop="weight" />
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
      <el-table-column label="审核是否通过" align="center" prop="bak1" />
      <el-table-column label="未通过原因" align="center" prop="bak2" />
      <el-table-column label="预留3" align="center" prop="bak3" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['stockManager:firstrecord:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['stockManager:firstrecord:remove']"
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

    <!-- 添加或修改初次录入对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="录入时间" prop="recorddate">
          <el-date-picker clearable
            v-model="form.recorddate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择录入时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="养殖场" prop="ranch">
          <el-input v-model="form.ranch" placeholder="请输入养殖场" />
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
        <el-form-item label="性别" prop="gender">
          <el-input v-model="form.gender" placeholder="请输入性别" />
        </el-form-item>
        <el-form-item label="品种" prop="species">
          <el-input v-model="form.species" placeholder="请输入品种" />
        </el-form-item>
        <el-form-item label="阶段" prop="stage">
          <el-input v-model="form.stage" placeholder="请输入阶段" />
        </el-form-item>
        <el-form-item label="月龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入月龄" />
        </el-form-item>
        <el-form-item label="毛色" prop="colour">
          <el-input v-model="form.colour" placeholder="请输入毛色" />
        </el-form-item>
        <el-form-item label="体重" prop="weight">
          <el-input v-model="form.weight" placeholder="请输入体重" />
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" placeholder="请输入视频" />
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
        <el-form-item label="审核是否通过" prop="bak1">
          <el-input v-model="form.bak1" placeholder="请输入审核是否通过" />
        </el-form-item>
        <el-form-item label="未通过原因" prop="bak2">
          <el-input v-model="form.bak2" placeholder="请输入未通过原因" />
        </el-form-item>
        <el-form-item label="预留3" prop="bak3">
          <el-input v-model="form.bak3" placeholder="请输入预留3" />
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
import { listFirstrecord, getFirstrecord, delFirstrecord, addFirstrecord, updateFirstrecord } from "@/api/stockManager/firstrecord";

export default {
  name: "Firstrecord",
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
      // 初次录入表格数据
      firstrecordList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 预留3时间范围
      daterangeRecorddate: [],
      // 预留3时间范围
      daterangeStartdate: [],
      // 预留3时间范围
      daterangeEnddate: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        recorddate: null,
        ranch: null,
        eartagid: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        gender: null,
        species: null,
        type: null,
        stage: null,
        age: null,
        colour: null,
        weight: null,
        video: null,
        startdate: null,
        enddate: null,
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
    /** 视频播放 */
    playVideo(row) {
      this.dialogPlay = true;
      this.videoUrl = row.video;
    },
    closeDialog() {
      this.videoUrl = ""; //清空数据 关闭视频播放
    },
    /** 查询初次录入列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeRecorddate && '' != this.daterangeRecorddate) {
        this.queryParams.params["beginRecorddate"] = this.daterangeRecorddate[0];
        this.queryParams.params["endRecorddate"] = this.daterangeRecorddate[1];
      }
      if (null != this.daterangeStartdate && '' != this.daterangeStartdate) {
        this.queryParams.params["beginStartdate"] = this.daterangeStartdate[0];
        this.queryParams.params["endStartdate"] = this.daterangeStartdate[1];
      }
      if (null != this.daterangeEnddate && '' != this.daterangeEnddate) {
        this.queryParams.params["beginEnddate"] = this.daterangeEnddate[0];
        this.queryParams.params["endEnddate"] = this.daterangeEnddate[1];
      }
      listFirstrecord(this.queryParams).then(response => {
        this.firstrecordList = response.rows;
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
        recorddate: null,
        ranch: null,
        eartagid: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        gender: null,
        species: null,
        type: null,
        stage: null,
        age: null,
        colour: null,
        weight: null,
        video: null,
        startdate: null,
        enddate: null,
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
      this.daterangeRecorddate = [];
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
      this.title = "添加初次录入";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getFirstrecord(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改初次录入";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateFirstrecord(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFirstrecord(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除初次录入编号为"' + ids + '"的数据项？').then(function() {
        return delFirstrecord(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('stockManager/firstrecord/export', {
        ...this.queryParams
      }, `firstrecord_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
