package sd_patterns.structure_patterns.behavioral_patterns.observer

class EventManager(val listeners: MutableList<EventListener> = mutableListOf()) {
    fun notifyAllListeners() {
        listeners.forEach { listener -> listener.update() }
    }
}