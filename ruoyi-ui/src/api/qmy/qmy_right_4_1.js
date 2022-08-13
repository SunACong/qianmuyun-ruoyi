import request from '@/utils/request'

// 查询销售统计列表
export function listQmy_right_4_1(query) {
  return request({
    url: '/qmy/qmy_right_4_1/list',
    method: 'get',
    params: query
  })
}

// 查询销售统计详细
export function getQmy_right_4_1(id) {
  return request({
    url: '/qmy/qmy_right_4_1/' + id,
    method: 'get'
  })
}

// 新增销售统计
export function addQmy_right_4_1(data) {
  return request({
    url: '/qmy/qmy_right_4_1',
    method: 'post',
    data: data
  })
}

// 修改销售统计
export function updateQmy_right_4_1(data) {
  return request({
    url: '/qmy/qmy_right_4_1',
    method: 'put',
    data: data
  })
}

// 删除销售统计
export function delQmy_right_4_1(id) {
  return request({
    url: '/qmy/qmy_right_4_1/' + id,
    method: 'delete'
  })
}
