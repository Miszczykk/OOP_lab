package com.example.oop_lab

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "oop_lab",
    ) {
        App()
    }
}