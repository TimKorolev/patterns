package sd_patterns.generative_patterns.factoryMethod

class Boat: AbstractTransport() {
    override fun delivery() {
        println("delivered by Boat")
    }
}