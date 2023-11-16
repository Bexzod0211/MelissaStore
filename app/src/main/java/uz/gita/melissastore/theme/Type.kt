package uz.gita.melissastore.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import uz.gita.melissastore.R

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        color = KarimunBlue,
        fontSize = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro_text_medium)),
        fontWeight = FontWeight.W500
    ),
    displayMedium = TextStyle(
        color = RavenBlack,
        fontSize = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro_text_medium)),
        fontWeight = FontWeight.W500
    ),
    displaySmall = TextStyle(
        color = KettleMan,
        fontSize = 14.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro_text_regular)),
        fontWeight = FontWeight.W400
    ),
    headlineLarge = TextStyle(
        color = KettleMan,
        fontSize = 15.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro_text_medium)),
        fontWeight = FontWeight.W500,
        lineHeight = 24.sp
    ),
    headlineMedium = TextStyle(
        color = Color.White,
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro_text_regular)),
        fontWeight = FontWeight.W500,
        letterSpacing = 0.4.sp,
    ),
    bodyLarge = TextStyle(

    ),

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)