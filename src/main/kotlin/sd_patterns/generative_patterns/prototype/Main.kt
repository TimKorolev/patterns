package sd_patterns.generative_patterns.prototype

fun main() {
    val p = ConcretePrototype(2.0,3.0)
    val p2 = p.clone()
    println("$p $p2")
}