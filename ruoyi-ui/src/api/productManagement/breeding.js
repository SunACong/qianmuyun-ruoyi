import request from '@/utils/request'

// 查询育种选育档案列表
export function listBreeding(query) {
  return request({
    url: '/productManagement/breeding/list',
    method: 'get',
    params: query
  })
}

// 查询育种选育档案详细
export function getBreeding(id) {
  return request({
    url: '/productManagement/breeding/' + id,
    method: 'get'
  })
}

// 新增育种选育档案
export function addBreeding(data) {
  return request({
    url: '/productManagement/breeding',
    method: 'post',
    data: data
  })
}

// 修改育种选育档案
export function updateBreeding(data) {
  return request({
    url: '/productManagement/breeding',
    method: 'put',
    data: data
  })
}

// 删除育种选育档案
export function delBreeding(id) {
  return request({
    url: '/productManagement/breeding/' + id,
    method: 'delete'
  })
}
