package factoryMethod

object TruckCreator: AbstractCreator() {
    override fun createTransport(): AbstractTransport {
        println("Truck created")
        return Truck()
    }
}