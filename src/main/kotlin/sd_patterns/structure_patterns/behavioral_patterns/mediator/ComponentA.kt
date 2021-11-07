package sd_patterns.structure_patterns.behavioral_patterns.mediator

class ComponentA(val m: Mediator): Component {
    fun operationA(){
        println("A")
        m.notify(this)
    }
}