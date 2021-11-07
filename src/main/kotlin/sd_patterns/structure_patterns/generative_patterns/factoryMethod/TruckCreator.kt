package sd_patterns.structure_patterns.generative_patterns.factoryMethod

object TruckCreator: AbstractCreator() {
    override fun createTransport(): AbstractTransport {
        println("Truck created")
        return Truck()
    }
}