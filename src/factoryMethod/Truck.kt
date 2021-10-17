package factoryMethod

class Truck: AbstractTransport() {
    override fun delivery() {
        println("delivered by Truck")
    }
}