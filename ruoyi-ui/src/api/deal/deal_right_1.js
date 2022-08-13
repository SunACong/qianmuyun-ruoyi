import request from '@/utils/request'

// 查询右 1列表
export function listDeal_right_1(query) {
  return request({
    url: '/deal/deal_right_1/list',
    method: 'get',
    params: query
  })
}

// 查询右 1详细
export function getDeal_right_1(id) {
  return request({
    url: '/deal/deal_right_1/' + id,
    method: 'get'
  })
}

// 新增右 1
export function addDeal_right_1(data) {
  return request({
    url: '/deal/deal_right_1',
    method: 'post',
    data: data
  })
}

// 修改右 1
export function updateDeal_right_1(data) {
  return request({
    url: '/deal/deal_right_1',
    method: 'put',
    data: data
  })
}

// 删除右 1
export function delDeal_right_1(id) {
  return request({
    url: '/deal/deal_right_1/' + id,
    method: 'delete'
  })
}
