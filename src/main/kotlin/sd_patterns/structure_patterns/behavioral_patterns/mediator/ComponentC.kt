package sd_patterns.structure_patterns.behavioral_patterns.mediator

class ComponentC(val m: Mediator): Component {
    fun operationC(){
        println("C")
        m.notify(this)
    }
}