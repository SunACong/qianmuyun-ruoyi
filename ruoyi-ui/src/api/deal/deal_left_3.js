import request from '@/utils/request'

// 查询左 3列表
export function listDeal_left_3(query) {
  return request({
    url: '/deal/deal_left_3/list',
    method: 'get',
    params: query
  })
}

// 查询左 3详细
export function getDeal_left_3(id) {
  return request({
    url: '/deal/deal_left_3/' + id,
    method: 'get'
  })
}

// 新增左 3
export function addDeal_left_3(data) {
  return request({
    url: '/deal/deal_left_3',
    method: 'post',
    data: data
  })
}

// 修改左 3
export function updateDeal_left_3(data) {
  return request({
    url: '/deal/deal_left_3',
    method: 'put',
    data: data
  })
}

// 删除左 3
export function delDeal_left_3(id) {
  return request({
    url: '/deal/deal_left_3/' + id,
    method: 'delete'
  })
}
