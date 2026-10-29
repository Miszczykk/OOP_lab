package com.example.oop_lab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform