package sd_patterns.structure_patterns.behavioral_patterns.mediator

class ConcreteMediator: Mediator {

    val a = ComponentA(this)
    val b = ComponentB(this)
    val c = ComponentC(this)
    val d = ComponentD(this)

    override fun notify(sender: Component) {
        when(sender.javaClass.name.toString().split(".").last()){
            "ComponentA" -> println("reaction A")
            "ComponentB" -> println("reaction B")
            "ComponentC" -> println("reaction C")
            "ComponentD" -> println("reaction D")
        }
    }
}