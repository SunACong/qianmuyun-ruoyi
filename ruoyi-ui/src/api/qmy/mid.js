import request from '@/utils/request'

// 查询完成率列表
export function listMid(query) {
  return request({
    url: '/qmy/mid/list',
    method: 'get',
    params: query
  })
}

// 查询完成率详细
export function getMid(id) {
  return request({
    url: '/qmy/mid/' + id,
    method: 'get'
  })
}

// 新增完成率
export function addMid(data) {
  return request({
    url: '/qmy/mid',
    method: 'post',
    data: data
  })
}

// 修改完成率
export function updateMid(data) {
  return request({
    url: '/qmy/mid',
    method: 'put',
    data: data
  })
}

// 删除完成率
export function delMid(id) {
  return request({
    url: '/qmy/mid/' + id,
    method: 'delete'
  })
}
