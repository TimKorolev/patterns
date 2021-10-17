package generative_patterns.builder

fun main(){
    val concreteBuilder = ConcreteBuilder()
    val director = Director(concreteBuilder)
    val product = director.construct()
    println("${product.item1} ${product.item2} ${product.item3}")
}