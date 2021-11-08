package sd_patterns.generative_patterns.abstractFactory

abstract class AbstractFactory {
    abstract fun createItemA(): AbstractItemA
    abstract fun createItemB(): AbstractItemB
}