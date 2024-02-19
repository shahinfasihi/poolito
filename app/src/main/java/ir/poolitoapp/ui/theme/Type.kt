package ir.poolitoapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import ir.poolitoapp.R

val AnjomanFont = FontFamily(
    Font(R.font.anjoman)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeXlarge,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    displayMedium = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeLarge,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    displaySmall = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    headlineLarge = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeLarge,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    headlineMedium = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeLarge,
        fontWeight = FontWeight.SemiBold,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    headlineSmall = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeLarge,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    titleLarge = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    titleMedium = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.SemiBold,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    titleSmall = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    bodyLarge = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    bodyMedium = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    bodySmall = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMedium,
        fontWeight = FontWeight.ExtraLight,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    labelLarge = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeSmall,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    labelMedium = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeSmall,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    ),
    labelSmall = TextStyle(
        fontFamily = AnjomanFont,
        fontSize = textSizeMicro,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Right,
        textDirection = TextDirection.Content
    )
)