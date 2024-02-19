package ir.poolitoapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import ir.poolitoapp.R
import ir.poolitoapp.ui.theme.AppTheme
import ir.poolitoapp.ui.theme.spacingMedium
import ir.poolitoapp.ui.theme.spacingMicro

@Composable
fun Brand(modifier: Modifier = Modifier, brandSize: Dp) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            modifier = Modifier.size(brandSize),
            painter = painterResource(
                id = if (!isSystemInDarkTheme()) {
                    R.drawable.logo_light
                } else {
                    R.drawable.logo_dark
                }
            ),
            contentDescription = "LOGO"
        )
        Spacer(modifier = Modifier.height(spacingMedium))
        TextTitleMediumPrimary(text = stringResource(id = R.string.app_name))
        Spacer(modifier = Modifier.height(spacingMicro))
        TextTitleSmall(text = stringResource(id = R.string.app_splash_slogan))
    }
}


@Preview(showBackground = true)
@Composable
fun preview() {
    AppTheme {
        Brand(brandSize = spacingMedium)
    }
}