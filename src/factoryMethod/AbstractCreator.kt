package factoryMethod

abstract class AbstractCreator {
    abstract fun createTransport(): AbstractTransport
}