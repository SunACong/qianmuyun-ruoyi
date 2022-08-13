import request from '@/utils/request'

// 查询左 2列表
export function listDeal_left_2(query) {
  return request({
    url: '/deal/deal_left_2/list',
    method: 'get',
    params: query
  })
}

// 查询左 2详细
export function getDeal_left_2(id) {
  return request({
    url: '/deal/deal_left_2/' + id,
    method: 'get'
  })
}

// 新增左 2
export function addDeal_left_2(data) {
  return request({
    url: '/deal/deal_left_2',
    method: 'post',
    data: data
  })
}

// 修改左 2
export function updateDeal_left_2(data) {
  return request({
    url: '/deal/deal_left_2',
    method: 'put',
    data: data
  })
}

// 删除左 2
export function delDeal_left_2(id) {
  return request({
    url: '/deal/deal_left_2/' + id,
    method: 'delete'
  })
}
