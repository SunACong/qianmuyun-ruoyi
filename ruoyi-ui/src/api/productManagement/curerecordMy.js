import request from '@/utils/request'

// 查询诊疗记录列表
export function listCurerecordMy(query) {
  return request({
    url: '/productManagement/curerecordMy/list',
    method: 'get',
    params: query
  })
}

// 查询诊疗记录详细
export function getCurerecordMy(id) {
  return request({
    url: '/productManagement/curerecordMy/' + id,
    method: 'get'
  })
}

// 新增诊疗记录
export function addCurerecordMy(data) {
  return request({
    url: '/productManagement/curerecordMy',
    method: 'post',
    data: data
  })
}

// 修改诊疗记录
export function updateCurerecordMy(data) {
  return request({
    url: '/productManagement/curerecordMy',
    method: 'put',
    data: data
  })
}

// 删除诊疗记录
export function delCurerecordMy(id) {
  return request({
    url: '/productManagement/curerecordMy/' + id,
    method: 'delete'
  })
}
