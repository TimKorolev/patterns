package behavioral_patterns.observer

class TelegramListener: EventListener {
    override fun update() {
        println("Telegram updated")
    }
}