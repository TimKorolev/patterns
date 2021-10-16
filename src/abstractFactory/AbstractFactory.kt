package abstractFactory

abstract class AbstractFactory {
    abstract fun createItemA(): AbstractItemA
    abstract fun createItemB(): AbstractItemB
}