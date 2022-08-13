import request from '@/utils/request'

// 查询生产记录列表
export function listProductrecordMy(query) {
  return request({
    url: '/productManagement/productrecordMy/list',
    method: 'get',
    params: query
  })
}

// 查询生产记录详细
export function getProductrecordMy(id) {
  return request({
    url: '/productManagement/productrecordMy/' + id,
    method: 'get'
  })
}

// 新增生产记录
export function addProductrecordMy(data) {
  return request({
    url: '/productManagement/productrecordMy',
    method: 'post',
    data: data
  })
}

// 修改生产记录
export function updateProductrecordMy(data) {
  return request({
    url: '/productManagement/productrecordMy',
    method: 'put',
    data: data
  })
}

// 删除生产记录
export function delProductrecordMy(id) {
  return request({
    url: '/productManagement/productrecordMy/' + id,
    method: 'delete'
  })
}
