import request from '@/utils/request'

// 查询系谱记录列表
export function listGenealogyMy(query) {
  return request({
    url: '/productManagement/genealogyMy/list',
    method: 'get',
    params: query
  })
}

// 查询系谱记录详细
export function getGenealogyMy(id) {
  return request({
    url: '/productManagement/genealogyMy/' + id,
    method: 'get'
  })
}

// 新增系谱记录
export function addGenealogyMy(data) {
  return request({
    url: '/productManagement/genealogyMy',
    method: 'post',
    data: data
  })
}

// 修改系谱记录
export function updateGenealogyMy(data) {
  return request({
    url: '/productManagement/genealogyMy',
    method: 'put',
    data: data
  })
}

// 删除系谱记录
export function delGenealogyMy(id) {
  return request({
    url: '/productManagement/genealogyMy/' + id,
    method: 'delete'
  })
}
