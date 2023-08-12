package com.lighttigerxiv.catppuccinkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lighttigerxiv.catppuccin_kt.getMochaColors
import com.lighttigerxiv.catppuccinkotlin.ui.theme.CatppuccinKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatppuccinKotlinTheme {
                Column {
                    Text(text = getMochaColors().blue.hex.code)
                    Text(text = getMochaColors().blue.rgb.asString())
                    Text(text = getMochaColors().blue.hsl.asString())

                    Box(modifier = Modifier.height(100.dp).width(100.dp).background(Color(getMochaColors().blue.hex.asLong())))
                }
            }
        }
    }
}