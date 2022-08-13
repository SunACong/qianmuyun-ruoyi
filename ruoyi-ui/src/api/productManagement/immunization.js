import request from '@/utils/request'

// 查询免疫档案列表
export function listImmunization(query) {
  return request({
    url: '/productManagement/immunization/list',
    method: 'get',
    params: query
  })
}

// 查询免疫档案详细
export function getImmunization(id) {
  return request({
    url: '/productManagement/immunization/' + id,
    method: 'get'
  })
}

// 新增免疫档案
export function addImmunization(data) {
  return request({
    url: '/productManagement/immunization',
    method: 'post',
    data: data
  })
}

// 修改免疫档案
export function updateImmunization(data) {
  return request({
    url: '/productManagement/immunization',
    method: 'put',
    data: data
  })
}

// 删除免疫档案
export function delImmunization(id) {
  return request({
    url: '/productManagement/immunization/' + id,
    method: 'delete'
  })
}
