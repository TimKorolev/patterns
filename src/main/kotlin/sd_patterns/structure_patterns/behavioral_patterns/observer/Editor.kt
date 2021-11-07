package sd_patterns.structure_patterns.behavioral_patterns.observer

class Editor(val events: EventManager = EventManager()) {
    fun makeInterestingAction(){
        println("Interesting action")
        events.notifyAllListeners()
    }
}