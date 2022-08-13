import request from '@/utils/request'

// 查询阶段营养档案列表
export function listNutrition(query) {
  return request({
    url: '/productManagement/nutrition/list',
    method: 'get',
    params: query
  })
}

// 查询阶段营养档案详细
export function getNutrition(id) {
  return request({
    url: '/productManagement/nutrition/' + id,
    method: 'get'
  })
}

// 新增阶段营养档案
export function addNutrition(data) {
  return request({
    url: '/productManagement/nutrition',
    method: 'post',
    data: data
  })
}

// 修改阶段营养档案
export function updateNutrition(data) {
  return request({
    url: '/productManagement/nutrition',
    method: 'put',
    data: data
  })
}

// 删除阶段营养档案
export function delNutrition(id) {
  return request({
    url: '/productManagement/nutrition/' + id,
    method: 'delete'
  })
}
