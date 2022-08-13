import request from '@/utils/request'

// 查询左 1列表
export function listDeal_left_1(query) {
  return request({
    url: '/deal/deal_left_1/list',
    method: 'get',
    params: query
  })
}

// 查询左 1详细
export function getDeal_left_1(id) {
  return request({
    url: '/deal/deal_left_1/' + id,
    method: 'get'
  })
}

// 新增左 1
export function addDeal_left_1(data) {
  return request({
    url: '/deal/deal_left_1',
    method: 'post',
    data: data
  })
}

// 修改左 1
export function updateDeal_left_1(data) {
  return request({
    url: '/deal/deal_left_1',
    method: 'put',
    data: data
  })
}

// 删除左 1
export function delDeal_left_1(id) {
  return request({
    url: '/deal/deal_left_1/' + id,
    method: 'delete'
  })
}
