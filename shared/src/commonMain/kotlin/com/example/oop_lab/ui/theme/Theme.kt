package com.example.oop_lab.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    background = backgroundWhite,
    onBackground = onBackgroundWhite,
    surface = onBackgroundBlue,
    primary = onTextWhite,
    onSurface = backgroundButtonBlue,
)

@Composable
fun OOPTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}