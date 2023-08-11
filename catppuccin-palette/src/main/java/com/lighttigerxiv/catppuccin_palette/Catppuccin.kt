package com.lighttigerxiv.catppuccin_palette



enum class Label{
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



fun getCatppuccinThemes(): Catppuccin{
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

data class HEX(
    val long: Long,
    val value: String
)

data class RGB(
    val r: Int,
    val g: Int,
    val b: Int,
    val value: String
)

data class HSL(
    val h: Int,
    val s: Int,
    val l: Int,
    val value: String
)


fun getLatteColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                long = 0xffdc8a78,
                value = "#dc8a78"
            ),
            rgb = RGB(
                r = 220,
                g = 138,
                b = 120,
                value = "rgb(220, 138, 120)"
            ),
            hsl = HSL(
                h = 11,
                s = 59,
                l = 67,
                value = "hsl(11, 59%, 67%)"
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                long = 0xffdd7878,
                value = "#dd7878"
            ),
            rgb = RGB(
                r = 221,
                g = 120,
                b = 120,
                value = "rgb(221, 120, 120)"
            ),
            hsl = HSL(
                h = 0,
                s = 60,
                l = 67,
                value = "hsl(0, 60%, 67%)"
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                long = 0xffea76cb,
                value = "#ea76cb"
            ),
            rgb = RGB(
                r = 234,
                g = 118,
                b = 203,
                value = "rgb(234, 118, 203)"
            ),
            hsl = HSL(
                h = 316,
                s = 73,
                l = 69,
                value = "hsl(316, 73%, 69%)"
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                long = 0xff8839ef,
                value = "#8839ef"
            ),
            rgb = RGB(
                r = 136,
                g = 57,
                b = 239,
                value = "rgb(136, 57, 239)"
            ),
            hsl = HSL(
                h = 266,
                s = 85,
                l = 58,
                value = "hsl(266, 85%, 58%)"
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                long = 0xffd20f39,
                value = "#d20f39"
            ),
            rgb = RGB(
                r = 210,
                g = 15,
                b = 57,
                value = "rgb(210, 15, 57)"
            ),
            hsl = HSL(
                h = 347,
                s = 87,
                l = 44,
                value = "hsl(347, 87%, 44%)"
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                long = 0xffe64553,
                value = "#e64553"
            ),
            rgb = RGB(
                r = 230,
                g = 69,
                b = 83,
                value = "rgb(230, 69, 83)"
            ),
            hsl = HSL(
                h = 355,
                s = 76,
                l = 59,
                value = "hsl(355, 76%, 59%)"
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                long = 0xfffe640b,
                value = "#fe640b"
            ),
            rgb = RGB(
                r = 254,
                g = 100,
                b = 11,
                value = "rgb(254, 100, 11)"
            ),
            hsl = HSL(
                h = 22,
                s = 99,
                l = 52,
                value = "hsl(22, 99%, 52%)"
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                long = 0xffdf8e1d,
                value = "#df8e1d"
            ),
            rgb = RGB(
                r = 223,
                g = 142,
                b = 29,
                value = "rgb(223, 142, 29)"
            ),
            hsl = HSL(
                h = 35,
                s = 77,
                l = 49,
                value = "hsl(35, 77%, 49%)"
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                long = 0xff40a02b,
                value = "#40a02b"
            ),
            rgb = RGB(
                r = 64,
                g = 160,
                b = 43,
                value = "rgb(64, 160, 43)"
            ),
            hsl = HSL(
                h = 109,
                s = 58,
                l = 40,
                value = "hsl(109, 58%, 40%)"
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                long = 0xff179299,
                value = "#179299"
            ),
            rgb = RGB(
                r = 23,
                g = 146,
                b = 153,
                value = "rgb(23, 146, 153)"
            ),
            hsl = HSL(
                h = 183,
                s = 74,
                l = 35,
                value = "hsl(183, 74%, 35%)"
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                long = 0xff04a5e5,
                value = "#04a5e5"
            ),
            rgb = RGB(
                r = 4,
                g = 165,
                b = 229,
                value = "rgb(4, 165, 229)"
            ),
            hsl = HSL(
                h = 197,
                s = 97,
                l = 46,
                value = "hsl(197, 97%, 46%)"
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                long = 0xff209fb5,
                value = "#209fb5"
            ),
            rgb = RGB(
                r = 32,
                g = 159,
                b = 181,
                value = "rgb(32, 159, 181)"
            ),
            hsl = HSL(
                h = 189,
                s = 70,
                l = 42,
                value = "hsl(189, 70%, 42%)"
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                long = 0xff1e66f5,
                value = "#1e66f5"
            ),
            rgb = RGB(
                r = 30,
                g = 102,
                b = 245,
                value = "rgb(30, 102, 245)"
            ),
            hsl = HSL(
                h = 220,
                s = 91,
                l = 54,
                value = "hsl(220, 91%, 54%)"
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                long = 0xff7287fd,
                value = "#7287fd"
            ),
            rgb = RGB(
                r = 114,
                g = 135,
                b = 253,
                value = "rgb(114, 135, 253)"
            ),
            hsl = HSL(
                h = 231,
                s = 97,
                l = 72,
                value = "hsl(231, 97%, 72%)"
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                long = 0xff4c4f69,
                value = "#4c4f69"
            ),
            rgb = RGB(
                r = 76,
                g = 79,
                b = 105,
                value = "rgb(76, 79, 105)"
            ),
            hsl = HSL(
                h = 234,
                s = 16,
                l = 35,
                value = "hsl(234, 16%, 35%)"
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                long = 0xff5c5f77,
                value = "#5c5f77"
            ),
            rgb = RGB(
                r = 92,
                g = 95,
                b = 119,
                value = "rgb(92, 95, 119)"
            ),
            hsl = HSL(
                h = 233,
                s = 13,
                l = 41,
                value = "hsl(233, 13%, 41%)"
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                long = 0xff6c6f85,
                value = "#6c6f85"
            ),
            rgb = RGB(
                r = 108,
                g = 111,
                b = 133,
                value = "rgb(108, 111, 133)"
            ),
            hsl = HSL(
                h = 233,
                s = 10,
                l = 47,
                value = "hsl(233, 10%, 47%)"
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                long = 0xff7c7f93,
                value = "#7c7f93"
            ),
            rgb = RGB(
                r = 124,
                g = 127,
                b = 147,
                value = "rgb(124, 127, 147)"
            ),
            hsl = HSL(
                h = 232,
                s = 10,
                l = 53,
                value = "hsl(232, 10%, 53%)"
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                long = 0xff8c8fa1,
                value = "#8c8fa1"
            ),
            rgb = RGB(
                r = 140,
                g = 143,
                b = 161,
                value = "rgb(140, 143, 161)"
            ),
            hsl = HSL(
                h = 231,
                s = 10,
                l = 59,
                value = "hsl(231, 10%, 59%)"
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                long = 0xff9ca0b0,
                value = "#9ca0b0"
            ),
            rgb = RGB(
                r = 156,
                g = 160,
                b = 176,
                value = "rgb(156, 160, 176)"
            ),
            hsl = HSL(
                h = 228,
                s = 11,
                l = 65,
                value = "hsl(228, 11%, 65%)"
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                long = 0xffacb0be,
                value = "#acb0be"
            ),
            rgb = RGB(
                r = 172,
                g = 176,
                b = 190,
                value = "rgb(172, 176, 190)"
            ),
            hsl = HSL(
                h = 227,
                s = 12,
                l = 71,
                value = "hsl(227, 12%, 71%)"
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                long = 0xffbcc0cc,
                value = "#bcc0cc"
            ),
            rgb = RGB(
                r = 188,
                g = 192,
                b = 204,
                value = "rgb(188, 192, 204)"
            ),
            hsl = HSL(
                h = 225,
                s = 14,
                l = 77,
                value = "hsl(225, 14%, 77%)"
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                long = 0xffccd0da,
                value = "#ccd0da"
            ),
            rgb = RGB(
                r = 204,
                g = 208,
                b = 218,
                value = "rgb(204, 208, 218)"
            ),
            hsl = HSL(
                h = 223,
                s = 16,
                l = 83,
                value = "hsl(223, 16%, 83%)"
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                long = 0xeff1f5,
                value = "#eff1f5"
            ),
            rgb = RGB(
                r = 239,
                g = 241,
                b = 245,
                value = "rgb(239, 241, 245)"
            ),
            hsl = HSL(
                h = 220,
                s = 23,
                l = 95,
                value = "hsl(220, 23%, 95%)"
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                long = 0xffe6e9ef,
                value = "#e6e9ef"
            ),
            rgb = RGB(
                r = 230,
                g = 233,
                b = 239,
                value = "rgb(230, 233, 239)"
            ),
            hsl = HSL(
                h = 220,
                s = 22,
                l = 92,
                value = "hsl(220, 22%, 92%)"
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                long = 0xffdce0e8,
                value = "#dce0e8"
            ),
            rgb = RGB(
                r = 220,
                g = 224,
                b = 232,
                value = "rgb(220, 224, 232)"
            ),
            hsl = HSL(
                h = 220,
                s = 21,
                l = 89,
                value = "hsl(220, 21%, 89%)"
            )
        )
    )
}

fun getFrappeColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                long = 0xfff2d5cf,
                value = "#f2d5cf"
            ),
            rgb = RGB(
                r = 242,
                g = 213,
                b = 207,
                value = "rgb(242, 213, 207)"
            ),
            hsl = HSL(
                h = 10,
                s = 57,
                l = 88,
                value = "hsl(10, 57%, 88%)"
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                long = 0xffeebebe,
                value = "#eebebe"
            ),
            rgb = RGB(
                r = 238,
                g = 190,
                b = 190,
                value = "rgb(238, 190, 190)"
            ),
            hsl = HSL(
                h = 0,
                s = 59,
                l = 84,
                value = "hsl(0, 59%, 84%)"
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                long = 0xfff4b8e4,
                value = "#f4b8e4"
            ),
            rgb = RGB(
                r = 244,
                g = 184,
                b = 228,
                value = "rgb(244, 184, 228)"
            ),
            hsl = HSL(
                h = 316,
                s = 73,
                l = 84,
                value = "hsl(316, 73%, 84%)"
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                long = 0xffca9ee6,
                value = "#ca9ee6"
            ),
            rgb = RGB(
                r = 202,
                g = 158,
                b = 230,
                value = "rgb(202, 158, 230)"
            ),
            hsl = HSL(
                h = 277,
                s = 59,
                l = 76,
                value = "hsl(277, 59%, 76%)"
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                long = 0xffe78284,
                value = "#e78284"
            ),
            rgb = RGB(
                r = 231,
                g = 130,
                b = 132,
                value = "rgb(231, 130, 132)"
            ),
            hsl = HSL(
                h = 359,
                s = 68,
                l = 71,
                value = "hsl(359, 68%, 71%)"
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                long = 0xffea999c,
                value = "#ea999c"
            ),
            rgb = RGB(
                r = 234,
                g = 153,
                b = 156,
                value = "rgb(234, 153, 156)"
            ),
            hsl = HSL(
                h = 358,
                s = 66,
                l = 76,
                value = "hsl(358, 66%, 76%)"
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                long = 0xffef9f76,
                value = "#ef9f76"
            ),
            rgb = RGB(
                r = 239,
                g = 159,
                b = 118,
                value = "rgb(239, 159, 118)"
            ),
            hsl = HSL(
                h = 20,
                s = 79,
                l = 70,
                value = "hsl(20, 79%, 70%)"
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                long = 0xffe5c890,
                value = "#e5c890"
            ),
            rgb = RGB(
                r = 229,
                g = 200,
                b = 144,
                value = "rgb(229, 200, 144)"
            ),
            hsl = HSL(
                h = 40,
                s = 62,
                l = 73,
                value = "hsl(40, 62%, 73%)"
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                long = 0xffa6d189,
                value = "#a6d189"
            ),
            rgb = RGB(
                r = 166,
                g = 209,
                b = 137,
                value = "rgb(166, 209, 137)"
            ),
            hsl = HSL(
                h = 96,
                s = 44,
                l = 68,
                value = "hsl(96, 44%, 68%)"
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                long = 0xff81c8be,
                value = "#81c8be"
            ),
            rgb = RGB(
                r = 129,
                g = 200,
                b = 190,
                value = "rgb(129, 200, 190)"
            ),
            hsl = HSL(
                h = 172,
                s = 39,
                l = 65,
                value = "hsl(172, 39%, 65%)"
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                long = 0xff99d1db,
                value = "#99d1db"
            ),
            rgb = RGB(
                r = 153,
                g = 209,
                b = 219,
                value = "rgb(153, 209, 219)"
            ),
            hsl = HSL(
                h = 189,
                s = 48,
                l = 73,
                value = "hsl(189, 48%, 73%)"
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                long = 0xff85c1dc,
                value = "#85c1dc"
            ),
            rgb = RGB(
                r = 133,
                g = 193,
                b = 220,
                value = "rgb(133, 193, 220)"
            ),
            hsl = HSL(
                h = 199,
                s = 55,
                l = 69,
                value = "hsl(199, 55%, 69%)"
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                long = 0xff8caaee,
                value = "#8caaee"
            ),
            rgb = RGB(
                r = 140,
                g = 170,
                b = 238,
                value = "rgb(140, 170, 238)"
            ),
            hsl = HSL(
                h = 222,
                s = 74,
                l = 74,
                value = "hsl(222, 74%, 74%)"
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                long = 0xffbabbf1,
                value = "#babbf1"
            ),
            rgb = RGB(
                r = 186,
                g = 187,
                b = 241,
                value = "rgb(186, 187, 241)"
            ),
            hsl = HSL(
                h = 239,
                s = 66,
                l = 84,
                value = "hsl(239, 66%, 84%)"
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                long = 0xffc6d0f5,
                value = "#c6d0f5"
            ),
            rgb = RGB(
                r = 198,
                g = 208,
                b = 245,
                value = "rgb(198, 208, 245)"
            ),
            hsl = HSL(
                h = 227,
                s = 70,
                l = 87,
                value = "hsl(227, 70%, 87%)"
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                long = 0xffb5bfe2,
                value = "#b5bfe2"
            ),
            rgb = RGB(
                r = 181,
                g = 191,
                b = 226,
                value = "rgb(181, 191, 226)"
            ),
            hsl = HSL(
                h = 227,
                s = 44,
                l = 80,
                value = "hsl(227, 44%, 80%)"
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                long = 0xffa5adce,
                value = "#a5adce"
            ),
            rgb = RGB(
                r = 165,
                g = 173,
                b = 206,
                value = "rgb(165, 173, 206)"
            ),
            hsl = HSL(
                h = 228,
                s = 29,
                l = 73,
                value = "hsl(228, 29%, 73%)"
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                long = 0xff949cbb,
                value = "#949cbb"
            ),
            rgb = RGB(
                r = 148,
                g = 156,
                b = 187,
                value = "rgb(148, 156, 187)"
            ),
            hsl = HSL(
                h = 228,
                s = 22,
                l = 66,
                value = "hsl(228, 22%, 66%)"
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                long = 0xff838ba7,
                value = "#838ba7"
            ),
            rgb = RGB(
                r = 131,
                g = 139,
                b = 167,
                value = "rgb(131, 139, 167)"
            ),
            hsl = HSL(
                h = 227,
                s = 17,
                l = 58,
                value = "hsl(227, 17%, 58%)"
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                long = 0xff737994,
                value = "#737994"
            ),
            rgb = RGB(
                r = 115,
                g = 121,
                b = 148,
                value = "rgb(115, 121, 148)"
            ),
            hsl = HSL(
                h = 229,
                s = 13,
                l = 52,
                value = "hsl(229, 13%, 52%)"
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                long = 0xff626880,
                value = "#626880"
            ),
            rgb = RGB(
                r = 98,
                g = 104,
                b = 128,
                value = "rgb(98, 104, 128)"
            ),
            hsl = HSL(
                h = 228,
                s = 13,
                l = 44,
                value = "hsl(228, 13%, 44%)"
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                long = 0xff51576d,
                value = "#51576d"
            ),
            rgb = RGB(
                r = 81,
                g = 87,
                b = 109,
                value = "rgb(81, 87, 109)"
            ),
            hsl = HSL(
                h = 227,
                s = 15,
                l = 37,
                value = "hsl(227, 15%, 37%)"
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                long = 0xff414559,
                value = "#414559"
            ),
            rgb = RGB(
                r = 65,
                g = 69,
                b = 89,
                value = "rgb(65, 69, 89)"
            ),
            hsl = HSL(
                h = 230,
                s = 16,
                l = 30,
                value = "hsl(230, 16%, 30%)"
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                long = 0xff303446,
                value = "#303446"
            ),
            rgb = RGB(
                r = 48,
                g = 52,
                b = 70,
                value = "rgb(48, 52, 70)"
            ),
            hsl = HSL(
                h = 229,
                s = 19,
                l = 23,
                value = "hsl(229, 19%, 23%)"
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                long = 0xff292c3c,
                value = "#292c3c"
            ),
            rgb = RGB(
                r = 41,
                g = 44,
                b = 60,
                value = "rgb(41, 44, 60)"
            ),
            hsl = HSL(
                h = 231,
                s = 19,
                l = 20,
                value = "hsl(231, 19%, 20%)"
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                long = 0xff232634,
                value = "#232634"
            ),
            rgb = RGB(
                r = 35,
                g = 38,
                b = 52,
                value = "rgb(35, 38, 52)"
            ),
            hsl = HSL(
                h = 229,
                s = 20,
                l = 17,
                value = "hsl(229, 20%, 17%)"
            )
        )
    )
}

fun getMacchiatoColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                long = 0xfff4dbd6,
                value = "#f4dbd6"
            ),
            rgb = RGB(
                r = 244,
                g = 219,
                b = 214,
                value = "rgb(244, 219, 214)"
            ),
            hsl = HSL(
                h = 10,
                s = 58,
                l = 90,
                value = "hsl(10, 58%, 90%)"
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                long = 0xfff0c6c6,
                value = "#f0c6c6"
            ),
            rgb = RGB(
                r = 240,
                g = 198,
                b = 198,
                value = "rgb(240, 198, 198)"
            ),
            hsl = HSL(
                h = 0,
                s = 58,
                l = 86,
                value = "hsl(0, 58%, 86%)"
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                long = 0xfff5bde6,
                value = "#f5bde6"
            ),
            rgb = RGB(
                r = 245,
                g = 189,
                b = 230,
                value = "rgb(245, 189, 230)"
            ),
            hsl = HSL(
                h = 316,
                s = 74,
                l = 85,
                value = "hsl(316, 74%, 85%)"
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                long = 0xffc6a0f6,
                value = "#c6a0f6"
            ),
            rgb = RGB(
                r = 198,
                g = 160,
                b = 246,
                value = "rgb(198, 160, 246)"
            ),
            hsl = HSL(
                h = 267,
                s = 83,
                l = 80,
                value = "hsl(267, 83%, 80%)"
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                long = 0xffed8796,
                value = "#ed8796"
            ),
            rgb = RGB(
                r = 237,
                g = 135,
                b = 150,
                value = "rgb(237, 135, 150)"
            ),
            hsl = HSL(
                h = 351,
                s = 74,
                l = 73,
                value = "hsl(351, 74%, 73%)"
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                long = 0xffee99a0,
                value = "#ee99a0"
            ),
            rgb = RGB(
                r = 238,
                g = 153,
                b = 160,
                value = "rgb(238, 153, 160)"
            ),
            hsl = HSL(
                h = 355,
                s = 71,
                l = 77,
                value = "hsl(355, 71%, 77%)"
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                long = 0xfff5a97f,
                value = "#f5a97f"
            ),
            rgb = RGB(
                r = 245,
                g = 169,
                b = 127,
                value = "rgb(245, 169, 127)"
            ),
            hsl = HSL(
                h = 21,
                s = 86,
                l = 73,
                value = "hsl(21, 86%, 73%)"
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                long = 0xffeed49f,
                value = "#eed49f"
            ),
            rgb = RGB(
                r = 238,
                g = 212,
                b = 159,
                value = "rgb(238, 212, 159)"
            ),
            hsl = HSL(
                h = 40,
                s = 70,
                l = 78,
                value = "hsl(40, 70%, 78%)"
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                long = 0xffa6da95,
                value = "#a6da95"
            ),
            rgb = RGB(
                r = 166,
                g = 218,
                b = 149,
                value = "rgb(166, 218, 149)"
            ),
            hsl = HSL(
                h = 105,
                s = 48,
                l = 72,
                value = "hsl(105, 48%, 72%)"
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                long = 0xff8bd5ca,
                value = "#8bd5ca"
            ),
            rgb = RGB(
                r = 139,
                g = 213,
                b = 202,
                value = "rgb(139, 213, 202)"
            ),
            hsl = HSL(
                h = 171,
                s = 47,
                l = 69,
                value = "hsl(171, 47%, 69%)"
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                long = 0xff91d7e3,
                value = "#91d7e3"
            ),
            rgb = RGB(
                r = 145,
                g = 215,
                b = 227,
                value = "rgb(145, 215, 227)"
            ),
            hsl = HSL(
                h = 189,
                s = 59,
                l = 73,
                value = "hsl(189, 59%, 73%)"
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                long = 0xff7dc4e4,
                value = "#7dc4e4"
            ),
            rgb = RGB(
                r = 125,
                g = 196,
                b = 228,
                value = "rgb(125, 196, 228)"
            ),
            hsl = HSL(
                h = 199,
                s = 66,
                l = 69,
                value = "hsl(199, 66%, 69%)"
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                long = 0xff8aadf4,
                value = "#8aadf4"
            ),
            rgb = RGB(
                r = 138,
                g = 173,
                b = 244,
                value = "rgb(138, 173, 244)"
            ),
            hsl = HSL(
                h = 220,
                s = 83,
                l = 75,
                value = "hsl(220, 83%, 75%)"
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                long = 0xffb7bdf8,
                value = "#b7bdf8"
            ),
            rgb = RGB(
                r = 183,
                g = 189,
                b = 248,
                value = "rgb(183, 189, 248)"
            ),
            hsl = HSL(
                h = 234,
                s = 82,
                l = 85,
                value = "hsl(234, 82%, 85%)"
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                long = 0xffcad3f5,
                value = "#cad3f5"
            ),
            rgb = RGB(
                r = 202,
                g = 211,
                b = 245,
                value = "rgb(202, 211, 245)"
            ),
            hsl = HSL(
                h = 227,
                s = 68,
                l = 88,
                value = "hsl(227, 68%, 88%)"
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                long = 0xffb8c0e0,
                value = "#b8c0e0"
            ),
            rgb = RGB(
                r = 184,
                g = 192,
                b = 224,
                value = "rgb(184, 192, 224)"
            ),
            hsl = HSL(
                h = 228,
                s = 39,
                l = 80,
                value = "hsl(228, 39%, 80%)"
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                long = 0xffa5adcb,
                value = "#a5adcb"
            ),
            rgb = RGB(
                r = 165,
                g = 173,
                b = 203,
                value = "rgb(165, 173, 203)"
            ),
            hsl = HSL(
                h = 227,
                s = 27,
                l = 72,
                value = "hsl(227, 27%, 72%)"
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                long = 0xff939ab7,
                value = "#939ab7"
            ),
            rgb = RGB(
                r = 147,
                g = 154,
                b = 183,
                value = "rgb(147, 154, 183)"
            ),
            hsl = HSL(
                h = 228,
                s = 20,
                l = 65,
                value = "hsl(228, 20%, 65%)"
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                long = 0xff8087a2,
                value = "#8087a2"
            ),
            rgb = RGB(
                r = 128,
                g = 135,
                b = 162,
                value = "rgb(128, 135, 162)"
            ),
            hsl = HSL(
                h = 228,
                s = 15,
                l = 57,
                value = "hsl(228, 15%, 57%)"
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                long = 0xff6e738d,
                value = "#6e738d"
            ),
            rgb = RGB(
                r = 110,
                g = 115,
                b = 141,
                value = "rgb(110, 115, 141)"
            ),
            hsl = HSL(
                h = 230,
                s = 12,
                l = 49,
                value = "hsl(230, 12%, 49%)"
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                long = 0xff5b6078,
                value = "#5b6078"
            ),
            rgb = RGB(
                r = 91,
                g = 96,
                b = 120,
                value = "rgb(91, 96, 120)"
            ),
            hsl = HSL(
                h = 230,
                s = 14,
                l = 41,
                value = "hsl(230, 14%, 41%)"
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                long = 0xff494d64,
                value = "#494d64"
            ),
            rgb = RGB(
                r = 73,
                g = 77,
                b = 100,
                value = "rgb(73, 77, 100)"
            ),
            hsl = HSL(
                h = 231,
                s = 16,
                l = 34,
                value = "hsl(231, 16%, 34%)"
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                long = 0xff363a4f,
                value = "#363a4f"
            ),
            rgb = RGB(
                r = 54,
                g = 58,
                b = 79,
                value = "rgb(54, 58, 79)"
            ),
            hsl = HSL(
                h = 230,
                s = 19,
                l = 26,
                value = "hsl(230, 19%, 26%)"
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                long = 0xff24273a,
                value = "#24273a"
            ),
            rgb = RGB(
                r = 36,
                g = 39,
                b = 58,
                value = "rgb(36, 39, 58)"
            ),
            hsl = HSL(
                h = 232,
                s = 23,
                l = 18,
                value = "hsl(232, 23%, 18%)"
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                long = 0xff1e2030,
                value = "#1e2030"
            ),
            rgb = RGB(
                r = 30,
                g = 32,
                b = 48,
                value = "rgb(30, 32, 48)"
            ),
            hsl = HSL(
                h = 233,
                s = 23,
                l = 15,
                value = "hsl(233, 23%, 15%)"
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                long = 0xff181926,
                value = "#181926"
            ),
            rgb = RGB(
                r = 24,
                g = 25,
                b = 38,
                value = "rgb(24, 25, 38)"
            ),
            hsl = HSL(
                h = 236,
                s = 23,
                l = 12,
                value = "hsl(236, 23%, 12%)"
            )
        )
    )
}

fun getMochaColors(): CatppuccinTheme {
    return CatppuccinTheme(
        rosewater = ColorData(
            name = "Rosewater",
            hex = HEX(
                long = 0xfff5e0dc,
                value = "#f5e0dc"
            ),
            rgb = RGB(
                r = 245,
                g = 224,
                b = 220,
                value = "rgb(245, 224, 220)"
            ),
            hsl = HSL(
                h = 10,
                s = 56,
                l = 91,
                value = "hsl(10, 56%, 91%)"
            )
        ),
        flamingo = ColorData(
            name = "Flamingo",
            hex = HEX(
                long = 0xfff2cdcd,
                value = "#f2cdcd"
            ),
            rgb = RGB(
                r = 245,
                g = 224,
                b = 220,
                value = "rgb(245, 224, 220)"
            ),
            hsl = HSL(
                h = 10,
                s = 56,
                l = 91,
                value = "hsl(10, 56%, 91%)"
            )
        ),
        pink = ColorData(
            name = "Pink",
            hex = HEX(
                long = 0xfff5c2e7,
                value = "#f5c2e7"
            ),
            rgb = RGB(
                r = 245,
                g = 194,
                b = 231,
                value = "rgb(245, 194, 231)"
            ),
            hsl = HSL(
                h = 316,
                s = 72,
                l = 86,
                value = "hsl(316, 72%, 86%)"
            )
        ),
        mauve = ColorData(
            name = "Mauve",
            hex = HEX(
                long = 0xffcba6f7,
                value = "#cba6f7"
            ),
            rgb = RGB(
                r = 203,
                g = 166,
                b = 247,
                value = "rgb(203, 166, 247)"
            ),
            hsl = HSL(
                h = 267,
                s = 84,
                l = 81,
                value = "hsl(267, 84%, 81%)"
            )
        ),
        red = ColorData(
            name = "Red",
            hex = HEX(
                long = 0xfff38ba8,
                value = "#f38ba8"
            ),
            rgb = RGB(
                r = 203,
                g = 166,
                b = 247,
                value = "rgb(203, 166, 247)"
            ),
            hsl = HSL(
                h = 267,
                s = 84,
                l = 81,
                value = "hsl(267, 84%, 81%)"
            )
        ),
        maroon = ColorData(
            name = "Maroon",
            hex = HEX(
                long = 0xffeba0ac,
                value = "#eba0ac"
            ),
            rgb = RGB(
                r = 235,
                g = 160,
                b = 172,
                value = "rgb(235, 160, 172)"
            ),
            hsl = HSL(
                h = 350,
                s = 65,
                l = 77,
                value = "hsl(350, 65%, 77%)"
            )
        ),
        peach = ColorData(
            name = "Peach",
            hex = HEX(
                long = 0xfffab387,
                value = "#fab387"
            ),
            rgb = RGB(
                r = 250,
                g = 179,
                b = 135,
                value = "rgb(250, 179, 135)"
            ),
            hsl = HSL(
                h = 23,
                s = 92,
                l = 75,
                value = "hsl(23, 92%, 75%)"
            )
        ),
        yellow = ColorData(
            name = "Yellow",
            hex = HEX(
                long = 0xfff9e2af,
                value = "#f9e2af"
            ),
            rgb = RGB(
                r = 249,
                g = 226,
                b = 175,
                value = "rgb(249, 226, 175)"
            ),
            hsl = HSL(
                h = 41,
                s = 86,
                l = 83,
                value = "hsl(41, 86%, 83%)"
            )
        ),
        green = ColorData(
            name = "Green",
            hex = HEX(
                long = 0xffa6e3a1,
                value = "#a6e3a1"
            ),
            rgb = RGB(
                r = 166,
                g = 227,
                b = 161,
                value = "rgb(166, 227, 161)"
            ),
            hsl = HSL(
                h = 115,
                s = 54,
                l = 76,
                value = "hsl(115, 54%, 76%)"
            )
        ),
        teal = ColorData(
            name = "Teal",
            hex = HEX(
                long = 0xff94e2d5,
                value = "#94e2d5"
            ),
            rgb = RGB(
                r = 148,
                g = 226,
                b = 213,
                value = "rgb(148, 226, 213)"
            ),
            hsl = HSL(
                h = 170,
                s = 57,
                l = 73,
                value = "hsl(170, 57%, 73%)"
            )
        ),
        sky = ColorData(
            name = "Sky",
            hex = HEX(
                long = 0xff89dceb,
                value = "#89dceb"
            ),
            rgb = RGB(
                r = 137,
                g = 220,
                b = 235,
                value = "rgb(137, 220, 235)"
            ),
            hsl = HSL(
                h = 189,
                s = 71,
                l = 73,
                value = "hsl(189, 71%, 73%)"
            )
        ),
        sapphire = ColorData(
            name = "Sapphire",
            hex = HEX(
                long = 0xff74c7ec,
                value = "#74c7ec"
            ),
            rgb = RGB(
                r = 116,
                g = 199,
                b = 236,
                value = "rgb(116, 199, 236)"
            ),
            hsl = HSL(
                h = 199,
                s = 76,
                l = 69,
                value = "hsl(199, 76%, 69%)"
            )
        ),
        blue = ColorData(
            name = "Blue",
            hex = HEX(
                long = 0xff89b4fa,
                value = "#89b4fa"
            ),
            rgb = RGB(
                r = 137,
                g = 180,
                b = 250,
                value = "rgb(137, 180, 250)"
            ),
            hsl = HSL(
                h = 217,
                s = 92,
                l = 76,
                value = "hsl(217, 92%, 76%)"
            )
        ),
        lavender = ColorData(
            name = "Lavender",
            hex = HEX(
                long = 0xffb4befe,
                value = "#b4befe"
            ),
            rgb = RGB(
                r = 180,
                g = 190,
                b = 254,
                value = "rgb(180, 190, 254)"
            ),
            hsl = HSL(
                h = 232,
                s = 97,
                l = 85,
                value = "hsl(232, 97%, 85%)"
            )
        ),
        text = ColorData(
            name = "Text",
            hex = HEX(
                long = 0xffcdd6f4,
                value = "#cdd6f4"
            ),
            rgb = RGB(
                r = 205,
                g = 214,
                b = 244,
                value = "rgb(205, 214, 244)"
            ),
            hsl = HSL(
                h = 226,
                s = 64,
                l = 88,
                value = "hsl(226, 64%, 88%)"
            )
        ),
        subtext1 = ColorData(
            name = "SubText1",
            hex = HEX(
                long = 0xffbac2de,
                value = "#bac2de"
            ),
            rgb = RGB(
                r = 186,
                g = 194,
                b = 222,
                value = "rgb(186, 194, 222)"
            ),
            hsl = HSL(
                h = 227,
                s = 35,
                l = 80,
                value = "hsl(227, 35%, 80%)"
            )
        ),
        subtext0 = ColorData(
            name = "SubText0",
            hex = HEX(
                long = 0xffa6adc8,
                value = "#a6adc8"
            ),
            rgb = RGB(
                r = 166,
                g = 173,
                b = 200,
                value = "rgb(166, 173, 200)"
            ),
            hsl = HSL(
                h = 228,
                s = 24,
                l = 72,
                value = "hsl(228, 24%, 72%)"
            )
        ),
        overlay2 = ColorData(
            name = "Overlay2",
            hex = HEX(
                long = 0xff9399b2,
                value = "#9399b2"
            ),
            rgb = RGB(
                r = 147,
                g = 153,
                b = 178,
                value = "rgb(147, 153, 178)"
            ),
            hsl = HSL(
                h = 228,
                s = 17,
                l = 64,
                value = "hsl(228, 17%, 64%)"
            )
        ),
        overlay1 = ColorData(
            name = "Overlay1",
            hex = HEX(
                long = 0xff7f849c,
                value = "#7f849c"
            ),
            rgb = RGB(
                r = 127,
                g = 132,
                b = 156,
                value = "rgb(127, 132, 156)"
            ),
            hsl = HSL(
                h = 230,
                s = 13,
                l = 55,
                value = "hsl(230, 13%, 55%)"
            )
        ),
        overlay0 = ColorData(
            name = "Overlay0",
            hex = HEX(
                long = 0xff6c7086,
                value = "#6c7086"
            ),
            rgb = RGB(
                r = 108,
                g = 112,
                b = 134,
                value = "rgb(108, 112, 134)"
            ),
            hsl = HSL(
                h = 231,
                s = 11,
                l = 47,
                value = "hsl(231, 11%, 47%)"
            )
        ),
        surface2 = ColorData(
            name = "Surface2",
            hex = HEX(
                long = 0xff585b70,
                value = "#585b70"
            ),
            rgb = RGB(
                r = 88,
                g = 91,
                b = 112,
                value = "rgb(88, 91, 112)"
            ),
            hsl = HSL(
                h = 233,
                s = 12,
                l = 39,
                value = "hsl(233, 12%, 39%)"
            )
        ),
        surface1 = ColorData(
            name = "Surface1",
            hex = HEX(
                long = 0xff45475a,
                value = "#45475a"
            ),
            rgb = RGB(
                r = 69,
                g = 71,
                b = 90,
                value = "rgb(69, 71, 90)"
            ),
            hsl = HSL(
                h = 234,
                s = 13,
                l = 31,
                value = "hsl(234, 13%, 31%)"
            )
        ),
        surface0 = ColorData(
            name = "Surface0",
            hex = HEX(
                long = 0xff313244,
                value = "#313244"
            ),
            rgb = RGB(
                r = 49,
                g = 50,
                b = 68,
                value = "rgb(49, 50, 68)"
            ),
            hsl = HSL(
                h = 237,
                s = 16,
                l = 23,
                value = "hsl(237, 16%, 23%)"
            )
        ),
        base = ColorData(
            name = "Base",
            hex = HEX(
                long = 0xff1e1e2e,
                value = "#1e1e2e"
            ),
            rgb = RGB(
                r = 30,
                g = 30,
                b = 46,
                value = "rgb(30, 30, 46)"
            ),
            hsl = HSL(
                h = 240,
                s = 21,
                l = 15,
                value = "hsl(240, 21%, 15%)"
            )
        ),
        mantle = ColorData(
            name = "Mantle",
            hex = HEX(
                long = 0xff181825,
                value = "#181825"
            ),
            rgb = RGB(
                r = 24,
                g = 24,
                b = 37,
                value = "rgb(24, 24, 37)"
            ),
            hsl = HSL(
                h = 240,
                s = 21,
                l = 12,
                value = "hsl(240, 21%, 12%)"
            )
        ),
        crust = ColorData(
            name = "Crust",
            hex = HEX(
                long = 0xff11111b,
                value = "#11111b"
            ),
            rgb = RGB(
                r = 17,
                g = 17,
                b = 27,
                value = "rgb(17, 17, 27)"
            ),
            hsl = HSL(
                h = 240,
                s = 23,
                l = 9,
                value = "hsl(240, 23%, 9%)"
            )
        )
    )
}

fun getColor(label: Label): ColorData{
    return when(label){
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

fun getHexColor(label: Label): HEX{
    return when(label){
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

fun getRGBColor(label: Label): RGB{
    return when(label){
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

fun getHSLColor(label: Label): HSL{
    return when(label){
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