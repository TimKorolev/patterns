package generative_patterns.abstractFactory

object ConcreteFactory2: AbstractFactory() {

    override fun createItemA(): ItemA2 {
        println("ItemA2 was created")
        return ItemA2()
    }

    override fun createItemB(): ItemB2 {
        println("ItemB2 was created")
        return ItemB2()
    }
}