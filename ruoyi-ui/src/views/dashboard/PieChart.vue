<template>
  <div :class="className" :style="{height:height,width:width}" />
</template>

<script>
import echarts from 'echarts'
require('echarts/theme/macarons') // echarts theme
import resize from './mixins/resize'

export default {
  mixins: [resize],
  props: {
    className: {
      type: String,
      default: 'chart'
    },
    width: {
      type: String,
      default: '100%'
    },
    height: {
      type: String,
      default: '300px'
    },
    chartData:{
      type: Array,
      required: true
    }
  },
  data() {
    return {
      chart: null
    }
  },
  watch: {
    chartData: {
      deep: true,
      handler(val) {
        this.setOptions(val)
      }
    }
  },
  mounted() {
    this.$nextTick(() => {
      this.initChart()
    })
  },
  beforeDestroy() {
    if (!this.chart) {
      return
    }
    this.chart.dispose()
    this.chart = null
  },
  methods: {
    initChart() {
      this.chart = echarts.init(this.$el, 'macarons'),
      this.setOptions(this.chartData)
    },
    setOptions(sheepNum) {
      this.chart.setOption({
        tooltip: {
          trigger: 'item',
          formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
          left: 'center',
          bottom: '10',
          data: ['白山羊', '杜柏羊', '黑山羊', '波尔山羊', '努比亚山羊']
        },
        series: [
          {
            name: '羊只种类分布情况',
            type: 'pie',
            roseType: 'radius',
            radius: [15, 95],
            center: ['50%', '45%'],
            // data: [
            //   { value: 1000, name: '白山羊'},
            //   { value: 240, name: '杜柏羊'},
            //   { value: 149, name: '黑山羊'},
            //   { value: 100, name: '波尔羊'},
            //   { value: 59, name: '努比亚羊'}
            // ],
            data: sheepNum,
            animationEasing: 'cubicInOut',
            animationDuration: 2600
          }
        ]
      });
    }
  }
}
</script>
