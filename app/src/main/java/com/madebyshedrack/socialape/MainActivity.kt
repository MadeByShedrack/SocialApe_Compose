package com.madebyshedrack.socialape

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.madebyshedrack.socialape.ui.screens.Routes
import com.madebyshedrack.socialape.ui.screens.SocialApeNavigationGraph
import com.madebyshedrack.socialape.ui.screens.UserInputScreen
import com.madebyshedrack.socialape.ui.screens.WelcomeScreen
import com.madebyshedrack.socialape.ui.theme.SocialApeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SocialApeTheme {
               SocialApeApp()
            }
        }
    }

    @Composable
    fun SocialApeApp() {
        SocialApeNavigationGraph()
    }
}

