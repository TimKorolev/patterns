package behavioral_patterns.mediator

class ComponentA(val m: Mediator): Component {
    fun operationA(){
        println("A")
        m.notify(this)
    }
}