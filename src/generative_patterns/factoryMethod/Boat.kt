package generative_patterns.factoryMethod

class Boat: AbstractTransport() {
    override fun delivery() {
        println("delivered by Boat")
    }
}