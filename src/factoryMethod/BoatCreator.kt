package factoryMethod

object BoatCreator: AbstractCreator() {
    override fun createTransport(): AbstractTransport {
        println("Boat created")
        return Boat()
    }
}