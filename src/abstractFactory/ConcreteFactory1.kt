package abstractFactory

object ConcreteFactory1 : AbstractFactory() {

    override fun createItemA(): ItemA1 {
        println("ItemA1 was created")
        return ItemA1()
    }

    override fun createItemB(): ItemB1 {
        println("ItemB1 was created")
        return ItemB1()
    }
}