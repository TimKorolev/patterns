package generative_patterns.factoryMethod

abstract class AbstractCreator {
    abstract fun createTransport(): AbstractTransport
}