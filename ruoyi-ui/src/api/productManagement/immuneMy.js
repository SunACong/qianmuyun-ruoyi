import request from '@/utils/request'

// 查询免疫记录列表
export function listImmuneMy(query) {
  return request({
    url: '/productManagement/immuneMy/list',
    method: 'get',
    params: query
  })
}

// 查询免疫记录详细
export function getImmuneMy(id) {
  return request({
    url: '/productManagement/immuneMy/' + id,
    method: 'get'
  })
}

// 新增免疫记录
export function addImmuneMy(data) {
  return request({
    url: '/productManagement/immuneMy',
    method: 'post',
    data: data
  })
}

// 修改免疫记录
export function updateImmuneMy(data) {
  return request({
    url: '/productManagement/immuneMy',
    method: 'put',
    data: data
  })
}

// 删除免疫记录
export function delImmuneMy(id) {
  return request({
    url: '/productManagement/immuneMy/' + id,
    method: 'delete'
  })
}
