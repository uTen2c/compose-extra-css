package dev.uten2c.extracss

import org.jetbrains.compose.web.css.StylePropertyEnum
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.value

fun StyleScope.userSelect(userSelect: UserSelect) {
    property("user-select", userSelect.value)
    property("-moz-user-select", userSelect.value)
    property("-webkit-user-select", userSelect.value)
    property("-ms-user-select", userSelect.value)
}

interface UserSelect : StylePropertyEnum {
    companion object {
        inline val None get() = UserSelect("none")
        inline val Auto get() = UserSelect("auto")
        inline val Text get() = UserSelect("text")
        inline val Contain get() = UserSelect("contain")
        inline val All get() = UserSelect("all")

        inline val Inherit get() = UserSelect("inherit")
        inline val Initial get() = UserSelect("initial")
        inline val Revert get() = UserSelect("revert")
        inline val Unset get() = UserSelect("unset")
    }
}

fun UserSelect(value: String) = value.unsafeCast<UserSelect>()
