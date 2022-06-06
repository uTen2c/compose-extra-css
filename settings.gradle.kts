pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        infix fun PluginDependencySpec.ver(key: String) = version(extra[key] as String)
        kotlin("multiplatform") ver "kotlin.version"
        id("org.jetbrains.compose") ver "compose.version"
        id("org.jlleitschuh.gradle.ktlint") ver "ktlint.gradle.version"
    }
}

rootProject.name = "compose-extra-css"
