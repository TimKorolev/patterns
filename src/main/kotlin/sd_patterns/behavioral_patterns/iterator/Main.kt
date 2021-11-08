package sd_patterns.behavioral_patterns.iterator


fun main() {
   val collection = ConcreteCollection(1)
    collection.createIterator().getNext()
    collection.createReverIterator().getNext()

}