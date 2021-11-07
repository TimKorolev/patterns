package sd_patterns.structure_patterns.behavioral_patterns.observer

class EmailListener: EventListener {
    override fun update() {
        println("Email updated")
    }
}