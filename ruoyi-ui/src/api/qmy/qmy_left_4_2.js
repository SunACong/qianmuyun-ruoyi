import request from '@/utils/request'

// 查询兽药统计列表
export function listQmy_left_4_2(query) {
  return request({
    url: '/qmy/qmy_left_4_2/list',
    method: 'get',
    params: query
  })
}

// 查询兽药统计详细
export function getQmy_left_4_2(id) {
  return request({
    url: '/qmy/qmy_left_4_2/' + id,
    method: 'get'
  })
}

// 新增兽药统计
export function addQmy_left_4_2(data) {
  return request({
    url: '/qmy/qmy_left_4_2',
    method: 'post',
    data: data
  })
}

// 修改兽药统计
export function updateQmy_left_4_2(data) {
  return request({
    url: '/qmy/qmy_left_4_2',
    method: 'put',
    data: data
  })
}

// 删除兽药统计
export function delQmy_left_4_2(id) {
  return request({
    url: '/qmy/qmy_left_4_2/' + id,
    method: 'delete'
  })
}
