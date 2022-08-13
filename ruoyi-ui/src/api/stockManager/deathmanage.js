import request from '@/utils/request'

// 查询死亡管理列表
export function listDeathmanage(query) {
  return request({
    url: '/stockManager/deathmanage/list',
    method: 'get',
    params: query
  })
}

// 查询死亡管理详细
export function getDeathmanage(id) {
  return request({
    url: '/stockManager/deathmanage/' + id,
    method: 'get'
  })
}

// 新增死亡管理
export function addDeathmanage(data) {
  return request({
    url: '/stockManager/deathmanage',
    method: 'post',
    data: data
  })
}

// 修改死亡管理
export function updateDeathmanage(data) {
  return request({
    url: '/stockManager/deathmanage',
    method: 'put',
    data: data
  })
}

// 删除死亡管理
export function delDeathmanage(id) {
  return request({
    url: '/stockManager/deathmanage/' + id,
    method: 'delete'
  })
}
