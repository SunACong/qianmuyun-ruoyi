import request from '@/utils/request'

// 查询消毒档案列表
export function listDisinfect(query) {
  return request({
    url: '/productManagement/disinfect/list',
    method: 'get',
    params: query
  })
}

// 查询消毒档案详细
export function getDisinfect(id) {
  return request({
    url: '/productManagement/disinfect/' + id,
    method: 'get'
  })
}

// 新增消毒档案
export function addDisinfect(data) {
  return request({
    url: '/productManagement/disinfect',
    method: 'post',
    data: data
  })
}

// 修改消毒档案
export function updateDisinfect(data) {
  return request({
    url: '/productManagement/disinfect',
    method: 'put',
    data: data
  })
}

// 删除消毒档案
export function delDisinfect(id) {
  return request({
    url: '/productManagement/disinfect/' + id,
    method: 'delete'
  })
}
