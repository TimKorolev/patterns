package behavioral_patterns.iterator

class DirectIterator(private val collection :IterCollection): Iterator {

    var selfState: Int = collection.size

    override fun getNext(): String {
        selfState -= 1
        return collection[selfState]
    }

    override fun hasMore(): Boolean {
        return 0 < selfState
    }
}