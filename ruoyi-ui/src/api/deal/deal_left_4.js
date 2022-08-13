import request from '@/utils/request'

// 查询左 4列表
export function listDeal_left_4(query) {
  return request({
    url: '/deal/deal_left_4/list',
    method: 'get',
    params: query
  })
}

// 查询左 4详细
export function getDeal_left_4(id) {
  return request({
    url: '/deal/deal_left_4/' + id,
    method: 'get'
  })
}

// 新增左 4
export function addDeal_left_4(data) {
  return request({
    url: '/deal/deal_left_4',
    method: 'post',
    data: data
  })
}

// 修改左 4
export function updateDeal_left_4(data) {
  return request({
    url: '/deal/deal_left_4',
    method: 'put',
    data: data
  })
}

// 删除左 4
export function delDeal_left_4(id) {
  return request({
    url: '/deal/deal_left_4/' + id,
    method: 'delete'
  })
}
