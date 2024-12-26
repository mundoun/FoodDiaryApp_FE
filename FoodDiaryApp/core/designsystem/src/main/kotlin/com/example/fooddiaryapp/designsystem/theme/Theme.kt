package com.fooddiaryapp.core.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.fooddiaryapp.designsystem.color.DiaryColors
import com.example.fooddiaryapp.designsystem.theme.DiaryShapes
import com.example.fooddiaryapp.designsystem.theme.DiaryTypography

// Light 테마용 ColorScheme
private val LightColorScheme = lightColorScheme(
    primary = DiaryColors.Brand.Primary,
    onPrimary = DiaryColors.Text.OnBrand,
    primaryContainer = DiaryColors.Brand.PrimaryLight,
    onPrimaryContainer = DiaryColors.Text.Primary,

    secondary = DiaryColors.Brand.PrimaryDark,
    onSecondary = DiaryColors.Text.OnBrand,
    secondaryContainer = DiaryColors.Brand.Primary20,
    onSecondaryContainer = DiaryColors.Text.Primary,

    background = DiaryColors.Background.Primary,
    onBackground = DiaryColors.Text.Primary,

    surface = DiaryColors.Background.Surface,
    onSurface = DiaryColors.Text.Primary,
    surfaceVariant = DiaryColors.Background.SurfaceVariant,
    onSurfaceVariant = DiaryColors.Text.Secondary,

    error = DiaryColors.Status.Error,
    outline = DiaryColors.Component.Card.Border
)

// Dark 테마용 ColorScheme - 현재는 Dark 테마를 지원하지 않으므로 Light와 동일하게 설정
private val DarkColorScheme = LightColorScheme

@Composable
fun FoodDiaryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    // 현재는 다크 테마를 지원하지 않으므로 항상 Light 테마 사용
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // 상태바 색상 설정
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = DiaryTypography,
        shapes = DiaryShapes,
        content = content
    )
}