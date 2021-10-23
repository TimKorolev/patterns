package behavioral_patterns.observer

class EmailListener: EventListener {
    override fun update() {
        println("Email updated")
    }
}