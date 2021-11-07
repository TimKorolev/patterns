package sd_patterns.structure_patterns.behavioral_patterns.mediator

class ComponentD(val m: Mediator): Component {
    fun operationD(){
        println("D")
        m.notify(this)
    }
}