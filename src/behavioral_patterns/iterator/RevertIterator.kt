package behavioral_patterns.iterator

class RevertIterator(private val collection :IterCollection): Iterator {

    var selfState: Int = -1

    override fun getNext(): String {
        selfState += 1
        return collection[selfState]
    }

    override fun hasMore(): Boolean {
        return collection.size < selfState + 1
    }
}