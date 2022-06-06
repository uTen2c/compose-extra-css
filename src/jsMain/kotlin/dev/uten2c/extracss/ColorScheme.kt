package dev.uten2c.extracss

import org.jetbrains.compose.web.css.StylePropertyEnum
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.value

fun StyleScope.colorScheme(colorScheme: ColorScheme) {
    property("color-scheme", colorScheme.value)
}

interface ColorScheme : StylePropertyEnum {
    companion object {
        inline val Normal get() = ColorScheme("normal")
        inline val Light get() = ColorScheme("light")
        inline val Dark get() = ColorScheme("dark")

        inline val Inherit get() = ColorScheme("inherit")
        inline val Initial get() = ColorScheme("initial")
        inline val Revert get() = ColorScheme("revert")
        inline val Unset get() = ColorScheme("unset")
    }
}

fun ColorScheme(value: String) = value.unsafeCast<ColorScheme>()
