package sd_patterns.structure_patterns.behavioral_patterns.observer

class TelegramListener: EventListener {
    override fun update() {
        println("Telegram updated")
    }
}