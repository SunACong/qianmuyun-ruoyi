(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0b61a3"],{"1c72":function(e,t,a){"use strict";a.r(t);var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"app-container"},[a("el-form",{directives:[{name:"show",rawName:"v-show",value:e.showSearch,expression:"showSearch"}],ref:"queryForm",attrs:{model:e.queryParams,size:"small",inline:!0,"label-width":"68px"}},[a("el-form-item",{attrs:{label:"接种时间",prop:"inoculationdate"}},[a("el-date-picker",{attrs:{clearable:"",type:"date","value-format":"yyyy-MM-dd",placeholder:"请选择接种时间"},model:{value:e.queryParams.inoculationdate,callback:function(t){e.$set(e.queryParams,"inoculationdate",t)},expression:"queryParams.inoculationdate"}})],1),a("el-form-item",{attrs:{label:"免疫场区",prop:"region"}},[a("el-input",{attrs:{placeholder:"请输入免疫场区",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.region,callback:function(t){e.$set(e.queryParams,"region",t)},expression:"queryParams.region"}})],1),a("el-form-item",{attrs:{label:"免疫羊舍",prop:"buildingnum"}},[a("el-input",{attrs:{placeholder:"请输入免疫羊舍",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.buildingnum,callback:function(t){e.$set(e.queryParams,"buildingnum",t)},expression:"queryParams.buildingnum"}})],1),a("el-form-item",{attrs:{label:"免疫羊栏",prop:"columnnum"}},[a("el-input",{attrs:{placeholder:"请输入免疫羊栏",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.columnnum,callback:function(t){e.$set(e.queryParams,"columnnum",t)},expression:"queryParams.columnnum"}})],1),a("el-form-item",{attrs:{label:"免疫耳编号",prop:"eartagid"}},[a("el-input",{attrs:{placeholder:"请输入免疫耳编号",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.eartagid,callback:function(t){e.$set(e.queryParams,"eartagid",t)},expression:"queryParams.eartagid"}})],1),a("el-form-item",{attrs:{label:"查询开始时间"}},[a("el-date-picker",{staticStyle:{width:"240px"},attrs:{"value-format":"yyyy-MM-dd",type:"daterange","range-separator":"-","start-placeholder":"开始日期","end-placeholder":"结束日期"},model:{value:e.daterangeStartdate,callback:function(t){e.daterangeStartdate=t},expression:"daterangeStartdate"}})],1),a("el-form-item",{attrs:{label:"查询截止时间"}},[a("el-date-picker",{staticStyle:{width:"240px"},attrs:{"value-format":"yyyy-MM-dd",type:"daterange","range-separator":"-","start-placeholder":"开始日期","end-placeholder":"结束日期"},model:{value:e.daterangeEnddate,callback:function(t){e.daterangeEnddate=t},expression:"daterangeEnddate"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary",icon:"el-icon-search",size:"mini"},on:{click:e.handleQuery}},[e._v("搜索")]),a("el-button",{attrs:{icon:"el-icon-refresh",size:"mini"},on:{click:e.resetQuery}},[e._v("重置")])],1)],1),a("el-row",{staticClass:"mb8",attrs:{gutter:10}},[a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:add"],expression:"['productManagement:immunization:add']"}],attrs:{type:"primary",plain:"",icon:"el-icon-plus",size:"mini"},on:{click:e.handleAdd}},[e._v("新增")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:edit"],expression:"['productManagement:immunization:edit']"}],attrs:{type:"success",plain:"",icon:"el-icon-edit",size:"mini",disabled:e.single},on:{click:e.handleUpdate}},[e._v("修改")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:remove"],expression:"['productManagement:immunization:remove']"}],attrs:{type:"danger",plain:"",icon:"el-icon-delete",size:"mini",disabled:e.multiple},on:{click:e.handleDelete}},[e._v("删除")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:export"],expression:"['productManagement:immunization:export']"}],attrs:{type:"warning",plain:"",icon:"el-icon-download",size:"mini"},on:{click:e.handleExport}},[e._v("导出")])],1),a("right-toolbar",{attrs:{showSearch:e.showSearch},on:{"update:showSearch":function(t){e.showSearch=t},"update:show-search":function(t){e.showSearch=t},queryTable:e.getList}})],1),a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.immunizationList},on:{"selection-change":e.handleSelectionChange}},[a("el-table-column",{attrs:{type:"selection",width:"55",align:"center"}}),a("el-table-column",{attrs:{label:"接种时间",align:"center",prop:"inoculationdate",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",[e._v(e._s(e.parseTime(t.row.inoculationdate,"{y}-{m}-{d}")))])]}}])}),a("el-table-column",{attrs:{label:"单位",align:"center",prop:"company"}}),a("el-table-column",{attrs:{label:"免疫场区",align:"center",prop:"region"}}),a("el-table-column",{attrs:{label:"免疫羊舍",align:"center",prop:"buildingnum"}}),a("el-table-column",{attrs:{label:"免疫羊栏",align:"center",prop:"columnnum"}}),a("el-table-column",{attrs:{label:"免疫耳编号",align:"center",prop:"eartagid"}}),a("el-table-column",{attrs:{label:"疫苗",align:"center",prop:"vaccine"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("dict-tag",{attrs:{options:e.dict.type.immunation_yimiao,value:t.row.vaccine}})]}}])}),a("el-table-column",{attrs:{label:"接种方法",align:"center",prop:"method"}}),a("el-table-column",{attrs:{label:"剂量",align:"center",prop:"dose"}}),a("el-table-column",{attrs:{label:"免疫期",align:"center",prop:"immunitydate"}}),a("el-table-column",{attrs:{label:"未接种原因",align:"center",prop:"reason"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("dict-tag",{attrs:{options:e.dict.type.immunation_yuanyin,value:t.row.reason}})]}}])}),a("el-table-column",{attrs:{label:"未接种耳编号",align:"center",prop:"nonimmunity"}}),a("el-table-column",{attrs:{label:"查询开始时间",align:"center",prop:"startdate",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",[e._v(e._s(e.parseTime(t.row.startdate,"{y}-{m}-{d}")))])]}}])}),a("el-table-column",{attrs:{label:"查询截止时间",align:"center",prop:"enddate",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",[e._v(e._s(e.parseTime(t.row.enddate,"{y}-{m}-{d}")))])]}}])}),a("el-table-column",{attrs:{label:"审核是否通过",align:"center",prop:"bak1"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("dict-tag",{attrs:{options:e.dict.type.sys_yes_no,value:t.row.bak1}})]}}])}),a("el-table-column",{attrs:{label:"未通过原因",align:"center",prop:"bak2"}}),a("el-table-column",{attrs:{label:"养殖场",align:"center",prop:"bak3"}}),a("el-table-column",{attrs:{label:"备注信息",align:"center",prop:"remarks"}}),a("el-table-column",{attrs:{label:"视频地址",align:"center",prop:"video"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-dialog",{attrs:{title:"视频",visible:e.dialogPlay,width:"30%"},on:{"update:visible":function(t){e.dialogPlay=t},close:e.closeDialog}},[a("video",{attrs:{src:e.videoUrl,controls:"",autoplay:"",width:"100%"}})]),a("div",{directives:[{name:"show",rawName:"v-show",value:""!=t.row.video,expression:"scope.row.video==''?false:true"}],staticStyle:{color:"#00afff"},on:{click:function(a){return e.playVideo(t.row)}}},[e._v("查看视频")])]}}])}),a("el-table-column",{attrs:{label:"操作",align:"center","class-name":"small-padding fixed-width"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:edit"],expression:"['productManagement:immunization:edit']"}],attrs:{size:"mini",type:"text",icon:"el-icon-edit"},on:{click:function(a){return e.handleUpdate(t.row)}}},[e._v("修改")]),a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["productManagement:immunization:remove"],expression:"['productManagement:immunization:remove']"}],attrs:{size:"mini",type:"text",icon:"el-icon-delete"},on:{click:function(a){return e.handleDelete(t.row)}}},[e._v("删除")])]}}])})],1),a("pagination",{directives:[{name:"show",rawName:"v-show",value:e.total>0,expression:"total>0"}],attrs:{total:e.total,page:e.queryParams.pageNum,limit:e.queryParams.pageSize},on:{"update:page":function(t){return e.$set(e.queryParams,"pageNum",t)},"update:limit":function(t){return e.$set(e.queryParams,"pageSize",t)},pagination:e.getList}}),a("el-dialog",{attrs:{title:e.title,visible:e.open,width:"500px","append-to-body":""},on:{"update:visible":function(t){e.open=t}}},[a("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"接种时间",prop:"inoculationdate"}},[a("el-date-picker",{attrs:{clearable:"",type:"date","value-format":"yyyy-MM-dd",placeholder:"请选择接种时间"},model:{value:e.form.inoculationdate,callback:function(t){e.$set(e.form,"inoculationdate",t)},expression:"form.inoculationdate"}})],1),a("el-form-item",{attrs:{label:"单位",prop:"company"}},[a("el-input",{attrs:{placeholder:"请输入单位"},model:{value:e.form.company,callback:function(t){e.$set(e.form,"company",t)},expression:"form.company"}})],1),a("el-form-item",{attrs:{label:"免疫场区",prop:"region"}},[a("el-input",{attrs:{placeholder:"请输入免疫场区"},model:{value:e.form.region,callback:function(t){e.$set(e.form,"region",t)},expression:"form.region"}})],1),a("el-form-item",{attrs:{label:"免疫羊舍",prop:"buildingnum"}},[a("el-input",{attrs:{placeholder:"请输入免疫羊舍"},model:{value:e.form.buildingnum,callback:function(t){e.$set(e.form,"buildingnum",t)},expression:"form.buildingnum"}})],1),a("el-form-item",{attrs:{label:"免疫羊栏",prop:"columnnum"}},[a("el-input",{attrs:{placeholder:"请输入免疫羊栏"},model:{value:e.form.columnnum,callback:function(t){e.$set(e.form,"columnnum",t)},expression:"form.columnnum"}})],1),a("el-form-item",{attrs:{label:"免疫耳编号",prop:"eartagid"}},[a("el-input",{attrs:{placeholder:"请输入免疫耳编号"},model:{value:e.form.eartagid,callback:function(t){e.$set(e.form,"eartagid",t)},expression:"form.eartagid"}})],1),a("el-form-item",{attrs:{label:"疫苗",prop:"vaccine"}},[a("el-select",{attrs:{placeholder:"请选择疫苗"},model:{value:e.form.vaccine,callback:function(t){e.$set(e.form,"vaccine",t)},expression:"form.vaccine"}},e._l(e.dict.type.immunation_yimiao,(function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})})),1)],1),a("el-form-item",{attrs:{label:"接种方法",prop:"method"}},[a("el-input",{attrs:{placeholder:"请输入接种方法"},model:{value:e.form.method,callback:function(t){e.$set(e.form,"method",t)},expression:"form.method"}})],1),a("el-form-item",{attrs:{label:"剂量",prop:"dose"}},[a("el-input",{attrs:{placeholder:"请输入剂量"},model:{value:e.form.dose,callback:function(t){e.$set(e.form,"dose",t)},expression:"form.dose"}})],1),a("el-form-item",{attrs:{label:"免疫期",prop:"immunitydate"}},[a("el-input",{attrs:{placeholder:"请输入免疫期"},model:{value:e.form.immunitydate,callback:function(t){e.$set(e.form,"immunitydate",t)},expression:"form.immunitydate"}})],1),a("el-form-item",{attrs:{label:"未接种原因",prop:"reason"}},[a("el-select",{attrs:{placeholder:"请选择未接种原因"},model:{value:e.form.reason,callback:function(t){e.$set(e.form,"reason",t)},expression:"form.reason"}},e._l(e.dict.type.immunation_yuanyin,(function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})})),1)],1),a("el-form-item",{attrs:{label:"未接种耳编号",prop:"nonimmunity"}},[a("el-input",{attrs:{type:"textarea",placeholder:"请输入内容"},model:{value:e.form.nonimmunity,callback:function(t){e.$set(e.form,"nonimmunity",t)},expression:"form.nonimmunity"}})],1),a("el-form-item",{attrs:{label:"查询开始时间",prop:"startdate"}},[a("el-date-picker",{attrs:{clearable:"",type:"date","value-format":"yyyy-MM-dd",placeholder:"请选择查询开始时间"},model:{value:e.form.startdate,callback:function(t){e.$set(e.form,"startdate",t)},expression:"form.startdate"}})],1),a("el-form-item",{attrs:{label:"查询截止时间",prop:"enddate"}},[a("el-date-picker",{attrs:{clearable:"",type:"date","value-format":"yyyy-MM-dd",placeholder:"请选择查询截止时间"},model:{value:e.form.enddate,callback:function(t){e.$set(e.form,"enddate",t)},expression:"form.enddate"}})],1),a("el-form-item",{attrs:{label:"审核是否通过"}},[a("el-radio-group",{model:{value:e.form.bak1,callback:function(t){e.$set(e.form,"bak1",t)},expression:"form.bak1"}},e._l(e.dict.type.sys_yes_no,(function(t){return a("el-radio",{key:t.value,attrs:{label:t.value}},[e._v(e._s(t.label))])})),1)],1),a("el-form-item",{attrs:{label:"未通过原因",prop:"bak2"}},[a("el-input",{attrs:{placeholder:"请输入未通过原因"},model:{value:e.form.bak2,callback:function(t){e.$set(e.form,"bak2",t)},expression:"form.bak2"}})],1),a("el-form-item",{attrs:{label:"养殖场",prop:"bak3"}},[a("el-input",{attrs:{placeholder:"请输入养殖场"},model:{value:e.form.bak3,callback:function(t){e.$set(e.form,"bak3",t)},expression:"form.bak3"}})],1),a("el-form-item",{attrs:{label:"备注信息",prop:"remarks"}},[a("el-input",{attrs:{placeholder:"请输入备注信息"},model:{value:e.form.remarks,callback:function(t){e.$set(e.form,"remarks",t)},expression:"form.remarks"}})],1),a("el-form-item",{attrs:{label:"视频",prop:"video"}},[a("el-input",{attrs:{type:"textarea",placeholder:"请输入内容"},model:{value:e.form.video,callback:function(t){e.$set(e.form,"video",t)},expression:"form.video"}})],1)],1),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{attrs:{type:"primary"},on:{click:e.submitForm}},[e._v("确 定")]),a("el-button",{on:{click:e.cancel}},[e._v("取 消")])],1)],1)],1)},l=[],r=a("5530"),o=(a("d81d"),a("b775"));function i(e){return Object(o["a"])({url:"/productManagement/immunization/list",method:"get",params:e})}function s(e){return Object(o["a"])({url:"/productManagement/immunization/"+e,method:"get"})}function u(e){return Object(o["a"])({url:"/productManagement/immunization",method:"post",data:e})}function m(e){return Object(o["a"])({url:"/productManagement/immunization",method:"put",data:e})}function d(e){return Object(o["a"])({url:"/productManagement/immunization/"+e,method:"delete"})}var c={name:"Immunization",dicts:["immunation_yuanyin","immunation_yimiao","sys_yes_no"],data:function(){return{dialogPlay:!1,videoUrl:"",loading:!0,ids:[],single:!0,multiple:!0,showSearch:!1,total:0,immunizationList:[],title:"",open:!1,daterangeStartdate:[],daterangeEnddate:[],queryParams:{pageNum:1,pageSize:10,inoculationdate:null,region:null,buildingnum:null,columnnum:null,eartagid:null,startdate:null,enddate:null},form:{},rules:{}}},created:function(){this.getList()},methods:{playVideo:function(e){this.dialogPlay=!0,this.videoUrl=e.video},closeDialog:function(){this.videoUrl=""},getList:function(){var e=this;this.loading=!0,this.queryParams.params={},null!=this.daterangeStartdate&&""!=this.daterangeStartdate&&(this.queryParams.params["beginStartdate"]=this.daterangeStartdate[0],this.queryParams.params["endStartdate"]=this.daterangeStartdate[1]),null!=this.daterangeEnddate&&""!=this.daterangeEnddate&&(this.queryParams.params["beginEnddate"]=this.daterangeEnddate[0],this.queryParams.params["endEnddate"]=this.daterangeEnddate[1]),i(this.queryParams).then((function(t){e.immunizationList=t.rows,e.total=t.total,e.loading=!1}))},cancel:function(){this.open=!1,this.reset()},reset:function(){this.form={id:null,inoculationdate:null,company:null,region:null,buildingnum:null,columnnum:null,eartagid:null,vaccine:null,method:null,dose:null,immunitydate:null,reason:null,nonimmunity:null,startdate:null,enddate:null,bak1:"0",bak2:null,bak3:null,remarks:null,video:null,createBy:null,createDate:null,updateBy:null,updateDate:null,delFlag:null},this.resetForm("form")},handleQuery:function(){this.queryParams.pageNum=1,this.getList()},resetQuery:function(){this.daterangeStartdate=[],this.daterangeEnddate=[],this.resetForm("queryForm"),this.handleQuery()},handleSelectionChange:function(e){this.ids=e.map((function(e){return e.id})),this.single=1!==e.length,this.multiple=!e.length},handleAdd:function(){this.reset(),this.open=!0,this.title="添加免疫档案"},handleUpdate:function(e){var t=this;this.reset();var a=e.id||this.ids;s(a).then((function(e){t.form=e.data,t.open=!0,t.title="修改免疫档案"}))},submitForm:function(){var e=this;this.$refs["form"].validate((function(t){t&&(null!=e.form.id?m(e.form).then((function(t){e.$modal.msgSuccess("修改成功"),e.open=!1,e.getList()})):u(e.form).then((function(t){e.$modal.msgSuccess("新增成功"),e.open=!1,e.getList()})))}))},handleDelete:function(e){var t=this,a=e.id||this.ids;this.$modal.confirm('是否确认删除免疫档案编号为"'+a+'"的数据项？').then((function(){return d(a)})).then((function(){t.getList(),t.$modal.msgSuccess("删除成功")})).catch((function(){}))},handleExport:function(){this.download("productManagement/immunization/export",Object(r["a"])({},this.queryParams),"immunization_".concat((new Date).getTime(),".xlsx"))}}},p=c,f=a("2877"),b=Object(f["a"])(p,n,l,!1,null,null,null);t["default"]=b.exports}}]);