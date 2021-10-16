package abstractFactory

fun main(){
    Client.processItemA(ConcreteFactory1).doItemAFunction()
    Client.processItemA(ConcreteFactory2).doItemAFunction()
    Client.processItemB(ConcreteFactory1).doItemBFunction()
    Client.processItemB(ConcreteFactory2).doItemBFunction()
}