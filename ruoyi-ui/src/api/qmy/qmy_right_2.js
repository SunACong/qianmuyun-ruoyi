import request from '@/utils/request'

// 查询疫病监测列表
export function listQmy_right_2(query) {
  return request({
    url: '/qmy/qmy_right_2/list',
    method: 'get',
    params: query
  })
}

// 查询疫病监测详细
export function getQmy_right_2(id) {
  return request({
    url: '/qmy/qmy_right_2/' + id,
    method: 'get'
  })
}

// 新增疫病监测
export function addQmy_right_2(data) {
  return request({
    url: '/qmy/qmy_right_2',
    method: 'post',
    data: data
  })
}

// 修改疫病监测
export function updateQmy_right_2(data) {
  return request({
    url: '/qmy/qmy_right_2',
    method: 'put',
    data: data
  })
}

// 删除疫病监测
export function delQmy_right_2(id) {
  return request({
    url: '/qmy/qmy_right_2/' + id,
    method: 'delete'
  })
}
