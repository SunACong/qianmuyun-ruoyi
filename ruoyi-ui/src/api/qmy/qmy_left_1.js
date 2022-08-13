import request from '@/utils/request'

// 查询存栏统计(一)列表
export function listQmy_left_1(query) {
  return request({
    url: '/qmy/qmy_left_1/list',
    method: 'get',
    params: query
  })
}

// 查询存栏统计(一)详细
export function getQmy_left_1(id) {
  return request({
    url: '/qmy/qmy_left_1/' + id,
    method: 'get'
  })
}

// 新增存栏统计(一)
export function addQmy_left_1(data) {
  return request({
    url: '/qmy/qmy_left_1',
    method: 'post',
    data: data
  })
}

// 修改存栏统计(一)
export function updateQmy_left_1(data) {
  return request({
    url: '/qmy/qmy_left_1',
    method: 'put',
    data: data
  })
}

// 删除存栏统计(一)
export function delQmy_left_1(id) {
  return request({
    url: '/qmy/qmy_left_1/' + id,
    method: 'delete'
  })
}
