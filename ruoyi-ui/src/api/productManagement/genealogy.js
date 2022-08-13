import request from '@/utils/request'

// 查询每种羊只的数目
export function sheepSpeciesGenealogy() {
  return request({
    url: '/productManagement/genealogy/sheepSpecies',
    method: 'get',
  })
}


// 查询养殖场分组数据
export function farmlocListGenealogy() {
  return request({
    url: '/productManagement/genealogy/farmlocList',
    method: 'get',
  })
}

// 查询系谱档案列表
export function listGenealogy(query) {
  return request({
    url: '/productManagement/genealogy/list',
    method: 'get',
    params: query,
  })
}


// 查询系谱档案详细
export function getGenealogy(id) {
  return request({
    url: '/productManagement/genealogy/' + id,
    method: 'get',
  })
}

// 新增系谱档案
export function addGenealogy(data) {
  return request({
    url: '/productManagement/genealogy',
    method: 'post',
    data: data,
  })
}

// 修改系谱档案
export function updateGenealogy(data) {
  return request({
    url: '/productManagement/genealogy',
    method: 'put',
    data: data,
  })
}

// 删除系谱档案
export function delGenealogy(id) {
  return request({
    url: '/productManagement/genealogy/' + id,
    method: 'delete',
  })
}
