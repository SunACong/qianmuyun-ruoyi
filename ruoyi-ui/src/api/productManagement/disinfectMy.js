import request from '@/utils/request'

// 查询消毒记录列表
export function listDisinfectMy(query) {
  return request({
    url: '/productManagement/disinfectMy/list',
    method: 'get',
    params: query
  })
}

// 查询消毒记录详细
export function getDisinfectMy(id) {
  return request({
    url: '/productManagement/disinfectMy/' + id,
    method: 'get'
  })
}

// 新增消毒记录
export function addDisinfectMy(data) {
  return request({
    url: '/productManagement/disinfectMy',
    method: 'post',
    data: data
  })
}

// 修改消毒记录
export function updateDisinfectMy(data) {
  return request({
    url: '/productManagement/disinfectMy',
    method: 'put',
    data: data
  })
}

// 删除消毒记录
export function delDisinfectMy(id) {
  return request({
    url: '/productManagement/disinfectMy/' + id,
    method: 'delete'
  })
}
