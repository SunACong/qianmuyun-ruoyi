<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="耳标编号" prop="eartagid">
        <el-input
          v-model="queryParams.eartagid"
          placeholder="请输入耳标编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="sex">
        <el-input
          v-model="queryParams.sex"
          placeholder="请输入羊只性别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="养殖场" prop="farmloc">
        <el-input
          v-model="queryParams.farmloc"
          placeholder="请输入养殖场"
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
      <el-form-item label="出生日期">
        <el-date-picker
          v-model="daterangeBorntime"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="品种" prop="breed">
        <el-input
          v-model="queryParams.breed"
          placeholder="请输入品种"
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
          v-hasPermi="['productManagement:genealogy:add']"
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
          v-hasPermi="['productManagement:genealogy:edit']"
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
          v-hasPermi="['productManagement:genealogy:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['productManagement:genealogy:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>


    <el-table v-loading="loading" :data="genealogyList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键" align="center" prop="id" />-->
      <el-table-column label="耳标编号" align="center" prop="eartagid" />
      <el-table-column label="性别" align="center" prop="sex">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_user_sex" :value="scope.row.sex"/>
        </template>
      </el-table-column>
      <el-table-column label="养殖场" align="center" prop="farmloc" />
      <el-table-column label="出生基地" align="center" prop="bornloc" />
      <el-table-column label="场区" align="center" prop="region" />
      <el-table-column label="栋号" align="center" prop="buildingnum" />
      <el-table-column label="栏号" align="center" prop="columnnum" />
      <el-table-column label="出生日期" align="center" prop="borntime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.borntime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="出生重" align="center" prop="bornweight" />
      <el-table-column label="品种" align="center" prop="breed" />
      <el-table-column label="毛色" align="center" prop="coatcolor" />
      <el-table-column label="母号" align="center" prop="motherid" />
      <el-table-column label="父号" align="center" prop="fatherid" />
      <el-table-column label="祖父号" align="center" prop="grandfatherid" />
      <el-table-column label="祖母号" align="center" prop="grandmotherid" />
      <el-table-column label="外祖父号" align="center" prop="grandpaid" />
      <el-table-column label="外祖母号" align="center" prop="grandmaid" />
<!--      =-========================================================================================================-->
      <el-table-column label="视频地址" align="center" prop="video">
        <template slot-scope="scope">
          <el-dialog title="视频" :visible.sync="dialogPlay" width="30%" @close="closeDialog">
            <video :src="videoUrl" controls autoplay width="100%"></video>
          </el-dialog>
          <div v-show="scope.row.video==''?false:true" @click="playVideo(scope.row)" style="color: #00afff">查看视频</div>
        </template>
      </el-table-column>
<!--      =-========================================================================================================-->
      <el-table-column label="审核是否通过" align="center" prop="bak1">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_yes_no" :value="scope.row.bak1"/>
        </template>
      </el-table-column>
      <el-table-column label="未通过原因" align="center" prop="bak2" />
      <el-table-column label="预留3" align="center" prop="bak3" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['productManagement:genealogy:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['productManagement:genealogy:remove']"
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

    <!-- 添加或修改系谱档案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="耳标编号" prop="eartagid">
          <el-input v-model="form.eartagid" placeholder="请输入耳标编号" />
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
        <el-form-item label="养殖场" prop="farmloc">
          <el-input v-model="form.farmloc" placeholder="请输入养殖场" />
        </el-form-item>
        <el-form-item label="出生基地" prop="bornloc">
          <el-input v-model="form.bornloc" placeholder="请输入出生基地" />
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
        <el-form-item label="出生日期" prop="borntime">
          <el-date-picker clearable
            v-model="form.borntime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择出生日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="出生重" prop="bornweight">
          <el-input v-model="form.bornweight" placeholder="请输入出生重" />
        </el-form-item>
        <el-form-item label="品种" prop="breed">
          <el-input v-model="form.breed" placeholder="请输入品种" />
        </el-form-item>
        <el-form-item label="毛色" prop="coatcolor">
          <el-input v-model="form.coatcolor" placeholder="请输入毛色" />
        </el-form-item>
        <el-form-item label="母号" prop="motherid">
          <el-input v-model="form.motherid" placeholder="请输入母号" />
        </el-form-item>
        <el-form-item label="父号" prop="fatherid">
          <el-input v-model="form.fatherid" placeholder="请输入父号" />
        </el-form-item>
        <el-form-item label="祖父号" prop="grandfatherid">
          <el-input v-model="form.grandfatherid" placeholder="请输入祖父号" />
        </el-form-item>
        <el-form-item label="祖母号" prop="grandmotherid">
          <el-input v-model="form.grandmotherid" placeholder="请输入祖母号" />
        </el-form-item>
        <el-form-item label="外祖父号" prop="grandpaid">
          <el-input v-model="form.grandpaid" placeholder="请输入外祖父号" />
        </el-form-item>
        <el-form-item label="外祖母号" prop="grandmaid">
          <el-input v-model="form.grandmaid" placeholder="请输入外祖母号" />
        </el-form-item>
        <el-form-item label="视频地址" prop="video">
          <el-input v-model="form.video" type="textarea" placeholder="请输入内容" />
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
import { listGenealogy, getGenealogy, delGenealogy, addGenealogy, updateGenealogy } from "@/api/productManagement/genealogy";

export default {
  name: "Genealogy",
  dicts: ['sys_yes_no', 'sys_user_sex'],
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
      // 系谱档案表格数据
      genealogyList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 预留3时间范围
      daterangeBorntime: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        eartagid: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        borntime: null,
        breed: null,
        sex: null,
        farmloc:null,
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

    /** 查询系谱档案列表 */
    getList() {
      this.loading = true;
      this.queryParams.params = {};
      if (null != this.daterangeBorntime && '' != this.daterangeBorntime) {
        this.queryParams.params["beginBorntime"] = this.daterangeBorntime[0];
        this.queryParams.params["endBorntime"] = this.daterangeBorntime[1];
      }
      if('公' == this.queryParams.sex){
        this.queryParams.sex = 0;
      }else if ('母' == this.queryParams.sex){
        this.queryParams.sex = 1;
      }
      console.log(this.queryParams.sex);

      listGenealogy(this.queryParams).then(response => {
        this.genealogyList = response.rows;
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
        sex: null,
        farmloc: null,
        bornloc: null,
        region: null,
        buildingnum: null,
        columnnum: null,
        borntime: null,
        bornweight: null,
        breed: null,
        coatcolor: null,
        motherid: null,
        fatherid: null,
        grandfatherid: null,
        grandmotherid: null,
        grandpaid: null,
        grandmaid: null,
        video: null,
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
      this.daterangeBorntime = [];
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
      this.title = "添加系谱档案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getGenealogy(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改系谱档案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateGenealogy(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGenealogy(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除系谱档案编号为"' + ids + '"的数据项？').then(function() {
        return delGenealogy(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('productManagement/genealogy/export', {
        ...this.queryParams
      }, `genealogy_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
