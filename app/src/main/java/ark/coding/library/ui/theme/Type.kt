package ark.coding.library.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import ark.coding.library.R

val PoppinsFamily = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)

val NewYorkFamily = FontFamily(
    Font(R.font.newyork)
)

val Typography = Typography(
    defaultFontFamily = PoppinsFamily
)