import request from '@/utils/request'

// 查询动物福利列表
export function listAniwelfare(query) {
  return request({
    url: '/productManagement/aniwelfare/list',
    method: 'get',
    params: query
  })
}

// 查询动物福利详细
export function getAniwelfare(id) {
  return request({
    url: '/productManagement/aniwelfare/' + id,
    method: 'get'
  })
}

// 新增动物福利
export function addAniwelfare(data) {
  return request({
    url: '/productManagement/aniwelfare',
    method: 'post',
    data: data
  })
}

// 修改动物福利
export function updateAniwelfare(data) {
  return request({
    url: '/productManagement/aniwelfare',
    method: 'put',
    data: data
  })
}

// 删除动物福利
export function delAniwelfare(id) {
  return request({
    url: '/productManagement/aniwelfare/' + id,
    method: 'delete'
  })
}
