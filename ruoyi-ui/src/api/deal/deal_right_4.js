import request from '@/utils/request'

// 查询右 4列表
export function listDeal_right_4(query) {
  return request({
    url: '/deal/deal_right_4/list',
    method: 'get',
    params: query
  })
}

// 查询右 4详细
export function getDeal_right_4(id) {
  return request({
    url: '/deal/deal_right_4/' + id,
    method: 'get'
  })
}

// 新增右 4
export function addDeal_right_4(data) {
  return request({
    url: '/deal/deal_right_4',
    method: 'post',
    data: data
  })
}

// 修改右 4
export function updateDeal_right_4(data) {
  return request({
    url: '/deal/deal_right_4',
    method: 'put',
    data: data
  })
}

// 删除右 4
export function delDeal_right_4(id) {
  return request({
    url: '/deal/deal_right_4/' + id,
    method: 'delete'
  })
}
