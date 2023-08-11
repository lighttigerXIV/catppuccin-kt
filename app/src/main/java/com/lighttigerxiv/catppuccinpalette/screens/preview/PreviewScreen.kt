package com.lighttigerxiv.catppuccinpalette.screens.preview

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lighttigerxiv.catppuccin_palette.CatppuccinTheme
import com.lighttigerxiv.catppuccin_palette.ColorData
import com.lighttigerxiv.catppuccinpalette.R
import com.lighttigerxiv.catppuccinpalette.backend.constants.INTER_MEDIUM
import com.lighttigerxiv.catppuccinpalette.backend.constants.MEDIUM
import com.lighttigerxiv.catppuccinpalette.backend.constants.SMALL
import com.lighttigerxiv.catppuccinpalette.backend.constants.TEXT
import com.lighttigerxiv.catppuccinpalette.backend.constants.HEADER
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PreviewScreen(
    vm: PreviewScreenVM,
    name: String,
    theme: CatppuccinTheme
) {

    val accentColors = listOf(
        theme.rosewater,
        theme.flamingo,
        theme.pink,
        theme.mauve,
        theme.red,
        theme.maroon,
        theme.peach,
        theme.yellow,
        theme.green,
        theme.teal,
        theme.sky,
        theme.sapphire,
        theme.blue,
        theme.lavender
    )

    val textColors = listOf(
        theme.text,
        theme.subtext1,
        theme.subtext0
    )

    val surfaceColors = listOf(
        theme.overlay2,
        theme.overlay1,
        theme.overlay0,
        theme.surface2,
        theme.surface1,
        theme.surface0,
        theme.base,
        theme.mantle,
        theme.crust
    )

    val pagerState = rememberPagerState(0)
    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            modifier = Modifier.offset(x = MEDIUM),
            text = name,
            fontSize = HEADER,
            color = Color(theme.text.hex.long)
        )

        Spacer(modifier = Modifier.height(SMALL))


        TabRow(
            selectedTabIndex = pagerState.currentPage,
            indicator = {},
            divider = {},
            containerColor = Color(theme.base.hex.long),
        ) {

            Tab(
                text = {
                    Text(
                        text = "Accents",
                        fontSize = 16.sp,
                        color = Color(theme.text.hex.long)
                    )
                },
                selected = pagerState.currentPage == 0,
                selectedContentColor = Color(theme.text.hex.long),
                unselectedContentColor = Color(theme.text.hex.long),
                onClick = { scope.launch { pagerState.animateScrollToPage(0) } },
                modifier = Modifier
                    .padding(SMALL)
                    .clip(CircleShape)
                    .background(if (pagerState.currentPage == 0) Color(theme.surface0.hex.long) else Color.Transparent)
            )

            Tab(
                text = {
                    Text(
                        text = "Text",
                        fontSize = 16.sp,
                        color = Color(theme.text.hex.long)
                    )
                },
                selected = pagerState.currentPage == 1,
                selectedContentColor = Color(theme.text.hex.long),
                unselectedContentColor = Color(theme.text.hex.long),
                onClick = { scope.launch { pagerState.animateScrollToPage(1) } },
                modifier = Modifier
                    .padding(SMALL)
                    .clip(CircleShape)
                    .background(if (pagerState.currentPage == 1) Color(theme.surface0.hex.long) else Color.Transparent)
            )

            Tab(
                text = {
                    Text(
                        text = "Surface",
                        fontSize = 16.sp,
                        color = Color(theme.text.hex.long)
                    )
                },
                selected = pagerState.currentPage == 2,
                selectedContentColor = Color(theme.text.hex.long),
                unselectedContentColor = Color(theme.text.hex.long),
                onClick = { scope.launch { pagerState.animateScrollToPage(2) } },
                modifier = Modifier
                    .padding(SMALL)
                    .clip(CircleShape)
                    .background(if (pagerState.currentPage == 2) Color(theme.surface0.hex.long) else Color.Transparent)
            )
        }

        Spacer(modifier = Modifier.height(MEDIUM))

        HorizontalPager(state = pagerState, pageCount = 3) { currentPage ->

            when (currentPage) {
                0 -> {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .weight(1f, fill = true)
                    ) {

                        items(items = accentColors, key = { it.name }) { accent ->
                            AccentColorPreview(accent = accent, theme = theme)
                            Spacer(modifier = Modifier.height(SMALL))
                        }
                    }
                }
                1 -> {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .weight(1f, fill = true)
                    ) {

                        items(items = textColors, key = { it.name }) { color ->
                            ColorPreview(color = color, theme = theme)
                            Spacer(modifier = Modifier.height(SMALL))
                        }
                    }
                }
                2 -> {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .weight(1f, fill = true)
                    ) {

                        items(items = surfaceColors, key = { it.name }) { color ->
                            ColorPreview(color = color, theme = theme)
                            Spacer(modifier = Modifier.height(SMALL))
                        }
                    }
                }
            }

        }
    }
}

@Composable
fun AccentColorPreview(accent: ColorData, theme: CatppuccinTheme) {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var checked by remember { mutableStateOf(true) }

    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(MEDIUM))
            .background(Color(theme.crust.hex.long))
            .padding(MEDIUM),
    ) {

        Text(
            modifier = Modifier.offset(x = SMALL),
            text = accent.name,
            color = Color(theme.text.hex.long),
            fontSize = TEXT
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .clip(CircleShape)
                .background(Color(accent.hex.long))
                .border(1.dp, Color(theme.text.hex.long), shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Hex",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = accent.hex.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                accent.hex.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${accent.hex.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {

                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }
        }

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "RGB",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = accent.rgb.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                accent.rgb.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${accent.rgb.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {

                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }
        }

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "HSL",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = accent.hsl.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                accent.hsl.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${accent.hsl.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {


                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }


        }

        Spacer(modifier = Modifier.height(SMALL))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color(theme.surface0.hex.long))
        )

        Spacer(modifier = Modifier.height(SMALL))

        Row {
            androidx.compose.material3.Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(accent.hex.long)
                )
            ) {
                Text(text = "Button Example", color = Color(theme.crust.hex.long))
            }

            Spacer(modifier = Modifier.width(SMALL))

            Switch(
                checked = checked,
                onCheckedChange = { checked = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(accent.hex.long),
                    checkedTrackColor = Color(theme.base.hex.long),
                    checkedBorderColor = Color(accent.hex.long),
                    uncheckedThumbColor = Color(theme.surface2.hex.long),
                    uncheckedTrackColor = Color(theme.base.hex.long),
                    uncheckedBorderColor = Color(accent.hex.long),
                )
            )
        }
    }
}


@Composable
fun ColorPreview(color: ColorData, theme: CatppuccinTheme) {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(MEDIUM))
            .padding(MEDIUM),
    ) {

        Text(
            modifier = Modifier.offset(SMALL),
            text = color.name,
            color = Color(theme.text.hex.long),
            fontSize = TEXT
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .clip(CircleShape)
                .background(Color(color.hex.long))
                .border(1.dp, Color(theme.text.hex.long), shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Hex",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = color.hex.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                color.hex.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${color.hex.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {

                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }
        }

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "RGB",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = color.rgb.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                color.rgb.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${color.rgb.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {

                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }
        }

        Spacer(modifier = Modifier.height(SMALL))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(SMALL))
                .background(Color(theme.surface0.hex.long))
                .padding(INTER_MEDIUM),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "HSL",
                fontSize = TEXT,
                fontWeight = FontWeight.Bold,
                color = Color(theme.text.hex.long)
            )

            Spacer(modifier = Modifier.height(SMALL))

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = true)
            )

            Text(text = color.hsl.value, fontSize = TEXT, color = Color(theme.text.hex.long))

            Spacer(modifier = Modifier.width(MEDIUM))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(SMALL))
                    .background(Color(theme.mantle.hex.long))
                    .padding(SMALL)
                    .clickable {
                        clipboardManager.setPrimaryClip(
                            ClipData.newPlainText(
                                "text",
                                color.hsl.value
                            )
                        )

                        scope.launch {
                            Toast
                                .makeText(
                                    context,
                                    "Copied ${color.hsl.value}",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        }
                    }
            ) {


                Icon(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = null,
                    tint = Color(theme.text.hex.long)
                )
            }


        }
    }
}