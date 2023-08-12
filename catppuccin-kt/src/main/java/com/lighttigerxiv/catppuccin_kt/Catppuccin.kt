package com.lighttigerxiv.catppuccin_kt

enum class Label {
    LATTE_ROSEWATER,
    LATTE_FLAMINGO,
    LATTE_PINK,
    LATTE_MAUVE,
    LATTE_RED,
    LATTE_MAROON,
    LATTE_PEACH,
    LATTE_YELLOW,
    LATTE_GREEN,
    LATTE_TEAL,
    LATTE_SKY,
    LATTE_SAPPHIRE,
    LATTE_BLUE,
    LATTE_LAVENDER,
    LATTE_TEXT,
    LATTE_SUBTEXT1,
    LATTE_SUBTEXT0,
    LATTE_OVERLAY2,
    LATTE_OVERLAY1,
    LATTE_OVERLAY0,
    LATTE_SURFACE2,
    LATTE_SURFACE1,
    LATTE_SURFACE0,
    LATTE_BASE,
    LATTE_MANTLE,
    LATTE_CRUST,
    FRAPPE_ROSEWATER,
    FRAPPE_FLAMINGO,
    FRAPPE_PINK,
    FRAPPE_MAUVE,
    FRAPPE_RED,
    FRAPPE_MAROON,
    FRAPPE_PEACH,
    FRAPPE_YELLOW,
    FRAPPE_GREEN,
    FRAPPE_TEAL,
    FRAPPE_SKY,
    FRAPPE_SAPPHIRE,
    FRAPPE_BLUE,
    FRAPPE_LAVENDER,
    FRAPPE_TEXT,
    FRAPPE_SUBTEXT1,
    FRAPPE_SUBTEXT0,
    FRAPPE_OVERLAY2,
    FRAPPE_OVERLAY1,
    FRAPPE_OVERLAY0,
    FRAPPE_SURFACE2,
    FRAPPE_SURFACE1,
    FRAPPE_SURFACE0,
    FRAPPE_BASE,
    FRAPPE_MANTLE,
    FRAPPE_CRUST,
    MACCHIATO_ROSEWATER,
    MACCHIATO_FLAMINGO,
    MACCHIATO_PINK,
    MACCHIATO_MAUVE,
    MACCHIATO_RED,
    MACCHIATO_MAROON,
    MACCHIATO_PEACH,
    MACCHIATO_YELLOW,
    MACCHIATO_GREEN,
    MACCHIATO_TEAL,
    MACCHIATO_SKY,
    MACCHIATO_SAPPHIRE,
    MACCHIATO_BLUE,
    MACCHIATO_LAVENDER,
    MACCHIATO_TEXT,
    MACCHIATO_SUBTEXT1,
    MACCHIATO_SUBTEXT0,
    MACCHIATO_OVERLAY2,
    MACCHIATO_OVERLAY1,
    MACCHIATO_OVERLAY0,
    MACCHIATO_SURFACE2,
    MACCHIATO_SURFACE1,
    MACCHIATO_SURFACE0,
    MACCHIATO_BASE,
    MACCHIATO_MANTLE,
    MACCHIATO_CRUST,
    MOCHA_ROSEWATER,
    MOCHA_FLAMINGO,
    MOCHA_PINK,
    MOCHA_MAUVE,
    MOCHA_RED,
    MOCHA_MAROON,
    MOCHA_PEACH,
    MOCHA_YELLOW,
    MOCHA_GREEN,
    MOCHA_TEAL,
    MOCHA_SKY,
    MOCHA_SAPPHIRE,
    MOCHA_BLUE,
    MOCHA_LAVENDER,
    MOCHA_TEXT,
    MOCHA_SUBTEXT1,
    MOCHA_SUBTEXT0,
    MOCHA_OVERLAY2,
    MOCHA_OVERLAY1,
    MOCHA_OVERLAY0,
    MOCHA_SURFACE2,
    MOCHA_SURFACE1,
    MOCHA_SURFACE0,
    MOCHA_BASE,
    MOCHA_MANTLE,
    MOCHA_CRUST,
}


fun getCatppuccinThemes(): Catppuccin {
    return Catppuccin(
        latte = getLatteColors(),
        frappe = getFrappeColors(),
        macchiato = getMacchiatoColors(),
        mocha = getMochaColors()
    )
}

data class Catppuccin(
    val latte: CatppuccinTheme,
    val frappe: CatppuccinTheme,
    val macchiato: CatppuccinTheme,
    val mocha: CatppuccinTheme
)

data class CatppuccinTheme(
    val rosewater: ColorData,
    val flamingo: ColorData,
    val pink: ColorData,
    val mauve: ColorData,
    val red: ColorData,
    val maroon: ColorData,
    val peach: ColorData,
    val yellow: ColorData,
    val green: ColorData,
    val teal: ColorData,
    val sky: ColorData,
    val sapphire: ColorData,
    val blue: ColorData,
    val lavender: ColorData,
    val text: ColorData,
    val subtext1: ColorData,
    val subtext0: ColorData,
    val overlay2: ColorData,
    val overlay1: ColorData,
    val overlay0: ColorData,
    val surface2: ColorData,
    val surface1: ColorData,
    val surface0: ColorData,
    val base: ColorData,
    val mantle: ColorData,
    val crust: ColorData
)

data class ColorData(
    val name: String,
    val hex: HEX,
    val rgb: RGB,
    val hsl: HSL
)

data class HEX(val code: String
) {
    fun asLong(): Long {
        return java.lang.Long.decode(code.replace("#", "#ff"))
    }
}

data class RGB(
    val r: Int,
    val g: Int,
    val b: Int
){
    fun asString(): String{
        return "rgb($r, $g, $b)"
    }
}

data class HSL(
    val h: Int,
    val s: Int,
    val l: Int,
){
    fun asString(): String{
        return "rgb($h, $s%, $l%)"
    }
}


fun getLatteColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                code = "#dc8a78"
            ),
            rgb = RGB(
                r = 220,
                g = 138,
                b = 120,
            ),
            hsl = HSL(
                h = 11,
                s = 59,
                l = 67,
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                code = "#dd7878"
            ),
            rgb = RGB(
                r = 221,
                g = 120,
                b = 120,
            ),
            hsl = HSL(
                h = 0,
                s = 60,
                l = 67,
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                code = "#ea76cb"
            ),
            rgb = RGB(
                r = 234,
                g = 118,
                b = 203,
            ),
            hsl = HSL(
                h = 316,
                s = 73,
                l = 69,
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                code = "#8839ef"
            ),
            rgb = RGB(
                r = 136,
                g = 57,
                b = 239,
            ),
            hsl = HSL(
                h = 266,
                s = 85,
                l = 58,
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                code = "#d20f39"
            ),
            rgb = RGB(
                r = 210,
                g = 15,
                b = 57,
            ),
            hsl = HSL(
                h = 347,
                s = 87,
                l = 44,
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                code = "#e64553"
            ),
            rgb = RGB(
                r = 230,
                g = 69,
                b = 83,
            ),
            hsl = HSL(
                h = 355,
                s = 76,
                l = 59,
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                code = "#fe640b"
            ),
            rgb = RGB(
                r = 254,
                g = 100,
                b = 11,
            ),
            hsl = HSL(
                h = 22,
                s = 99,
                l = 52,
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                code = "#df8e1d"
            ),
            rgb = RGB(
                r = 223,
                g = 142,
                b = 29,
            ),
            hsl = HSL(
                h = 35,
                s = 77,
                l = 49,
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                code = "#40a02b"
            ),
            rgb = RGB(
                r = 64,
                g = 160,
                b = 43,
            ),
            hsl = HSL(
                h = 109,
                s = 58,
                l = 40,
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                code = "#179299"
            ),
            rgb = RGB(
                r = 23,
                g = 146,
                b = 153,
            ),
            hsl = HSL(
                h = 183,
                s = 74,
                l = 35,
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                code = "#04a5e5"
            ),
            rgb = RGB(
                r = 4,
                g = 165,
                b = 229,
            ),
            hsl = HSL(
                h = 197,
                s = 97,
                l = 46,
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                code = "#209fb5"
            ),
            rgb = RGB(
                r = 32,
                g = 159,
                b = 181,
            ),
            hsl = HSL(
                h = 189,
                s = 70,
                l = 42,
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                code = "#1e66f5"
            ),
            rgb = RGB(
                r = 30,
                g = 102,
                b = 245,
            ),
            hsl = HSL(
                h = 220,
                s = 91,
                l = 54,
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                code = "#7287fd"
            ),
            rgb = RGB(
                r = 114,
                g = 135,
                b = 253,
            ),
            hsl = HSL(
                h = 231,
                s = 97,
                l = 72,
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                code = "#4c4f69"
            ),
            rgb = RGB(
                r = 76,
                g = 79,
                b = 105,
            ),
            hsl = HSL(
                h = 234,
                s = 16,
                l = 35,
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                code = "#5c5f77"
            ),
            rgb = RGB(
                r = 92,
                g = 95,
                b = 119,
            ),
            hsl = HSL(
                h = 233,
                s = 13,
                l = 41,
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                code = "#6c6f85"
            ),
            rgb = RGB(
                r = 108,
                g = 111,
                b = 133,
            ),
            hsl = HSL(
                h = 233,
                s = 10,
                l = 47,
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                code = "#7c7f93"
            ),
            rgb = RGB(
                r = 124,
                g = 127,
                b = 147,
            ),
            hsl = HSL(
                h = 232,
                s = 10,
                l = 53,
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                code = "#8c8fa1"
            ),
            rgb = RGB(
                r = 140,
                g = 143,
                b = 161,
            ),
            hsl = HSL(
                h = 231,
                s = 10,
                l = 59,
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                code = "#9ca0b0"
            ),
            rgb = RGB(
                r = 156,
                g = 160,
                b = 176,
            ),
            hsl = HSL(
                h = 228,
                s = 11,
                l = 65,
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                code = "#acb0be"
            ),
            rgb = RGB(
                r = 172,
                g = 176,
                b = 190,
            ),
            hsl = HSL(
                h = 227,
                s = 12,
                l = 71,
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                code = "#bcc0cc"
            ),
            rgb = RGB(
                r = 188,
                g = 192,
                b = 204,
            ),
            hsl = HSL(
                h = 225,
                s = 14,
                l = 77,
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                code = "#ccd0da"
            ),
            rgb = RGB(
                r = 204,
                g = 208,
                b = 218,
            ),
            hsl = HSL(
                h = 223,
                s = 16,
                l = 83,
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(code = "#eff1f5"
            ),
            rgb = RGB(
                r = 239,
                g = 241,
                b = 245,
            ),
            hsl = HSL(
                h = 220,
                s = 23,
                l = 95,
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                code = "#e6e9ef"
            ),
            rgb = RGB(
                r = 230,
                g = 233,
                b = 239,
            ),
            hsl = HSL(
                h = 220,
                s = 22,
                l = 92,
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                code = "#dce0e8"
            ),
            rgb = RGB(
                r = 220,
                g = 224,
                b = 232,
            ),
            hsl = HSL(
                h = 220,
                s = 21,
                l = 89,
            )
        )
    )
}

fun getFrappeColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                code = "#f2d5cf"
            ),
            rgb = RGB(
                r = 242,
                g = 213,
                b = 207,
            ),
            hsl = HSL(
                h = 10,
                s = 57,
                l = 88,
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                code = "#eebebe"
            ),
            rgb = RGB(
                r = 238,
                g = 190,
                b = 190,
            ),
            hsl = HSL(
                h = 0,
                s = 59,
                l = 84,
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                code = "#f4b8e4"
            ),
            rgb = RGB(
                r = 244,
                g = 184,
                b = 228,
            ),
            hsl = HSL(
                h = 316,
                s = 73,
                l = 84,
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                code = "#ca9ee6"
            ),
            rgb = RGB(
                r = 202,
                g = 158,
                b = 230,
            ),
            hsl = HSL(
                h = 277,
                s = 59,
                l = 76,
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                code = "#e78284"
            ),
            rgb = RGB(
                r = 231,
                g = 130,
                b = 132,
            ),
            hsl = HSL(
                h = 359,
                s = 68,
                l = 71,
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                code = "#ea999c"
            ),
            rgb = RGB(
                r = 234,
                g = 153,
                b = 156,
            ),
            hsl = HSL(
                h = 358,
                s = 66,
                l = 76,
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                code = "#ef9f76"
            ),
            rgb = RGB(
                r = 239,
                g = 159,
                b = 118,
            ),
            hsl = HSL(
                h = 20,
                s = 79,
                l = 70,
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                code = "#e5c890"
            ),
            rgb = RGB(
                r = 229,
                g = 200,
                b = 144,
            ),
            hsl = HSL(
                h = 40,
                s = 62,
                l = 73,
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                code = "#a6d189"
            ),
            rgb = RGB(
                r = 166,
                g = 209,
                b = 137,
            ),
            hsl = HSL(
                h = 96,
                s = 44,
                l = 68,
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                code = "#81c8be"
            ),
            rgb = RGB(
                r = 129,
                g = 200,
                b = 190,
            ),
            hsl = HSL(
                h = 172,
                s = 39,
                l = 65,
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                code = "#99d1db"
            ),
            rgb = RGB(
                r = 153,
                g = 209,
                b = 219,
            ),
            hsl = HSL(
                h = 189,
                s = 48,
                l = 73,
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                code = "#85c1dc"
            ),
            rgb = RGB(
                r = 133,
                g = 193,
                b = 220,
            ),
            hsl = HSL(
                h = 199,
                s = 55,
                l = 69,
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                code = "#8caaee"
            ),
            rgb = RGB(
                r = 140,
                g = 170,
                b = 238,
            ),
            hsl = HSL(
                h = 222,
                s = 74,
                l = 74,
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                code = "#babbf1"
            ),
            rgb = RGB(
                r = 186,
                g = 187,
                b = 241,
            ),
            hsl = HSL(
                h = 239,
                s = 66,
                l = 84,
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                code = "#c6d0f5"
            ),
            rgb = RGB(
                r = 198,
                g = 208,
                b = 245,
            ),
            hsl = HSL(
                h = 227,
                s = 70,
                l = 87,
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                code = "#b5bfe2"
            ),
            rgb = RGB(
                r = 181,
                g = 191,
                b = 226,
            ),
            hsl = HSL(
                h = 227,
                s = 44,
                l = 80,
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                code = "#a5adce"
            ),
            rgb = RGB(
                r = 165,
                g = 173,
                b = 206,
            ),
            hsl = HSL(
                h = 228,
                s = 29,
                l = 73,
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                code = "#949cbb"
            ),
            rgb = RGB(
                r = 148,
                g = 156,
                b = 187,
            ),
            hsl = HSL(
                h = 228,
                s = 22,
                l = 66,
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                code = "#838ba7"
            ),
            rgb = RGB(
                r = 131,
                g = 139,
                b = 167,
            ),
            hsl = HSL(
                h = 227,
                s = 17,
                l = 58,
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                code = "#737994"
            ),
            rgb = RGB(
                r = 115,
                g = 121,
                b = 148,
            ),
            hsl = HSL(
                h = 229,
                s = 13,
                l = 52,
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                code = "#626880"
            ),
            rgb = RGB(
                r = 98,
                g = 104,
                b = 128,
            ),
            hsl = HSL(
                h = 228,
                s = 13,
                l = 44,
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                code = "#51576d"
            ),
            rgb = RGB(
                r = 81,
                g = 87,
                b = 109,
            ),
            hsl = HSL(
                h = 227,
                s = 15,
                l = 37,
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                code = "#414559"
            ),
            rgb = RGB(
                r = 65,
                g = 69,
                b = 89,
            ),
            hsl = HSL(
                h = 230,
                s = 16,
                l = 30,
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                code = "#303446"
            ),
            rgb = RGB(
                r = 48,
                g = 52,
                b = 70,
            ),
            hsl = HSL(
                h = 229,
                s = 19,
                l = 23,
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                code = "#292c3c"
            ),
            rgb = RGB(
                r = 41,
                g = 44,
                b = 60,
            ),
            hsl = HSL(
                h = 231,
                s = 19,
                l = 20,
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                code = "#232634"
            ),
            rgb = RGB(
                r = 35,
                g = 38,
                b = 52,
            ),
            hsl = HSL(
                h = 229,
                s = 20,
                l = 17,
            )
        )
    )
}

fun getMacchiatoColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                code = "#f4dbd6"
            ),
            rgb = RGB(
                r = 244,
                g = 219,
                b = 214,
            ),
            hsl = HSL(
                h = 10,
                s = 58,
                l = 90,
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                code = "#f0c6c6"
            ),
            rgb = RGB(
                r = 240,
                g = 198,
                b = 198,
            ),
            hsl = HSL(
                h = 0,
                s = 58,
                l = 86,
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                code = "#f5bde6"
            ),
            rgb = RGB(
                r = 245,
                g = 189,
                b = 230,
            ),
            hsl = HSL(
                h = 316,
                s = 74,
                l = 85,
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                code = "#c6a0f6"
            ),
            rgb = RGB(
                r = 198,
                g = 160,
                b = 246,
            ),
            hsl = HSL(
                h = 267,
                s = 83,
                l = 80,
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                code = "#ed8796"
            ),
            rgb = RGB(
                r = 237,
                g = 135,
                b = 150,
            ),
            hsl = HSL(
                h = 351,
                s = 74,
                l = 73,
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                code = "#ee99a0"
            ),
            rgb = RGB(
                r = 238,
                g = 153,
                b = 160,
            ),
            hsl = HSL(
                h = 355,
                s = 71,
                l = 77,
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                code = "#f5a97f"
            ),
            rgb = RGB(
                r = 245,
                g = 169,
                b = 127,
            ),
            hsl = HSL(
                h = 21,
                s = 86,
                l = 73,
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                code = "#eed49f"
            ),
            rgb = RGB(
                r = 238,
                g = 212,
                b = 159,
            ),
            hsl = HSL(
                h = 40,
                s = 70,
                l = 78,
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                code = "#a6da95"
            ),
            rgb = RGB(
                r = 166,
                g = 218,
                b = 149,
            ),
            hsl = HSL(
                h = 105,
                s = 48,
                l = 72,
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                code = "#8bd5ca"
            ),
            rgb = RGB(
                r = 139,
                g = 213,
                b = 202,
            ),
            hsl = HSL(
                h = 171,
                s = 47,
                l = 69,
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                code = "#91d7e3"
            ),
            rgb = RGB(
                r = 145,
                g = 215,
                b = 227,
            ),
            hsl = HSL(
                h = 189,
                s = 59,
                l = 73,
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                code = "#7dc4e4"
            ),
            rgb = RGB(
                r = 125,
                g = 196,
                b = 228,
            ),
            hsl = HSL(
                h = 199,
                s = 66,
                l = 69,
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                code = "#8aadf4"
            ),
            rgb = RGB(
                r = 138,
                g = 173,
                b = 244,
            ),
            hsl = HSL(
                h = 220,
                s = 83,
                l = 75,
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                code = "#b7bdf8"
            ),
            rgb = RGB(
                r = 183,
                g = 189,
                b = 248,
            ),
            hsl = HSL(
                h = 234,
                s = 82,
                l = 85,
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                code = "#cad3f5"
            ),
            rgb = RGB(
                r = 202,
                g = 211,
                b = 245,
            ),
            hsl = HSL(
                h = 227,
                s = 68,
                l = 88,
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                code = "#b8c0e0"
            ),
            rgb = RGB(
                r = 184,
                g = 192,
                b = 224,
            ),
            hsl = HSL(
                h = 228,
                s = 39,
                l = 80,
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                code = "#a5adcb"
            ),
            rgb = RGB(
                r = 165,
                g = 173,
                b = 203,
            ),
            hsl = HSL(
                h = 227,
                s = 27,
                l = 72,
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                code = "#939ab7"
            ),
            rgb = RGB(
                r = 147,
                g = 154,
                b = 183,
            ),
            hsl = HSL(
                h = 228,
                s = 20,
                l = 65,
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                code = "#8087a2"
            ),
            rgb = RGB(
                r = 128,
                g = 135,
                b = 162,
            ),
            hsl = HSL(
                h = 228,
                s = 15,
                l = 57,
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                code = "#6e738d"
            ),
            rgb = RGB(
                r = 110,
                g = 115,
                b = 141,
            ),
            hsl = HSL(
                h = 230,
                s = 12,
                l = 49,
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                code = "#5b6078"
            ),
            rgb = RGB(
                r = 91,
                g = 96,
                b = 120,
            ),
            hsl = HSL(
                h = 230,
                s = 14,
                l = 41,
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                code = "#494d64"
            ),
            rgb = RGB(
                r = 73,
                g = 77,
                b = 100,
            ),
            hsl = HSL(
                h = 231,
                s = 16,
                l = 34,
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                code = "#363a4f"
            ),
            rgb = RGB(
                r = 54,
                g = 58,
                b = 79,
            ),
            hsl = HSL(
                h = 230,
                s = 19,
                l = 26,
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                code = "#24273a"
            ),
            rgb = RGB(
                r = 36,
                g = 39,
                b = 58,
            ),
            hsl = HSL(
                h = 232,
                s = 23,
                l = 18,
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                code = "#1e2030"
            ),
            rgb = RGB(
                r = 30,
                g = 32,
                b = 48,
            ),
            hsl = HSL(
                h = 233,
                s = 23,
                l = 15,
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                code = "#181926"
            ),
            rgb = RGB(
                r = 24,
                g = 25,
                b = 38,
            ),
            hsl = HSL(
                h = 236,
                s = 23,
                l = 12,
            )
        )
    )
}

fun getMochaColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                code = "#f5e0dc"
            ),
            rgb = RGB(
                r = 245,
                g = 224,
                b = 220,
            ),
            hsl = HSL(
                h = 10,
                s = 56,
                l = 91,
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                code = "#f2cdcd"
            ),
            rgb = RGB(
                r = 245,
                g = 224,
                b = 220,
            ),
            hsl = HSL(
                h = 10,
                s = 56,
                l = 91,
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                code = "#f5c2e7"
            ),
            rgb = RGB(
                r = 245,
                g = 194,
                b = 231,
            ),
            hsl = HSL(
                h = 316,
                s = 72,
                l = 86,
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                code = "#cba6f7"
            ),
            rgb = RGB(
                r = 203,
                g = 166,
                b = 247,
            ),
            hsl = HSL(
                h = 267,
                s = 84,
                l = 81,
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                code = "#f38ba8"
            ),
            rgb = RGB(
                r = 203,
                g = 166,
                b = 247,
            ),
            hsl = HSL(
                h = 267,
                s = 84,
                l = 81,
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                code = "#eba0ac"
            ),
            rgb = RGB(
                r = 235,
                g = 160,
                b = 172,
            ),
            hsl = HSL(
                h = 350,
                s = 65,
                l = 77,
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                code = "#fab387"
            ),
            rgb = RGB(
                r = 250,
                g = 179,
                b = 135,
            ),
            hsl = HSL(
                h = 23,
                s = 92,
                l = 75,
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                code = "#f9e2af"
            ),
            rgb = RGB(
                r = 249,
                g = 226,
                b = 175,
            ),
            hsl = HSL(
                h = 41,
                s = 86,
                l = 83,
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                code = "#a6e3a1"
            ),
            rgb = RGB(
                r = 166,
                g = 227,
                b = 161,
            ),
            hsl = HSL(
                h = 115,
                s = 54,
                l = 76,
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                code = "#94e2d5"
            ),
            rgb = RGB(
                r = 148,
                g = 226,
                b = 213,
            ),
            hsl = HSL(
                h = 170,
                s = 57,
                l = 73,
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                code = "#89dceb"
            ),
            rgb = RGB(
                r = 137,
                g = 220,
                b = 235,
            ),
            hsl = HSL(
                h = 189,
                s = 71,
                l = 73,
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                code = "#74c7ec"
            ),
            rgb = RGB(
                r = 116,
                g = 199,
                b = 236,
            ),
            hsl = HSL(
                h = 199,
                s = 76,
                l = 69,
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                code = "#89b4fa"
            ),
            rgb = RGB(
                r = 137,
                g = 180,
                b = 250,
            ),
            hsl = HSL(
                h = 217,
                s = 92,
                l = 76,
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                code = "#b4befe"
            ),
            rgb = RGB(
                r = 180,
                g = 190,
                b = 254,
            ),
            hsl = HSL(
                h = 232,
                s = 97,
                l = 85,
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                code = "#cdd6f4"
            ),
            rgb = RGB(
                r = 205,
                g = 214,
                b = 244,
            ),
            hsl = HSL(
                h = 226,
                s = 64,
                l = 88,
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                code = "#bac2de"
            ),
            rgb = RGB(
                r = 186,
                g = 194,
                b = 222,
            ),
            hsl = HSL(
                h = 227,
                s = 35,
                l = 80,
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                code = "#a6adc8"
            ),
            rgb = RGB(
                r = 166,
                g = 173,
                b = 200,
            ),
            hsl = HSL(
                h = 228,
                s = 24,
                l = 72,
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                code = "#9399b2"
            ),
            rgb = RGB(
                r = 147,
                g = 153,
                b = 178,
            ),
            hsl = HSL(
                h = 228,
                s = 17,
                l = 64,
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                code = "#7f849c"
            ),
            rgb = RGB(
                r = 127,
                g = 132,
                b = 156,
            ),
            hsl = HSL(
                h = 230,
                s = 13,
                l = 55,
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                code = "#6c7086"
            ),
            rgb = RGB(
                r = 108,
                g = 112,
                b = 134,
            ),
            hsl = HSL(
                h = 231,
                s = 11,
                l = 47,
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                code = "#585b70"
            ),
            rgb = RGB(
                r = 88,
                g = 91,
                b = 112,
            ),
            hsl = HSL(
                h = 233,
                s = 12,
                l = 39,
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                code = "#45475a"
            ),
            rgb = RGB(
                r = 69,
                g = 71,
                b = 90,
            ),
            hsl = HSL(
                h = 234,
                s = 13,
                l = 31,
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                code = "#313244"
            ),
            rgb = RGB(
                r = 49,
                g = 50,
                b = 68,
            ),
            hsl = HSL(
                h = 237,
                s = 16,
                l = 23,
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                code = "#1e1e2e"
            ),
            rgb = RGB(
                r = 30,
                g = 30,
                b = 46,
            ),
            hsl = HSL(
                h = 240,
                s = 21,
                l = 15,
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                code = "#181825"
            ),
            rgb = RGB(
                r = 24,
                g = 24,
                b = 37,
            ),
            hsl = HSL(
                h = 240,
                s = 21,
                l = 12,
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                code = "#11111b"
            ),
            rgb = RGB(
                r = 17,
                g = 17,
                b = 27,
            ),
            hsl = HSL(
                h = 240,
                s = 23,
                l = 9,
            )
        )
    )
}

fun getColor(label: Label): ColorData {
    return when (label) {
        Label.LATTE_ROSEWATER -> getLatteColors().rosewater
        Label.LATTE_FLAMINGO -> getLatteColors().flamingo
        Label.LATTE_PINK -> getLatteColors().pink
        Label.LATTE_MAUVE -> getLatteColors().mauve
        Label.LATTE_RED -> getLatteColors().red
        Label.LATTE_MAROON -> getLatteColors().maroon
        Label.LATTE_PEACH -> getLatteColors().peach
        Label.LATTE_YELLOW -> getLatteColors().yellow
        Label.LATTE_GREEN -> getLatteColors().green
        Label.LATTE_TEAL -> getLatteColors().teal
        Label.LATTE_SKY -> getLatteColors().sky
        Label.LATTE_SAPPHIRE -> getLatteColors().sapphire
        Label.LATTE_BLUE -> getLatteColors().blue
        Label.LATTE_LAVENDER -> getLatteColors().lavender
        Label.LATTE_TEXT -> getLatteColors().text
        Label.LATTE_SUBTEXT1 -> getLatteColors().subtext1
        Label.LATTE_SUBTEXT0 -> getLatteColors().subtext0
        Label.LATTE_OVERLAY2 -> getLatteColors().overlay2
        Label.LATTE_OVERLAY1 -> getLatteColors().overlay1
        Label.LATTE_OVERLAY0 -> getLatteColors().overlay0
        Label.LATTE_SURFACE2 -> getLatteColors().surface2
        Label.LATTE_SURFACE1 -> getLatteColors().surface1
        Label.LATTE_SURFACE0 -> getLatteColors().surface0
        Label.LATTE_BASE -> getLatteColors().base
        Label.LATTE_MANTLE -> getLatteColors().mantle
        Label.LATTE_CRUST -> getLatteColors().crust
        Label.FRAPPE_ROSEWATER -> getFrappeColors().rosewater
        Label.FRAPPE_FLAMINGO -> getFrappeColors().flamingo
        Label.FRAPPE_PINK -> getFrappeColors().pink
        Label.FRAPPE_MAUVE -> getFrappeColors().mauve
        Label.FRAPPE_RED -> getFrappeColors().red
        Label.FRAPPE_MAROON -> getFrappeColors().maroon
        Label.FRAPPE_PEACH -> getFrappeColors().peach
        Label.FRAPPE_YELLOW -> getFrappeColors().yellow
        Label.FRAPPE_GREEN -> getFrappeColors().green
        Label.FRAPPE_TEAL -> getFrappeColors().teal
        Label.FRAPPE_SKY -> getFrappeColors().sky
        Label.FRAPPE_SAPPHIRE -> getFrappeColors().sapphire
        Label.FRAPPE_BLUE -> getFrappeColors().blue
        Label.FRAPPE_LAVENDER -> getFrappeColors().lavender
        Label.FRAPPE_TEXT -> getFrappeColors().text
        Label.FRAPPE_SUBTEXT1 -> getFrappeColors().subtext1
        Label.FRAPPE_SUBTEXT0 -> getFrappeColors().subtext0
        Label.FRAPPE_OVERLAY2 -> getFrappeColors().overlay2
        Label.FRAPPE_OVERLAY1 -> getFrappeColors().overlay1
        Label.FRAPPE_OVERLAY0 -> getFrappeColors().overlay0
        Label.FRAPPE_SURFACE2 -> getFrappeColors().surface2
        Label.FRAPPE_SURFACE1 -> getFrappeColors().surface1
        Label.FRAPPE_SURFACE0 -> getFrappeColors().surface0
        Label.FRAPPE_BASE -> getFrappeColors().base
        Label.FRAPPE_MANTLE -> getFrappeColors().mantle
        Label.FRAPPE_CRUST -> getFrappeColors().crust
        Label.MACCHIATO_ROSEWATER -> getMacchiatoColors().rosewater
        Label.MACCHIATO_FLAMINGO -> getMacchiatoColors().flamingo
        Label.MACCHIATO_PINK -> getMacchiatoColors().pink
        Label.MACCHIATO_MAUVE -> getMacchiatoColors().mauve
        Label.MACCHIATO_RED -> getMacchiatoColors().red
        Label.MACCHIATO_MAROON -> getMacchiatoColors().maroon
        Label.MACCHIATO_PEACH -> getMacchiatoColors().peach
        Label.MACCHIATO_YELLOW -> getMacchiatoColors().yellow
        Label.MACCHIATO_GREEN -> getMacchiatoColors().green
        Label.MACCHIATO_TEAL -> getMacchiatoColors().teal
        Label.MACCHIATO_SKY -> getMacchiatoColors().sky
        Label.MACCHIATO_SAPPHIRE -> getMacchiatoColors().sapphire
        Label.MACCHIATO_BLUE -> getMacchiatoColors().blue
        Label.MACCHIATO_LAVENDER -> getMacchiatoColors().lavender
        Label.MACCHIATO_TEXT -> getMacchiatoColors().text
        Label.MACCHIATO_SUBTEXT1 -> getMacchiatoColors().subtext1
        Label.MACCHIATO_SUBTEXT0 -> getMacchiatoColors().subtext0
        Label.MACCHIATO_OVERLAY2 -> getMacchiatoColors().overlay2
        Label.MACCHIATO_OVERLAY1 -> getMacchiatoColors().overlay1
        Label.MACCHIATO_OVERLAY0 -> getMacchiatoColors().overlay0
        Label.MACCHIATO_SURFACE2 -> getMacchiatoColors().surface2
        Label.MACCHIATO_SURFACE1 -> getMacchiatoColors().surface1
        Label.MACCHIATO_SURFACE0 -> getMacchiatoColors().surface0
        Label.MACCHIATO_BASE -> getMacchiatoColors().base
        Label.MACCHIATO_MANTLE -> getMacchiatoColors().mantle
        Label.MACCHIATO_CRUST -> getMacchiatoColors().crust
        Label.MOCHA_ROSEWATER -> getMochaColors().rosewater
        Label.MOCHA_FLAMINGO -> getMochaColors().flamingo
        Label.MOCHA_PINK -> getMochaColors().pink
        Label.MOCHA_MAUVE -> getMochaColors().mauve
        Label.MOCHA_RED -> getMochaColors().red
        Label.MOCHA_MAROON -> getMochaColors().maroon
        Label.MOCHA_PEACH -> getMochaColors().peach
        Label.MOCHA_YELLOW -> getMochaColors().yellow
        Label.MOCHA_GREEN -> getMochaColors().green
        Label.MOCHA_TEAL -> getMochaColors().teal
        Label.MOCHA_SKY -> getMochaColors().sky
        Label.MOCHA_SAPPHIRE -> getMochaColors().sapphire
        Label.MOCHA_BLUE -> getMochaColors().blue
        Label.MOCHA_LAVENDER -> getMochaColors().lavender
        Label.MOCHA_TEXT -> getMochaColors().text
        Label.MOCHA_SUBTEXT1 -> getMochaColors().subtext1
        Label.MOCHA_SUBTEXT0 -> getMochaColors().subtext0
        Label.MOCHA_OVERLAY2 -> getMochaColors().overlay2
        Label.MOCHA_OVERLAY1 -> getMochaColors().overlay1
        Label.MOCHA_OVERLAY0 -> getMochaColors().overlay0
        Label.MOCHA_SURFACE2 -> getMochaColors().surface2
        Label.MOCHA_SURFACE1 -> getMochaColors().surface1
        Label.MOCHA_SURFACE0 -> getMochaColors().surface0
        Label.MOCHA_BASE -> getMochaColors().base
        Label.MOCHA_MANTLE -> getMochaColors().mantle
        Label.MOCHA_CRUST -> getMochaColors().crust
    }
}

fun getHexColor(label: Label): HEX {
    return when (label) {
        Label.LATTE_ROSEWATER -> getLatteColors().rosewater.hex
        Label.LATTE_FLAMINGO -> getLatteColors().flamingo.hex
        Label.LATTE_PINK -> getLatteColors().pink.hex
        Label.LATTE_MAUVE -> getLatteColors().mauve.hex
        Label.LATTE_RED -> getLatteColors().red.hex
        Label.LATTE_MAROON -> getLatteColors().maroon.hex
        Label.LATTE_PEACH -> getLatteColors().peach.hex
        Label.LATTE_YELLOW -> getLatteColors().yellow.hex
        Label.LATTE_GREEN -> getLatteColors().green.hex
        Label.LATTE_TEAL -> getLatteColors().teal.hex
        Label.LATTE_SKY -> getLatteColors().sky.hex
        Label.LATTE_SAPPHIRE -> getLatteColors().sapphire.hex
        Label.LATTE_BLUE -> getLatteColors().blue.hex
        Label.LATTE_LAVENDER -> getLatteColors().lavender.hex
        Label.LATTE_TEXT -> getLatteColors().text.hex
        Label.LATTE_SUBTEXT1 -> getLatteColors().subtext1.hex
        Label.LATTE_SUBTEXT0 -> getLatteColors().subtext0.hex
        Label.LATTE_OVERLAY2 -> getLatteColors().overlay2.hex
        Label.LATTE_OVERLAY1 -> getLatteColors().overlay1.hex
        Label.LATTE_OVERLAY0 -> getLatteColors().overlay0.hex
        Label.LATTE_SURFACE2 -> getLatteColors().surface2.hex
        Label.LATTE_SURFACE1 -> getLatteColors().surface1.hex
        Label.LATTE_SURFACE0 -> getLatteColors().surface0.hex
        Label.LATTE_BASE -> getLatteColors().base.hex
        Label.LATTE_MANTLE -> getLatteColors().mantle.hex
        Label.LATTE_CRUST -> getLatteColors().crust.hex
        Label.FRAPPE_ROSEWATER -> getFrappeColors().rosewater.hex
        Label.FRAPPE_FLAMINGO -> getFrappeColors().flamingo.hex
        Label.FRAPPE_PINK -> getFrappeColors().pink.hex
        Label.FRAPPE_MAUVE -> getFrappeColors().mauve.hex
        Label.FRAPPE_RED -> getFrappeColors().red.hex
        Label.FRAPPE_MAROON -> getFrappeColors().maroon.hex
        Label.FRAPPE_PEACH -> getFrappeColors().peach.hex
        Label.FRAPPE_YELLOW -> getFrappeColors().yellow.hex
        Label.FRAPPE_GREEN -> getFrappeColors().green.hex
        Label.FRAPPE_TEAL -> getFrappeColors().teal.hex
        Label.FRAPPE_SKY -> getFrappeColors().sky.hex
        Label.FRAPPE_SAPPHIRE -> getFrappeColors().sapphire.hex
        Label.FRAPPE_BLUE -> getFrappeColors().blue.hex
        Label.FRAPPE_LAVENDER -> getFrappeColors().lavender.hex
        Label.FRAPPE_TEXT -> getFrappeColors().text.hex
        Label.FRAPPE_SUBTEXT1 -> getFrappeColors().subtext1.hex
        Label.FRAPPE_SUBTEXT0 -> getFrappeColors().subtext0.hex
        Label.FRAPPE_OVERLAY2 -> getFrappeColors().overlay2.hex
        Label.FRAPPE_OVERLAY1 -> getFrappeColors().overlay1.hex
        Label.FRAPPE_OVERLAY0 -> getFrappeColors().overlay0.hex
        Label.FRAPPE_SURFACE2 -> getFrappeColors().surface2.hex
        Label.FRAPPE_SURFACE1 -> getFrappeColors().surface1.hex
        Label.FRAPPE_SURFACE0 -> getFrappeColors().surface0.hex
        Label.FRAPPE_BASE -> getFrappeColors().base.hex
        Label.FRAPPE_MANTLE -> getFrappeColors().mantle.hex
        Label.FRAPPE_CRUST -> getFrappeColors().crust.hex
        Label.MACCHIATO_ROSEWATER -> getMacchiatoColors().rosewater.hex
        Label.MACCHIATO_FLAMINGO -> getMacchiatoColors().flamingo.hex
        Label.MACCHIATO_PINK -> getMacchiatoColors().pink.hex
        Label.MACCHIATO_MAUVE -> getMacchiatoColors().mauve.hex
        Label.MACCHIATO_RED -> getMacchiatoColors().red.hex
        Label.MACCHIATO_MAROON -> getMacchiatoColors().maroon.hex
        Label.MACCHIATO_PEACH -> getMacchiatoColors().peach.hex
        Label.MACCHIATO_YELLOW -> getMacchiatoColors().yellow.hex
        Label.MACCHIATO_GREEN -> getMacchiatoColors().green.hex
        Label.MACCHIATO_TEAL -> getMacchiatoColors().teal.hex
        Label.MACCHIATO_SKY -> getMacchiatoColors().sky.hex
        Label.MACCHIATO_SAPPHIRE -> getMacchiatoColors().sapphire.hex
        Label.MACCHIATO_BLUE -> getMacchiatoColors().blue.hex
        Label.MACCHIATO_LAVENDER -> getMacchiatoColors().lavender.hex
        Label.MACCHIATO_TEXT -> getMacchiatoColors().text.hex
        Label.MACCHIATO_SUBTEXT1 -> getMacchiatoColors().subtext1.hex
        Label.MACCHIATO_SUBTEXT0 -> getMacchiatoColors().subtext0.hex
        Label.MACCHIATO_OVERLAY2 -> getMacchiatoColors().overlay2.hex
        Label.MACCHIATO_OVERLAY1 -> getMacchiatoColors().overlay1.hex
        Label.MACCHIATO_OVERLAY0 -> getMacchiatoColors().overlay0.hex
        Label.MACCHIATO_SURFACE2 -> getMacchiatoColors().surface2.hex
        Label.MACCHIATO_SURFACE1 -> getMacchiatoColors().surface1.hex
        Label.MACCHIATO_SURFACE0 -> getMacchiatoColors().surface0.hex
        Label.MACCHIATO_BASE -> getMacchiatoColors().base.hex
        Label.MACCHIATO_MANTLE -> getMacchiatoColors().mantle.hex
        Label.MACCHIATO_CRUST -> getMacchiatoColors().crust.hex
        Label.MOCHA_ROSEWATER -> getMochaColors().rosewater.hex
        Label.MOCHA_FLAMINGO -> getMochaColors().flamingo.hex
        Label.MOCHA_PINK -> getMochaColors().pink.hex
        Label.MOCHA_MAUVE -> getMochaColors().mauve.hex
        Label.MOCHA_RED -> getMochaColors().red.hex
        Label.MOCHA_MAROON -> getMochaColors().maroon.hex
        Label.MOCHA_PEACH -> getMochaColors().peach.hex
        Label.MOCHA_YELLOW -> getMochaColors().yellow.hex
        Label.MOCHA_GREEN -> getMochaColors().green.hex
        Label.MOCHA_TEAL -> getMochaColors().teal.hex
        Label.MOCHA_SKY -> getMochaColors().sky.hex
        Label.MOCHA_SAPPHIRE -> getMochaColors().sapphire.hex
        Label.MOCHA_BLUE -> getMochaColors().blue.hex
        Label.MOCHA_LAVENDER -> getMochaColors().lavender.hex
        Label.MOCHA_TEXT -> getMochaColors().text.hex
        Label.MOCHA_SUBTEXT1 -> getMochaColors().subtext1.hex
        Label.MOCHA_SUBTEXT0 -> getMochaColors().subtext0.hex
        Label.MOCHA_OVERLAY2 -> getMochaColors().overlay2.hex
        Label.MOCHA_OVERLAY1 -> getMochaColors().overlay1.hex
        Label.MOCHA_OVERLAY0 -> getMochaColors().overlay0.hex
        Label.MOCHA_SURFACE2 -> getMochaColors().surface2.hex
        Label.MOCHA_SURFACE1 -> getMochaColors().surface1.hex
        Label.MOCHA_SURFACE0 -> getMochaColors().surface0.hex
        Label.MOCHA_BASE -> getMochaColors().base.hex
        Label.MOCHA_MANTLE -> getMochaColors().mantle.hex
        Label.MOCHA_CRUST -> getMochaColors().crust.hex
    }
}

fun getRGBColor(label: Label): RGB {
    return when (label) {
        Label.LATTE_ROSEWATER -> getLatteColors().rosewater.rgb
        Label.LATTE_FLAMINGO -> getLatteColors().flamingo.rgb
        Label.LATTE_PINK -> getLatteColors().pink.rgb
        Label.LATTE_MAUVE -> getLatteColors().mauve.rgb
        Label.LATTE_RED -> getLatteColors().red.rgb
        Label.LATTE_MAROON -> getLatteColors().maroon.rgb
        Label.LATTE_PEACH -> getLatteColors().peach.rgb
        Label.LATTE_YELLOW -> getLatteColors().yellow.rgb
        Label.LATTE_GREEN -> getLatteColors().green.rgb
        Label.LATTE_TEAL -> getLatteColors().teal.rgb
        Label.LATTE_SKY -> getLatteColors().sky.rgb
        Label.LATTE_SAPPHIRE -> getLatteColors().sapphire.rgb
        Label.LATTE_BLUE -> getLatteColors().blue.rgb
        Label.LATTE_LAVENDER -> getLatteColors().lavender.rgb
        Label.LATTE_TEXT -> getLatteColors().text.rgb
        Label.LATTE_SUBTEXT1 -> getLatteColors().subtext1.rgb
        Label.LATTE_SUBTEXT0 -> getLatteColors().subtext0.rgb
        Label.LATTE_OVERLAY2 -> getLatteColors().overlay2.rgb
        Label.LATTE_OVERLAY1 -> getLatteColors().overlay1.rgb
        Label.LATTE_OVERLAY0 -> getLatteColors().overlay0.rgb
        Label.LATTE_SURFACE2 -> getLatteColors().surface2.rgb
        Label.LATTE_SURFACE1 -> getLatteColors().surface1.rgb
        Label.LATTE_SURFACE0 -> getLatteColors().surface0.rgb
        Label.LATTE_BASE -> getLatteColors().base.rgb
        Label.LATTE_MANTLE -> getLatteColors().mantle.rgb
        Label.LATTE_CRUST -> getLatteColors().crust.rgb
        Label.FRAPPE_ROSEWATER -> getFrappeColors().rosewater.rgb
        Label.FRAPPE_FLAMINGO -> getFrappeColors().flamingo.rgb
        Label.FRAPPE_PINK -> getFrappeColors().pink.rgb
        Label.FRAPPE_MAUVE -> getFrappeColors().mauve.rgb
        Label.FRAPPE_RED -> getFrappeColors().red.rgb
        Label.FRAPPE_MAROON -> getFrappeColors().maroon.rgb
        Label.FRAPPE_PEACH -> getFrappeColors().peach.rgb
        Label.FRAPPE_YELLOW -> getFrappeColors().yellow.rgb
        Label.FRAPPE_GREEN -> getFrappeColors().green.rgb
        Label.FRAPPE_TEAL -> getFrappeColors().teal.rgb
        Label.FRAPPE_SKY -> getFrappeColors().sky.rgb
        Label.FRAPPE_SAPPHIRE -> getFrappeColors().sapphire.rgb
        Label.FRAPPE_BLUE -> getFrappeColors().blue.rgb
        Label.FRAPPE_LAVENDER -> getFrappeColors().lavender.rgb
        Label.FRAPPE_TEXT -> getFrappeColors().text.rgb
        Label.FRAPPE_SUBTEXT1 -> getFrappeColors().subtext1.rgb
        Label.FRAPPE_SUBTEXT0 -> getFrappeColors().subtext0.rgb
        Label.FRAPPE_OVERLAY2 -> getFrappeColors().overlay2.rgb
        Label.FRAPPE_OVERLAY1 -> getFrappeColors().overlay1.rgb
        Label.FRAPPE_OVERLAY0 -> getFrappeColors().overlay0.rgb
        Label.FRAPPE_SURFACE2 -> getFrappeColors().surface2.rgb
        Label.FRAPPE_SURFACE1 -> getFrappeColors().surface1.rgb
        Label.FRAPPE_SURFACE0 -> getFrappeColors().surface0.rgb
        Label.FRAPPE_BASE -> getFrappeColors().base.rgb
        Label.FRAPPE_MANTLE -> getFrappeColors().mantle.rgb
        Label.FRAPPE_CRUST -> getFrappeColors().crust.rgb
        Label.MACCHIATO_ROSEWATER -> getMacchiatoColors().rosewater.rgb
        Label.MACCHIATO_FLAMINGO -> getMacchiatoColors().flamingo.rgb
        Label.MACCHIATO_PINK -> getMacchiatoColors().pink.rgb
        Label.MACCHIATO_MAUVE -> getMacchiatoColors().mauve.rgb
        Label.MACCHIATO_RED -> getMacchiatoColors().red.rgb
        Label.MACCHIATO_MAROON -> getMacchiatoColors().maroon.rgb
        Label.MACCHIATO_PEACH -> getMacchiatoColors().peach.rgb
        Label.MACCHIATO_YELLOW -> getMacchiatoColors().yellow.rgb
        Label.MACCHIATO_GREEN -> getMacchiatoColors().green.rgb
        Label.MACCHIATO_TEAL -> getMacchiatoColors().teal.rgb
        Label.MACCHIATO_SKY -> getMacchiatoColors().sky.rgb
        Label.MACCHIATO_SAPPHIRE -> getMacchiatoColors().sapphire.rgb
        Label.MACCHIATO_BLUE -> getMacchiatoColors().blue.rgb
        Label.MACCHIATO_LAVENDER -> getMacchiatoColors().lavender.rgb
        Label.MACCHIATO_TEXT -> getMacchiatoColors().text.rgb
        Label.MACCHIATO_SUBTEXT1 -> getMacchiatoColors().subtext1.rgb
        Label.MACCHIATO_SUBTEXT0 -> getMacchiatoColors().subtext0.rgb
        Label.MACCHIATO_OVERLAY2 -> getMacchiatoColors().overlay2.rgb
        Label.MACCHIATO_OVERLAY1 -> getMacchiatoColors().overlay1.rgb
        Label.MACCHIATO_OVERLAY0 -> getMacchiatoColors().overlay0.rgb
        Label.MACCHIATO_SURFACE2 -> getMacchiatoColors().surface2.rgb
        Label.MACCHIATO_SURFACE1 -> getMacchiatoColors().surface1.rgb
        Label.MACCHIATO_SURFACE0 -> getMacchiatoColors().surface0.rgb
        Label.MACCHIATO_BASE -> getMacchiatoColors().base.rgb
        Label.MACCHIATO_MANTLE -> getMacchiatoColors().mantle.rgb
        Label.MACCHIATO_CRUST -> getMacchiatoColors().crust.rgb
        Label.MOCHA_ROSEWATER -> getMochaColors().rosewater.rgb
        Label.MOCHA_FLAMINGO -> getMochaColors().flamingo.rgb
        Label.MOCHA_PINK -> getMochaColors().pink.rgb
        Label.MOCHA_MAUVE -> getMochaColors().mauve.rgb
        Label.MOCHA_RED -> getMochaColors().red.rgb
        Label.MOCHA_MAROON -> getMochaColors().maroon.rgb
        Label.MOCHA_PEACH -> getMochaColors().peach.rgb
        Label.MOCHA_YELLOW -> getMochaColors().yellow.rgb
        Label.MOCHA_GREEN -> getMochaColors().green.rgb
        Label.MOCHA_TEAL -> getMochaColors().teal.rgb
        Label.MOCHA_SKY -> getMochaColors().sky.rgb
        Label.MOCHA_SAPPHIRE -> getMochaColors().sapphire.rgb
        Label.MOCHA_BLUE -> getMochaColors().blue.rgb
        Label.MOCHA_LAVENDER -> getMochaColors().lavender.rgb
        Label.MOCHA_TEXT -> getMochaColors().text.rgb
        Label.MOCHA_SUBTEXT1 -> getMochaColors().subtext1.rgb
        Label.MOCHA_SUBTEXT0 -> getMochaColors().subtext0.rgb
        Label.MOCHA_OVERLAY2 -> getMochaColors().overlay2.rgb
        Label.MOCHA_OVERLAY1 -> getMochaColors().overlay1.rgb
        Label.MOCHA_OVERLAY0 -> getMochaColors().overlay0.rgb
        Label.MOCHA_SURFACE2 -> getMochaColors().surface2.rgb
        Label.MOCHA_SURFACE1 -> getMochaColors().surface1.rgb
        Label.MOCHA_SURFACE0 -> getMochaColors().surface0.rgb
        Label.MOCHA_BASE -> getMochaColors().base.rgb
        Label.MOCHA_MANTLE -> getMochaColors().mantle.rgb
        Label.MOCHA_CRUST -> getMochaColors().crust.rgb
    }
}

fun getHSLColor(label: Label): HSL {
    return when (label) {
        Label.LATTE_ROSEWATER -> getLatteColors().rosewater.hsl
        Label.LATTE_FLAMINGO -> getLatteColors().flamingo.hsl
        Label.LATTE_PINK -> getLatteColors().pink.hsl
        Label.LATTE_MAUVE -> getLatteColors().mauve.hsl
        Label.LATTE_RED -> getLatteColors().red.hsl
        Label.LATTE_MAROON -> getLatteColors().maroon.hsl
        Label.LATTE_PEACH -> getLatteColors().peach.hsl
        Label.LATTE_YELLOW -> getLatteColors().yellow.hsl
        Label.LATTE_GREEN -> getLatteColors().green.hsl
        Label.LATTE_TEAL -> getLatteColors().teal.hsl
        Label.LATTE_SKY -> getLatteColors().sky.hsl
        Label.LATTE_SAPPHIRE -> getLatteColors().sapphire.hsl
        Label.LATTE_BLUE -> getLatteColors().blue.hsl
        Label.LATTE_LAVENDER -> getLatteColors().lavender.hsl
        Label.LATTE_TEXT -> getLatteColors().text.hsl
        Label.LATTE_SUBTEXT1 -> getLatteColors().subtext1.hsl
        Label.LATTE_SUBTEXT0 -> getLatteColors().subtext0.hsl
        Label.LATTE_OVERLAY2 -> getLatteColors().overlay2.hsl
        Label.LATTE_OVERLAY1 -> getLatteColors().overlay1.hsl
        Label.LATTE_OVERLAY0 -> getLatteColors().overlay0.hsl
        Label.LATTE_SURFACE2 -> getLatteColors().surface2.hsl
        Label.LATTE_SURFACE1 -> getLatteColors().surface1.hsl
        Label.LATTE_SURFACE0 -> getLatteColors().surface0.hsl
        Label.LATTE_BASE -> getLatteColors().base.hsl
        Label.LATTE_MANTLE -> getLatteColors().mantle.hsl
        Label.LATTE_CRUST -> getLatteColors().crust.hsl
        Label.FRAPPE_ROSEWATER -> getFrappeColors().rosewater.hsl
        Label.FRAPPE_FLAMINGO -> getFrappeColors().flamingo.hsl
        Label.FRAPPE_PINK -> getFrappeColors().pink.hsl
        Label.FRAPPE_MAUVE -> getFrappeColors().mauve.hsl
        Label.FRAPPE_RED -> getFrappeColors().red.hsl
        Label.FRAPPE_MAROON -> getFrappeColors().maroon.hsl
        Label.FRAPPE_PEACH -> getFrappeColors().peach.hsl
        Label.FRAPPE_YELLOW -> getFrappeColors().yellow.hsl
        Label.FRAPPE_GREEN -> getFrappeColors().green.hsl
        Label.FRAPPE_TEAL -> getFrappeColors().teal.hsl
        Label.FRAPPE_SKY -> getFrappeColors().sky.hsl
        Label.FRAPPE_SAPPHIRE -> getFrappeColors().sapphire.hsl
        Label.FRAPPE_BLUE -> getFrappeColors().blue.hsl
        Label.FRAPPE_LAVENDER -> getFrappeColors().lavender.hsl
        Label.FRAPPE_TEXT -> getFrappeColors().text.hsl
        Label.FRAPPE_SUBTEXT1 -> getFrappeColors().subtext1.hsl
        Label.FRAPPE_SUBTEXT0 -> getFrappeColors().subtext0.hsl
        Label.FRAPPE_OVERLAY2 -> getFrappeColors().overlay2.hsl
        Label.FRAPPE_OVERLAY1 -> getFrappeColors().overlay1.hsl
        Label.FRAPPE_OVERLAY0 -> getFrappeColors().overlay0.hsl
        Label.FRAPPE_SURFACE2 -> getFrappeColors().surface2.hsl
        Label.FRAPPE_SURFACE1 -> getFrappeColors().surface1.hsl
        Label.FRAPPE_SURFACE0 -> getFrappeColors().surface0.hsl
        Label.FRAPPE_BASE -> getFrappeColors().base.hsl
        Label.FRAPPE_MANTLE -> getFrappeColors().mantle.hsl
        Label.FRAPPE_CRUST -> getFrappeColors().crust.hsl
        Label.MACCHIATO_ROSEWATER -> getMacchiatoColors().rosewater.hsl
        Label.MACCHIATO_FLAMINGO -> getMacchiatoColors().flamingo.hsl
        Label.MACCHIATO_PINK -> getMacchiatoColors().pink.hsl
        Label.MACCHIATO_MAUVE -> getMacchiatoColors().mauve.hsl
        Label.MACCHIATO_RED -> getMacchiatoColors().red.hsl
        Label.MACCHIATO_MAROON -> getMacchiatoColors().maroon.hsl
        Label.MACCHIATO_PEACH -> getMacchiatoColors().peach.hsl
        Label.MACCHIATO_YELLOW -> getMacchiatoColors().yellow.hsl
        Label.MACCHIATO_GREEN -> getMacchiatoColors().green.hsl
        Label.MACCHIATO_TEAL -> getMacchiatoColors().teal.hsl
        Label.MACCHIATO_SKY -> getMacchiatoColors().sky.hsl
        Label.MACCHIATO_SAPPHIRE -> getMacchiatoColors().sapphire.hsl
        Label.MACCHIATO_BLUE -> getMacchiatoColors().blue.hsl
        Label.MACCHIATO_LAVENDER -> getMacchiatoColors().lavender.hsl
        Label.MACCHIATO_TEXT -> getMacchiatoColors().text.hsl
        Label.MACCHIATO_SUBTEXT1 -> getMacchiatoColors().subtext1.hsl
        Label.MACCHIATO_SUBTEXT0 -> getMacchiatoColors().subtext0.hsl
        Label.MACCHIATO_OVERLAY2 -> getMacchiatoColors().overlay2.hsl
        Label.MACCHIATO_OVERLAY1 -> getMacchiatoColors().overlay1.hsl
        Label.MACCHIATO_OVERLAY0 -> getMacchiatoColors().overlay0.hsl
        Label.MACCHIATO_SURFACE2 -> getMacchiatoColors().surface2.hsl
        Label.MACCHIATO_SURFACE1 -> getMacchiatoColors().surface1.hsl
        Label.MACCHIATO_SURFACE0 -> getMacchiatoColors().surface0.hsl
        Label.MACCHIATO_BASE -> getMacchiatoColors().base.hsl
        Label.MACCHIATO_MANTLE -> getMacchiatoColors().mantle.hsl
        Label.MACCHIATO_CRUST -> getMacchiatoColors().crust.hsl
        Label.MOCHA_ROSEWATER -> getMochaColors().rosewater.hsl
        Label.MOCHA_FLAMINGO -> getMochaColors().flamingo.hsl
        Label.MOCHA_PINK -> getMochaColors().pink.hsl
        Label.MOCHA_MAUVE -> getMochaColors().mauve.hsl
        Label.MOCHA_RED -> getMochaColors().red.hsl
        Label.MOCHA_MAROON -> getMochaColors().maroon.hsl
        Label.MOCHA_PEACH -> getMochaColors().peach.hsl
        Label.MOCHA_YELLOW -> getMochaColors().yellow.hsl
        Label.MOCHA_GREEN -> getMochaColors().green.hsl
        Label.MOCHA_TEAL -> getMochaColors().teal.hsl
        Label.MOCHA_SKY -> getMochaColors().sky.hsl
        Label.MOCHA_SAPPHIRE -> getMochaColors().sapphire.hsl
        Label.MOCHA_BLUE -> getMochaColors().blue.hsl
        Label.MOCHA_LAVENDER -> getMochaColors().lavender.hsl
        Label.MOCHA_TEXT -> getMochaColors().text.hsl
        Label.MOCHA_SUBTEXT1 -> getMochaColors().subtext1.hsl
        Label.MOCHA_SUBTEXT0 -> getMochaColors().subtext0.hsl
        Label.MOCHA_OVERLAY2 -> getMochaColors().overlay2.hsl
        Label.MOCHA_OVERLAY1 -> getMochaColors().overlay1.hsl
        Label.MOCHA_OVERLAY0 -> getMochaColors().overlay0.hsl
        Label.MOCHA_SURFACE2 -> getMochaColors().surface2.hsl
        Label.MOCHA_SURFACE1 -> getMochaColors().surface1.hsl
        Label.MOCHA_SURFACE0 -> getMochaColors().surface0.hsl
        Label.MOCHA_BASE -> getMochaColors().base.hsl
        Label.MOCHA_MANTLE -> getMochaColors().mantle.hsl
        Label.MOCHA_CRUST -> getMochaColors().crust.hsl
    }
}