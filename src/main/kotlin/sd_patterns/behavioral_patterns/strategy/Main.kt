package sd_patterns.behavioral_patterns.strategy


fun main() {
    val autoNavigator = AutoNavigator()
    val veloNavigator = VeloNavigator()
    val context = Context()
    context.strategy = autoNavigator
    context.doStrategy()
    context.strategy = veloNavigator
    context.doStrategy()
}