package behavioral_patterns.mediator

class ComponentB(private val m: Mediator): Component {
    fun operationB(){
        println("B")
        m.notify(this)
    }
}