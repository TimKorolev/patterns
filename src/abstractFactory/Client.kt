package abstractFactory

object Client {

    fun processItemA(factory: AbstractFactory): AbstractItemA {
        return factory.createItemA()
    }

    fun processItemB(factory: AbstractFactory): AbstractItemB {
        return factory.createItemB()
    }
}