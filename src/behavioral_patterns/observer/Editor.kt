package behavioral_patterns.observer

class Editor(val events: EventManager = EventManager()) {
    fun makeInterestingAction(){
        println("Interesting action")
        events.notifyAllListeners()
    }
}