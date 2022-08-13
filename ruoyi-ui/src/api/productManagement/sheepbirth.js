import request from '@/utils/request'

// 查询产子档案列表
export function listSheepbirth(query) {
  return request({
    url: '/productManagement/sheepbirth/list',
    method: 'get',
    params: query
  })
}

// 查询产子档案详细
export function getSheepbirth(id) {
  return request({
    url: '/productManagement/sheepbirth/' + id,
    method: 'get'
  })
}

// 新增产子档案
export function addSheepbirth(data) {
  return request({
    url: '/productManagement/sheepbirth',
    method: 'post',
    data: data
  })
}

// 修改产子档案
export function updateSheepbirth(data) {
  return request({
    url: '/productManagement/sheepbirth',
    method: 'put',
    data: data
  })
}

// 删除产子档案
export function delSheepbirth(id) {
  return request({
    url: '/productManagement/sheepbirth/' + id,
    method: 'delete'
  })
}
