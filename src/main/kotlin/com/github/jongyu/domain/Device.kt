package com.github.jongyu.domain

/**
 * @param deviceName 设备名称
 * @param deviceModel 设备型号
 * @param deviceVersion 系统版本
 * @param udid 唯一编号
 */
data class Device(
        val deviceName: String = "",
        val deviceModel: String = "",
        val deviceVersion: String = "",
        val udid: String = ""
)