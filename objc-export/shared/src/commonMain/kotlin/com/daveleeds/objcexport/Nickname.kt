package com.daveleeds.objcexport

class Nickname(
    private val adjective: String,
    private val noun: String
) {
    override fun toString() = "$adjective $noun"

    companion object {
        val Default = Nickname("", "")
    }
}
