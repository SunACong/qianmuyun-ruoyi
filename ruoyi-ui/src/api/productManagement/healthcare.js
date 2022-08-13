import request from '@/utils/request'

// 查询保健档案列表
export function listHealthcare(query) {
  return request({
    url: '/productManagement/healthcare/list',
    method: 'get',
    params: query
  })
}

// 查询保健档案详细
export function getHealthcare(id) {
  return request({
    url: '/productManagement/healthcare/' + id,
    method: 'get'
  })
}

// 新增保健档案
export function addHealthcare(data) {
  return request({
    url: '/productManagement/healthcare',
    method: 'post',
    data: data
  })
}

// 修改保健档案
export function updateHealthcare(data) {
  return request({
    url: '/productManagement/healthcare',
    method: 'put',
    data: data
  })
}

// 删除保健档案
export function delHealthcare(id) {
  return request({
    url: '/productManagement/healthcare/' + id,
    method: 'delete'
  })
}
