package sd_patterns.structure_patterns.generative_patterns.factoryMethod

fun main() {
    val creator: AbstractCreator

    if (true) {
        creator = BoatCreator
    } else {
        creator = TruckCreator
    }

    println("${creator.createTransport()}")
}