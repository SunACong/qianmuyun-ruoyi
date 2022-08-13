import request from '@/utils/request'

// 查询可视管理列表
export function listVideo(query) {
  return request({
    url: '/videoManager/video/list',
    method: 'get',
    params: query
  })
}

// 查询可视管理详细
export function getVideo(id) {
  return request({
    url: '/videoManager/video/' + id,
    method: 'get'
  })
}

// 新增可视管理
export function addVideo(data) {
  return request({
    url: '/videoManager/video',
    method: 'post',
    data: data
  })
}

// 修改可视管理
export function updateVideo(data) {
  return request({
    url: '/videoManager/video',
    method: 'put',
    data: data
  })
}

// 删除可视管理
export function delVideo(id) {
  return request({
    url: '/videoManager/video/' + id,
    method: 'delete'
  })
}
