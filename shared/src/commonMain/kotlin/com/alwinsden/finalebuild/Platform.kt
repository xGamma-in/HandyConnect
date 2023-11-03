package com.alwinsden.finalebuild

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform