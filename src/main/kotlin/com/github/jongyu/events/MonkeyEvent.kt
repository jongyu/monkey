package com.github.jongyu.events

/**
 * @param type 事件类型
 */
abstract class MonkeyEvent(private val type: Int) {

    /**
     * 注入事件
     */
    abstract fun injectEvent(): Int

    companion object {
        const val EVENT_TYPE_TAP = 1
        const val EVENT_TYPE_SWIPE = 2
        const val EVENT_TYPE_LAUNCH = 3
        const val EVENT_TYPE_BACK = 4
        const val EVENT_TYPE_HOME_KEY = 5
        const val EVENT_TYPE_VOLUME_KEY = 6
        const val INJECT_SUCCESS = 0
        const val INJECT_FAILURE = -1
    }

}