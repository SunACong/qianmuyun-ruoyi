import request from '@/utils/request'

// 查询死亡统计列表
export function listQmy_left_3(query) {
  return request({
    url: '/qmy/qmy_left_3/list',
    method: 'get',
    params: query
  })
}

// 查询死亡统计详细
export function getQmy_left_3(id) {
  return request({
    url: '/qmy/qmy_left_3/' + id,
    method: 'get'
  })
}

// 新增死亡统计
export function addQmy_left_3(data) {
  return request({
    url: '/qmy/qmy_left_3',
    method: 'post',
    data: data
  })
}

// 修改死亡统计
export function updateQmy_left_3(data) {
  return request({
    url: '/qmy/qmy_left_3',
    method: 'put',
    data: data
  })
}

// 删除死亡统计
export function delQmy_left_3(id) {
  return request({
    url: '/qmy/qmy_left_3/' + id,
    method: 'delete'
  })
}
