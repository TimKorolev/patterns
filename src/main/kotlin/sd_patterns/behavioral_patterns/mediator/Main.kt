package sd_patterns.behavioral_patterns.mediator


fun main() {
    val m = ConcreteMediator()
    val a = m.a
    val b = m.b
    val c = m.c
    val d = m.d

    a.operationA()
    b.operationB()
    c.operationC()
    d.operationD()

}