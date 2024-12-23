package com.example.fooddiaryapp.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.fooddiaryapp.designsystem.color.FoodDiaryColors

private val DarkColorScheme = darkColorScheme(
    primary = FoodDiaryColors.Primary,
    onPrimary = FoodDiaryColors.OnPrimary,
    primaryContainer = FoodDiaryColors.PrimaryContainer,
    onPrimaryContainer = FoodDiaryColors.OnPrimaryContainer,
    secondary = FoodDiaryColors.Secondary,
    onSecondary = FoodDiaryColors.OnSecondary,
    secondaryContainer = FoodDiaryColors.SecondaryContainer,
    onSecondaryContainer = FoodDiaryColors.OnSecondaryContainer,
    tertiary = FoodDiaryColors.Tertiary,
    onTertiary = FoodDiaryColors.OnTertiary,
    tertiaryContainer = FoodDiaryColors.TertiaryContainer,
    onTertiaryContainer = FoodDiaryColors.OnTertiaryContainer,
    error = FoodDiaryColors.Error,
    onError = FoodDiaryColors.OnError,
    errorContainer = FoodDiaryColors.ErrorContainer,
    onErrorContainer = FoodDiaryColors.OnErrorContainer,
    background = FoodDiaryColors.Background,
    onBackground = FoodDiaryColors.OnBackground,
    surface = FoodDiaryColors.Surface,
    onSurface = FoodDiaryColors.OnSurface,
)

private val LightColorScheme = lightColorScheme(
    primary = FoodDiaryColors.Primary,
    onPrimary = FoodDiaryColors.OnPrimary,
    primaryContainer = FoodDiaryColors.PrimaryContainer,
    onPrimaryContainer = FoodDiaryColors.OnPrimaryContainer,
    secondary = FoodDiaryColors.Secondary,
    onSecondary = FoodDiaryColors.OnSecondary,
    secondaryContainer = FoodDiaryColors.SecondaryContainer,
    onSecondaryContainer = FoodDiaryColors.OnSecondaryContainer,
    tertiary = FoodDiaryColors.Tertiary,
    onTertiary = FoodDiaryColors.OnTertiary,
    tertiaryContainer = FoodDiaryColors.TertiaryContainer,
    onTertiaryContainer = FoodDiaryColors.OnTertiaryContainer,
    error = FoodDiaryColors.Error,
    onError = FoodDiaryColors.OnError,
    errorContainer = FoodDiaryColors.ErrorContainer,
    onErrorContainer = FoodDiaryColors.OnErrorContainer,
    background = FoodDiaryColors.Background,
    onBackground = FoodDiaryColors.OnBackground,
    surface = FoodDiaryColors.Surface,
    onSurface = FoodDiaryColors.OnSurface,
)

@Composable
fun FoodDiaryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = FoodDiaryTypography,
        shapes = FoodDiaryShapes,
        content = content
    )
}