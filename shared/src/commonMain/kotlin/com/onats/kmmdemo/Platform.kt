package com.onats.kmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform