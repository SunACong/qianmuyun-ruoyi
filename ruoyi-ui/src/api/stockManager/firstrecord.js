import request from '@/utils/request'

// 查询养殖场数目
export function farmlocList(query) {
  return request({
    url: '/stockManager/firstrecord/farmlocList',
    method: 'get',
    params: query
  })
}

// 查询每种羊只数目
export function sheepNumList(query) {
  return request({
    url: '/stockManager/firstrecord/sheepNumList',
    method: 'get',
    params: query
  })
}


// 查询初次录入列表
export function listFirstrecord(query) {
  return request({
    url: '/stockManager/firstrecord/list',
    method: 'get',
    params: query
  })
}

// 查询初次录入详细
export function getFirstrecord(id) {
  return request({
    url: '/stockManager/firstrecord/' + id,
    method: 'get'
  })
}

// 新增初次录入
export function addFirstrecord(data) {
  return request({
    url: '/stockManager/firstrecord',
    method: 'post',
    data: data
  })
}

// 修改初次录入
export function updateFirstrecord(data) {
  return request({
    url: '/stockManager/firstrecord',
    method: 'put',
    data: data
  })
}

// 删除初次录入
export function delFirstrecord(id) {
  return request({
    url: '/stockManager/firstrecord/' + id,
    method: 'delete'
  })
}
