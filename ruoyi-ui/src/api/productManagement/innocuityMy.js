import request from '@/utils/request'

// 查询无害化处理列表
export function listInnocuityMy(query) {
  return request({
    url: '/productManagement/innocuityMy/list',
    method: 'get',
    params: query
  })
}

// 查询无害化处理详细
export function getInnocuityMy(id) {
  return request({
    url: '/productManagement/innocuityMy/' + id,
    method: 'get'
  })
}

// 新增无害化处理
export function addInnocuityMy(data) {
  return request({
    url: '/productManagement/innocuityMy',
    method: 'post',
    data: data
  })
}

// 修改无害化处理
export function updateInnocuityMy(data) {
  return request({
    url: '/productManagement/innocuityMy',
    method: 'put',
    data: data
  })
}

// 删除无害化处理
export function delInnocuityMy(id) {
  return request({
    url: '/productManagement/innocuityMy/' + id,
    method: 'delete'
  })
}
