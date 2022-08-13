import request from '@/utils/request'

// 查询驱虫档案列表
export function listInsecticide(query) {
  return request({
    url: '/productManagement/insecticide/list',
    method: 'get',
    params: query
  })
}

// 查询驱虫档案详细
export function getInsecticide(id) {
  return request({
    url: '/productManagement/insecticide/' + id,
    method: 'get'
  })
}

// 新增驱虫档案
export function addInsecticide(data) {
  return request({
    url: '/productManagement/insecticide',
    method: 'post',
    data: data
  })
}

// 修改驱虫档案
export function updateInsecticide(data) {
  return request({
    url: '/productManagement/insecticide',
    method: 'put',
    data: data
  })
}

// 删除驱虫档案
export function delInsecticide(id) {
  return request({
    url: '/productManagement/insecticide/' + id,
    method: 'delete'
  })
}
