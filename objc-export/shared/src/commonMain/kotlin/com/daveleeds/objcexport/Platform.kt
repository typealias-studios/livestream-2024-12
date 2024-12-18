package com.daveleeds.objcexport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform