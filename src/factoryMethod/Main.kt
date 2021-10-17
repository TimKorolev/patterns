package factoryMethod

fun main() {
    val creator: AbstractCreator

    if (true) {
        creator = BoatCreator
    } else {
        creator = TruckCreator
    }

    println("${creator.createTransport()}")
}