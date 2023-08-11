package com.lighttigerxiv.catppuccinpalette.screens.preview

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.lighttigerxiv.catppuccin_palette.CatppuccinTheme
import com.lighttigerxiv.catppuccin_palette.getCatppuccinThemes
import com.lighttigerxiv.catppuccin_palette.getFrappeColors
import com.lighttigerxiv.catppuccin_palette.getLatteColors
import com.lighttigerxiv.catppuccin_palette.getMacchiatoColors
import com.lighttigerxiv.catppuccin_palette.getMochaColors
import com.lighttigerxiv.catppuccinpalette.getNavigationItems
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PreviewScreenVM(application: Application) : AndroidViewModel(application) {


    val themes = getCatppuccinThemes()
    val navigationItems = getNavigationItems()

    private val _currentTheme = MutableStateFlow(getMochaColors())
    val currentTheme = _currentTheme.asStateFlow()
    fun updateCurrentTheme(newValue: CatppuccinTheme) {
        _currentTheme.update { newValue }
    }

    private val _currentThemeName = MutableStateFlow("Mocha")
    val currentThemeName= _currentThemeName.asStateFlow()
    fun updateCurrentThemeName(newValue:String) {
        _currentThemeName.update { newValue }
    }
}