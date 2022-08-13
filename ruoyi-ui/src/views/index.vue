 <template>
   <div>
   <div v-if="loading" v-loading="loading" style="height: 800px"></div>
  <div v-if="!loading">
    <PanelGroup :number="sheep" @handleSetLineChartData="handleSetLineChartData"/>
<!--    <LineChart :chart-data="lineChartData"/>-->
      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <span>羊种数量情况</span>
          <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
        </div>
        <PieChart :chart-data="sheepNum" v-loading="loading"/>
      </el-card>

    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>昨日新增:<span style="color: red">{{20}}</span></span>
        <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
      </div>
      <BarChart :x-data="xData" :data="yData" color="green"/>
    </el-card>

    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>昨日死亡:<span style="color: red">{{1}}</span></span>
        <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
      </div>
      <BarChart  color="red"/>
    </el-card>

    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>昨日售出:<span style="color: red">{{212}}</span></span>
        <el-button style="float: right; padding: 3px 3px" type="text" @click="haha()">操作按钮</el-button>
<!--        <el-button style="float: right; padding: 3px 0" type="text" >操作按钮</el-button>-->
      </div>
      <BarChart  color="blue"/>
    </el-card>

<!--    <el-card class="box-card">-->
<!--      <div slot="header" class="clearfix">-->
<!--        <span>羊种类分布情况</span>-->
<!--        <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>-->
<!--      </div>-->
<!--      <RaddarChart/>-->
<!--    </el-card>-->
  </div>
   </div>
</template>

<script>
import {farmlocList, sheepNumList} from "@/api/stockManager/firstrecord";
import PieChart from "@/views/dashboard/PieChart";
import BarChart from "@/views/dashboard/BarChart";
import LineChart from "@/views/dashboard/LineChart";
import PanelGroup from "@/views/dashboard/PanelGroup";
import RaddarChart from "@/views/dashboard/RaddarChart";
import {listFirstrecord} from "@/api/stockManager/firstrecord";

const lineChartData = {
  yang: {
    expectedData: [100, 120, 161, 134, 105, 1600, 165],
    actualData: [120, 82, 91, 154, 162, 140, 145]
  },
  muyang: {
    expectedData: [200, 192, 120, 144, 160, 130, 140],
    actualData: [180, 160, 151, 106, 145, 150, 130]
  },
  gongyang: {
    expectedData: [80, 100, 121, 104, 105, 90, 100],
    actualData: [120, 90, 100, 138, 142, 130, 130]
  },
  yangzhichang: {
    expectedData: [130, 140, 141, 142, 145, 150, 160],
    actualData: [120, 82, 91, 154, 162, 140, 130]
  }
}

export default {
  name:'Index',
  components:{
    PieChart,
    BarChart,
    LineChart,
    PanelGroup,
    RaddarChart,
  },
  created() {
    this.getList();
    // //渲染数据开关
    // this.loading = true;
  },
  data(){
    return{
      //是否渲染数据
      loading:false,
      //暂时没有用到
      genealogyList:null,
      //上面四个卡片的数值
      sheep:[0,0,0,0],
      //折线图初始化数据
      lineChartData: lineChartData.yang,
      sheepNum:[
        { value: 0, name: '白山羊'},
        { value: 0, name: '杜柏羊'},
        { value: 0, name: '黑山羊'},
        { value: 0, name: '波尔山羊'},
        { value: 0, name: '努比亚山羊'}
      ],
      xData:['1月', '2月', '3月', '4月', '5月', '6月', '7月','8月', '9月', '10月','11月', '12月'],
      yData:[80, 52, 200, 334, 390, 330, 220, 390, 330, 220, 390, 330, 220],
    };
  },
  methods:{
    handleSetLineChartData(type) {
      this.lineChartData = lineChartData[type]
    },
    async getList() {
      this.loading = true;
      await sheepNumList().then(response => {
        this.sheepNum = response.data;
        console.log("this.sheepNum:");
        console.log(this.sheepNum)
      });
      await farmlocList().then(response => {
        this.sheep[3] = response.data.length;
        console.log(response);
      });
      await listFirstrecord({pageNum: null, pageSize: null,gender:'母'}).then(response => {
        //total表示数据的条数
        this.sheep[2] = response.total;
        console.log(response);
      });
      await listFirstrecord({pageNum: null, pageSize: null,gender:'公'}).then(response => {
        this.sheep[1] = response.total;
        this.sheep[0] = this.sheep[1] + this.sheep[2];
        console.log(response);
        this.$set(this.sheep);
      });
      this.loading = false;
    },
    haha() {
      this.$set(this.sheep, 2,100);
      console.log("点击了按钮");
      console.log(this.sheep)
    }
  }
}
</script>

<style>

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}
.clearfix:after {
  clear: both
}

.box-card {
  float: left;
  width: 48%;
  margin-left: 1%;
}
</style>
