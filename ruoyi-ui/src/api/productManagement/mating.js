import request from '@/utils/request'

// 查询配种档案列表
export function listMating(query) {
  return request({
    url: '/productManagement/mating/list',
    method: 'get',
    params: query
  })
}

// 查询配种档案详细
export function getMating(id) {
  return request({
    url: '/productManagement/mating/' + id,
    method: 'get'
  })
}

// 新增配种档案
export function addMating(data) {
  return request({
    url: '/productManagement/mating',
    method: 'post',
    data: data
  })
}

// 修改配种档案
export function updateMating(data) {
  return request({
    url: '/productManagement/mating',
    method: 'put',
    data: data
  })
}

// 删除配种档案
export function delMating(id) {
  return request({
    url: '/productManagement/mating/' + id,
    method: 'delete'
  })
}
