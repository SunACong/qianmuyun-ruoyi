import request from '@/utils/request'

// 查询出售管理列表
export function listGoatsell(query) {
  return request({
    url: '/stockManager/goatsell/list',
    method: 'get',
    params: query
  })
}

// 查询出售管理详细
export function getGoatsell(id) {
  return request({
    url: '/stockManager/goatsell/' + id,
    method: 'get'
  })
}

// 新增出售管理
export function addGoatsell(data) {
  return request({
    url: '/stockManager/goatsell',
    method: 'post',
    data: data
  })
}

// 修改出售管理
export function updateGoatsell(data) {
  return request({
    url: '/stockManager/goatsell',
    method: 'put',
    data: data
  })
}

// 删除出售管理
export function delGoatsell(id) {
  return request({
    url: '/stockManager/goatsell/' + id,
    method: 'delete'
  })
}
