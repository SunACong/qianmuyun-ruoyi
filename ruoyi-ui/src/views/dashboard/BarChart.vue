<template>
  <div :class="className" :style="{height:height,width:width}" />
</template>

<script>
import echarts from 'echarts'
require('echarts/theme/macarons') // echarts theme
import resize from './mixins/resize'

const animationDuration = 6000

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
    xData:{
      type: Array,
      default: function () {
        // return []
        return ['2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12'
          , '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12'
          , '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12'
          , '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12', '2022-05-12'
          , '2022-05-12', '2022-05-12', '2022-05-12']
        // return ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11', '12']
      }
    },
    data:{
      type: Array,
      default: function () {
        // return []
        return [80, 52, 200, 334, 390,
                330, 220, 390, 1330, 220,
                390, 330, 52, 200, 334,
                390, 330, 220, 390, 330,
                220, 390, 33, 52, 200,
                334, 390, 330, 220, 390]
      }
    },
    color:{
      type: String,
      default: 'red'
    }
  },
  data() {
    return {
      chart: null
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
      this.chart = echarts.init(this.$el, 'macarons');
      this.setOptions(this.xData , this.data, this.color);
    },
      setOptions( xData, data, color){
        this.chart.setOption({
          color: color,
          tooltip: {
            trigger: 'axis',
            axisPointer: { // 坐标轴指示器，坐标轴触发有效
              type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
            }
          },
          grid: {
            top: 10,
            left: '2%',
            right: '2%',
            bottom: '3%',
            containLabel: true
          },
          xAxis: [{
            type: 'category',
            // data: ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11', '12', '13'],
            data: xData,
            axisTick: {
              alignWithLabel: true
            },
            axisLabel:{
              show: true,
              interval: 0,
              rotate:70,
            }
          }],
          yAxis: [{
            type: 'value',
            axisTick: {
              show: false
            }
          }],
          series: [
            //   {
            //   name: 'pageA',
            //   type: 'bar',
            //   stack: 'vistors',
            //   barWidth: '60%',
            //   data: [79, 52, 200, 334, 390, 330, 220],
            //   animationDuration
            // }
            // ,
            {
              name: 'pageB',
              type: 'bar',
              stack: 'vistors',
              barWidth: '60%',
              // data: [80, 52, 200, 334, 390, 330, 220, 390, 330, 220, 390, 330, 220],
              data: data,
              animationDuration
            }
            // ,
            // {
            //   name: 'pageC',
            //   type: 'bar',
            //   stack: 'vistors',
            //   barWidth: '60%',
            //   data: [30, 52, 200, 334, 390, 330, 220],
            //   animationDuration
            // }
          ]
        })
      }
    }
}
</script>
