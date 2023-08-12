<div align="center" >
  <img height="200" src="https://github.com/lighttigerXIV/catppuccin-kt/assets/35658492/e8b60be9-764f-45b6-b519-d266254c3ab7">

  ## Catppuccin-KT
</div>

### About
This library provides catppuccin colors in kotlin. It contains HEX, RGB and HSL colors.

### Apps
You can also find [this app](https://github.com/lighttigerXIV/catppuccin-palette-android) using the library if more examples are needed.


### How to add the library
#### Adding Jitpack URL
If you use Groovy DSL (app build.gradle)
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
If you use Kotlin DSL (settings.gradle):
```gradle
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
      ...
      maven("https://jitpack.io")
  }
}
```

#### Adding dependency in gradle
On your app gradle add:
```gradle
//If you use Groovy DSL
implementation 'com.github.lighttigerxiv:catppuccin-kt:0.0.4'

//If you use Kotlin DSL
implementation ("com.github.lighttigerxiv:catppuccin-kt:0.0.4")
```

### How to use
#### General
In general, you can get a theme or a color.

To get a a theme you can use:
```kotlin
val latte = getLatteColors() //Returns a list with latte colors
val frappe = getFrappeColors() //Returns a list with frappe colors
val macchiato = getMacchiatoColors() //Returns a list with macchiato colors
val mocha = getMochaColors() //Returns a list with mocha colors
```

To get a specific color:

```kotlin
val latteGreen = getColor(Label.LATTE_GREEN)
val frappeRosewater = getColor(Label.FRAPPE_ROSEWATER)
val macchiatoRed = getColor(Label.MACCHIATO_RED)
val mochaBlue = getColor(Label.MOCHA_BLUE)

//You can also get the color with:
val latteGreen = getLatteColors().green
```


#### Hex Colors
To get a hex string:
```kotlin
val mochaBlueHex = getHexColor(Label.MOCHA_BLUE).code //returns the hex code as String ("#89b4fa")
val latteGreenHex = getLatteColors(Label.LATTE_GREEN).code 
```

To get the hex long, to use with jetpack compose:
```kotlin
val mochaBlue = getHexColor(Label.MOCHA_BLUE).asLong() //returns the hex code as Long (0xff89b4fa)

//You can also use it like:
Box(
  modifier = Modifier
              .height(100.dp)
              .width(100.dp)
              .background(Color(mochaBlue))
)
```

#### RGB Color
To get the rgb colors:
```kotlin
val rgb = getRGBColor(Label.MOCHA_BLUE) //returns the RGB object
val r = rgb.r //returns the red Int value: (137)
val g = rgb.g //returns the green Int value: (180)
val b = rgb.b //returns the blue Int value: (250)
val colorString = rgb.asString() //returns the rgb string (rgb(137, 180, 250))
```

#### HSL Color
To get the hsl colors:
```kotlin
val hsl = getHSLColor(Label.MOCHA_BLUE) //returns the HSL object
val h = hsl.h //returns the hue Int value: (217)
val s = hsl.s //returns the saturation Int value: (92)
val l = hsl.l //returns the lightness Int value: (76)
val colorString = hsl.asString() //returns the hsl string (hsl(217, 92%, 76%))
```


