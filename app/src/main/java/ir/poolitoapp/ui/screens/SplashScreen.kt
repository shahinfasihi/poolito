package ir.poolitoapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import ir.poolitoapp.ui.components.Brand
import ir.poolitoapp.ui.theme.AppTheme


@Composable()
fun SplashScreen() {
    val configuration = LocalConfiguration.current // need this to accesss screen width
    Brand(modifier = Modifier, brandSize = 0.4 * configuration.screenWidthDp.dp)
}

@Preview(showBackground = true)
@Composable
fun preview() {
    AppTheme {
        SplashScreen()
    }
}