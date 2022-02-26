package com.metehanbolat.onboardingnewsplash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.onboardingnewsplash.ui.theme.OnboardingNewSplashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnboardingNewSplashTheme {

            }
        }
    }
}
