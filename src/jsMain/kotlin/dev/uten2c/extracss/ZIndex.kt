package dev.uten2c.extracss

import org.jetbrains.compose.web.css.StylePropertyEnum
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.value

fun StyleScope.zIndex(zIndex: ZIndex) {
    property("z-index", zIndex.value)
}

fun StyleScope.zIndex(zIndex: Int) {
    property("z-index", zIndex)
}

interface ZIndex : StylePropertyEnum {
    companion object {
        inline val Auto get() = ZIndex("auto")
        inline val Inherit get() = ZIndex("inherit")
        inline val Initial get() = ZIndex("initial")
        inline val Revert get() = ZIndex("revert")
        inline val Unset get() = ZIndex("unset")
    }
}

fun ZIndex(value: String) = value.unsafeCast<ZIndex>()
