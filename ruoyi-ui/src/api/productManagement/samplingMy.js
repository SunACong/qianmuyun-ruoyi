import request from '@/utils/request'

// 查询采样记录列表
export function listSamplingMy(query) {
  return request({
    url: '/productManagement/samplingMy/list',
    method: 'get',
    params: query
  })
}

// 查询采样记录详细
export function getSamplingMy(id) {
  return request({
    url: '/productManagement/samplingMy/' + id,
    method: 'get'
  })
}

// 新增采样记录
export function addSamplingMy(data) {
  return request({
    url: '/productManagement/samplingMy',
    method: 'post',
    data: data
  })
}

// 修改采样记录
export function updateSamplingMy(data) {
  return request({
    url: '/productManagement/samplingMy',
    method: 'put',
    data: data
  })
}

// 删除采样记录
export function delSamplingMy(id) {
  return request({
    url: '/productManagement/samplingMy/' + id,
    method: 'delete'
  })
}
