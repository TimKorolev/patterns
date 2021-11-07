package sd_patterns.structure_patterns.generative_patterns.factoryMethod

class Boat: AbstractTransport() {
    override fun delivery() {
        println("delivered by Boat")
    }
}