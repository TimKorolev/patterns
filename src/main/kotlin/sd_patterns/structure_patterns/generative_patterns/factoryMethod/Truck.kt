package sd_patterns.structure_patterns.generative_patterns.factoryMethod

class Truck: AbstractTransport() {
    override fun delivery() {
        println("delivered by Truck")
    }
}