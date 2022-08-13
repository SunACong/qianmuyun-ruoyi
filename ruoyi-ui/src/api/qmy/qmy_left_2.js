import request from '@/utils/request'

// 查询生产统计列表
export function listQmy_left_2(query) {
  return request({
    url: '/qmy/qmy_left_2/list',
    method: 'get',
    params: query
  })
}

// 查询生产统计详细
export function getQmy_left_2(id) {
  return request({
    url: '/qmy/qmy_left_2/' + id,
    method: 'get'
  })
}

// 新增生产统计
export function addQmy_left_2(data) {
  return request({
    url: '/qmy/qmy_left_2',
    method: 'post',
    data: data
  })
}

// 修改生产统计
export function updateQmy_left_2(data) {
  return request({
    url: '/qmy/qmy_left_2',
    method: 'put',
    data: data
  })
}

// 删除生产统计
export function delQmy_left_2(id) {
  return request({
    url: '/qmy/qmy_left_2/' + id,
    method: 'delete'
  })
}
