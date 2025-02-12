package com.a10miaomiao.bilimiao.comm.entity

data class ResultListInfo2<T>(
    val code: Int,
    var msg: String,
    val result: List<T>,
) {
    // 响应结果是否为成功
    val isSuccess get() = code == 0
}