import request from '@/utils/request'

// 查询右 3列表
export function listDeal_right_3(query) {
  return request({
    url: '/deal/deal_right_3/list',
    method: 'get',
    params: query
  })
}

// 查询右 3详细
export function getDeal_right_3(id) {
  return request({
    url: '/deal/deal_right_3/' + id,
    method: 'get'
  })
}

// 新增右 3
export function addDeal_right_3(data) {
  return request({
    url: '/deal/deal_right_3',
    method: 'post',
    data: data
  })
}

// 修改右 3
export function updateDeal_right_3(data) {
  return request({
    url: '/deal/deal_right_3',
    method: 'put',
    data: data
  })
}

// 删除右 3
export function delDeal_right_3(id) {
  return request({
    url: '/deal/deal_right_3/' + id,
    method: 'delete'
  })
}
