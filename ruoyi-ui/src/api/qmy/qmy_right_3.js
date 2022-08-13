import request from '@/utils/request'

// 查询检疫检测列表
export function listQmy_right_3(query) {
  return request({
    url: '/qmy/qmy_right_3/list',
    method: 'get',
    params: query
  })
}

// 查询检疫检测详细
export function getQmy_right_3(id) {
  return request({
    url: '/qmy/qmy_right_3/' + id,
    method: 'get'
  })
}

// 新增检疫检测
export function addQmy_right_3(data) {
  return request({
    url: '/qmy/qmy_right_3',
    method: 'post',
    data: data
  })
}

// 修改检疫检测
export function updateQmy_right_3(data) {
  return request({
    url: '/qmy/qmy_right_3',
    method: 'put',
    data: data
  })
}

// 删除检疫检测
export function delQmy_right_3(id) {
  return request({
    url: '/qmy/qmy_right_3/' + id,
    method: 'delete'
  })
}
