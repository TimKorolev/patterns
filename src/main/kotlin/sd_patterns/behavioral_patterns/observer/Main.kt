package sd_patterns.behavioral_patterns.observer


fun main() {
    val editor = Editor()
    val tl = TelegramListener()
    val el = EmailListener()
    editor.events.listeners.add(tl)
    editor.events.listeners.add(el)
    editor.makeInterestingAction()
}