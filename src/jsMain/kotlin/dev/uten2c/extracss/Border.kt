package dev.uten2c.extracss

import org.jetbrains.compose.web.css.CSSBorder
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.CSSLengthValue
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.CSSStyleValue
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.style
import org.jetbrains.compose.web.css.width

fun StyleScope.borderTop(borderBuild: CSSBorder.() -> Unit) {
    property("border-top", CSSBorder().apply(borderBuild))
}

fun StyleScope.borderBottom(borderBuild: CSSBorder.() -> Unit) {
    property("border-bottom", CSSBorder().apply(borderBuild))
}

fun StyleScope.borderLeft(borderBuild: CSSBorder.() -> Unit) {
    property("border-left", CSSBorder().apply(borderBuild))
}

fun StyleScope.borderRight(borderBuild: CSSBorder.() -> Unit) {
    property("border-right", CSSBorder().apply(borderBuild))
}

fun StyleScope.borderTop(width: CSSLengthValue? = null, style: LineStyle? = null, color: CSSColorValue? = null) {
    borderTop {
        width?.let { width(it) }
        style?.let { style(it) }
        color?.let { color(it) }
    }
}

fun StyleScope.borderBottom(width: CSSLengthValue? = null, style: LineStyle? = null, color: CSSColorValue? = null) {
    borderBottom {
        width?.let { width(it) }
        style?.let { style(it) }
        color?.let { color(it) }
    }
}

fun StyleScope.borderLeft(width: CSSLengthValue? = null, style: LineStyle? = null, color: CSSColorValue? = null) {
    borderLeft {
        width?.let { width(it) }
        style?.let { style(it) }
        color?.let { color(it) }
    }
}

fun StyleScope.borderRight(width: CSSLengthValue? = null, style: LineStyle? = null, color: CSSColorValue? = null) {
    borderRight {
        width?.let { width(it) }
        style?.let { style(it) }
        color?.let { color(it) }
    }
}

fun StyleScope.borderTopWidth(width: CSSNumeric) {
    property("border-top-width", width)
}

fun StyleScope.borderBottomWidth(width: CSSNumeric) {
    property("border-bottom-width", width)
}

fun StyleScope.borderLeftWidth(width: CSSNumeric) {
    property("border-left-width", width)
}

fun StyleScope.borderRightWidth(width: CSSNumeric) {
    property("border-right-width", width)
}

fun StyleScope.borderColor(color: CSSColorValue) {
    property("border-color", color)
}

fun StyleScope.borderTopColor(color: CSSColorValue) {
    property("border-top-color", color)
}

fun StyleScope.borderBottomColor(color: CSSColorValue) {
    property("border-bottom-color", color)
}

fun StyleScope.borderLeftColor(color: CSSColorValue) {
    property("border-left-color", color)
}

fun StyleScope.borderRightColor(color: CSSColorValue) {
    property("border-right-color", color)
}

@Suppress("EqualsOrHashCode")
class CSSBorderRadius : CSSStyleValue {
    var length: CSSNumeric? = null
    var percentage: CSSNumeric? = null

    override fun equals(other: Any?): Boolean {
        return if (other is CSSBorderRadius) length == other.length && percentage == other.percentage else false
    }

    override fun toString(): String {
        val values = listOfNotNull(length, percentage)
        return values.joinToString(" ")
    }
}

fun CSSBorderRadius.length(length: CSSNumeric) {
    this.length = length
}

fun CSSBorderRadius.percentage(percentage: CSSNumeric) {
    this.percentage = percentage
}

fun StyleScope.borderTopLeftRadius(borderRadiusBuild: CSSBorderRadius.() -> Unit) {
    property("border-top-left-radius", CSSBorderRadius().apply(borderRadiusBuild))
}

fun StyleScope.borderTopLeftRadius(length: CSSNumeric, percentage: CSSNumeric? = null) {
    borderTopLeftRadius {
        this.length = length
        this.percentage = percentage
    }
}

fun StyleScope.borderTopRightRadius(borderRadiusBuild: CSSBorderRadius.() -> Unit) {
    property("border-top-right-radius", CSSBorderRadius().apply(borderRadiusBuild))
}

fun StyleScope.borderTopRightRadius(length: CSSNumeric, percentage: CSSNumeric? = null) {
    borderTopRightRadius {
        this.length = length
        this.percentage = percentage
    }
}

fun StyleScope.borderBottomLeftRadius(borderRadiusBuild: CSSBorderRadius.() -> Unit) {
    property("border-bottom-left-radius", CSSBorderRadius().apply(borderRadiusBuild))
}

fun StyleScope.borderBottomLeftRadius(length: CSSNumeric, percentage: CSSNumeric? = null) {
    borderBottomLeftRadius {
        this.length = length
        this.percentage = percentage
    }
}

fun StyleScope.borderBottomRightRadius(borderRadiusBuild: CSSBorderRadius.() -> Unit) {
    property("border-bottom-right-radius", CSSBorderRadius().apply(borderRadiusBuild))
}

fun StyleScope.borderBottomRightRadius(length: CSSNumeric, percentage: CSSNumeric? = null) {
    borderBottomRightRadius {
        this.length = length
        this.percentage = percentage
    }
}
