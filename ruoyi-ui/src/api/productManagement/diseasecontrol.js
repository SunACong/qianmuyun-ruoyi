import request from '@/utils/request'

// 查询疾病防治列表
export function listDiseasecontrol(query) {
  return request({
    url: '/productManagement/diseasecontrol/list',
    method: 'get',
    params: query
  })
}

// 查询疾病防治详细
export function getDiseasecontrol(id) {
  return request({
    url: '/productManagement/diseasecontrol/' + id,
    method: 'get'
  })
}

// 新增疾病防治
export function addDiseasecontrol(data) {
  return request({
    url: '/productManagement/diseasecontrol',
    method: 'post',
    data: data
  })
}

// 修改疾病防治
export function updateDiseasecontrol(data) {
  return request({
    url: '/productManagement/diseasecontrol',
    method: 'put',
    data: data
  })
}

// 删除疾病防治
export function delDiseasecontrol(id) {
  return request({
    url: '/productManagement/diseasecontrol/' + id,
    method: 'delete'
  })
}
