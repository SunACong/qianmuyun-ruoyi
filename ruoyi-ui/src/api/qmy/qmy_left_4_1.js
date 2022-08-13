import request from '@/utils/request'

// 查询饲料统计列表
export function listQmy_left_4_1(query) {
  return request({
    url: '/qmy/qmy_left_4_1/list',
    method: 'get',
    params: query
  })
}

// 查询饲料统计详细
export function getQmy_left_4_1(id) {
  return request({
    url: '/qmy/qmy_left_4_1/' + id,
    method: 'get'
  })
}

// 新增饲料统计
export function addQmy_left_4_1(data) {
  return request({
    url: '/qmy/qmy_left_4_1',
    method: 'post',
    data: data
  })
}

// 修改饲料统计
export function updateQmy_left_4_1(data) {
  return request({
    url: '/qmy/qmy_left_4_1',
    method: 'put',
    data: data
  })
}

// 删除饲料统计
export function delQmy_left_4_1(id) {
  return request({
    url: '/qmy/qmy_left_4_1/' + id,
    method: 'delete'
  })
}
