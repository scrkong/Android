// ----------- 1. 设置的单例
object SettingsManager {
    // 单例属性（全局共享）
    var darkModeEnabled = false
    // 单例方法
    fun toggleDarkMode() {
        darkModeEnabled = !darkModeEnabled
        println("暗黑模式 ${if (darkModeEnabled) "开启" else "关闭"}")
    }
}


fun main() {
    // 设置管理器
    SettingsManager.toggleDarkMode() // 开启暗黑模式
    SettingsManager.toggleDarkMode() // 关闭暗黑模式
}