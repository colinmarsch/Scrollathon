package me.colinmarsch.scrollathon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Overview(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier.wrapContentHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(R.string.distance_title),
                fontSize = 48.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 128.dp),
            )
            // TODO: Back the text here from the data in the DB
            Text(text = "3.28 km", fontSize = 48.sp, textAlign = TextAlign.Center)
        }

        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(bottom = 64.dp)) {
                Text(text = stringResource(R.string.historical_button_text), fontSize = 32.sp)
            }
        }
    }
}

@Preview
@Composable
private fun OverviewPreview() {
    Overview()
}