package me.colinmarsch.scrollathon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val composeView = ComposeView(this).apply {
            setContent { ScrollathonContent() }
        }
        setContentView(composeView)
    }

    @Composable
    private fun ScrollathonContent() {
        // TODO: Handle theming here, fonts, etc
        Overview()
    }
}