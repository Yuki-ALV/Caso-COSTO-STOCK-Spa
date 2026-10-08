package com.example.costostock.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = OrangePrimary,
    secondary = OrangeLight,
    tertiary = DarkButton
)

private val LightColorScheme = lightColorScheme(
    primary = OrangePrimary,
    secondary = OrangeLight,
    tertiary = DarkButton,
    background = Color(0xFFF9F9F9),
    surface = Color.White
)

@Composable
fun CostoStockTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}