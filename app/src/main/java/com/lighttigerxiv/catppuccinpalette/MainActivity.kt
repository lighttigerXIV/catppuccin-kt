package com.lighttigerxiv.catppuccinpalette

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.lighttigerxiv.catppuccin_palette.Label
import com.lighttigerxiv.catppuccin_palette.getFrappeColors
import com.lighttigerxiv.catppuccin_palette.getHexColor
import com.lighttigerxiv.catppuccin_palette.getLatteColors
import com.lighttigerxiv.catppuccin_palette.getMacchiatoColors
import com.lighttigerxiv.catppuccin_palette.getMochaColors
import com.lighttigerxiv.catppuccinpalette.backend.constants.INTER_MEDIUM
import com.lighttigerxiv.catppuccinpalette.backend.constants.MEDIUM
import com.lighttigerxiv.catppuccinpalette.backend.constants.SMALL
import com.lighttigerxiv.catppuccinpalette.screens.preview.PreviewScreen
import com.lighttigerxiv.catppuccinpalette.screens.preview.PreviewScreenVM
import com.lighttigerxiv.catppuccinpalette.ui.theme.CatppuccinPaletteTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm = ViewModelProvider(this)[PreviewScreenVM::class.java]

        setContent {
            CatppuccinPaletteTheme {

                val themes = vm.themes
                val currentTheme = vm.currentTheme.collectAsState().value
                val currentThemeName = vm.currentThemeName.collectAsState().value


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(currentTheme.base.hex.long))
                        .padding(MEDIUM)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f, fill = true)
                    ) {
                        PreviewScreen(
                            vm = vm,
                            name = currentThemeName,
                            theme = currentTheme
                        )
                    }

                    Spacer(modifier = Modifier.height(MEDIUM))

                    Row(
                        modifier = Modifier
                            .height(70.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        LazyRow(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(Color(currentTheme.crust.hex.long))
                                .padding(
                                    start = MEDIUM,
                                    end = MEDIUM,
                                    top = INTER_MEDIUM,
                                    bottom = INTER_MEDIUM
                                )
                        ) {
                            itemsIndexed(
                                items = vm.navigationItems,
                                key = { index, item -> item.route }
                            ) { index, navigationItem ->

                                val selected =
                                    currentTheme == themes.mocha && index == 0 || currentTheme == themes.macchiato && index == 1 || currentTheme == themes.frappe && index == 2 || currentTheme == themes.latte && index == 3

                                Row {
                                    Spacer(modifier = Modifier.width(SMALL))

                                    Column(
                                        modifier = Modifier.clickable {

                                            when(index){
                                                0-> {
                                                    vm.updateCurrentTheme(themes.mocha)
                                                    vm.updateCurrentThemeName("Mocha")
                                                }
                                                1->{
                                                    vm.updateCurrentTheme(themes.macchiato)
                                                    vm.updateCurrentThemeName("Macchiato")
                                                }
                                                2->{
                                                    vm.updateCurrentTheme(themes.frappe)
                                                    vm.updateCurrentThemeName("Frappe")
                                                }
                                                else->{
                                                    vm.updateCurrentTheme(themes.latte)
                                                    vm.updateCurrentThemeName("Latte")
                                                }
                                            }
                                        },
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Icon(
                                            modifier = Modifier
                                                .height(24.dp)
                                                .width(24.dp),
                                            painter = painterResource(id = if(selected) navigationItem.activeIcon else navigationItem.inactiveIcon),
                                            contentDescription = null,
                                            tint = Color(currentTheme.text.hex.long)
                                        )

                                        Text(
                                            text = navigationItem.name,
                                            color = Color(currentTheme.text.hex.long),
                                            fontSize = 12.sp
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(SMALL))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}