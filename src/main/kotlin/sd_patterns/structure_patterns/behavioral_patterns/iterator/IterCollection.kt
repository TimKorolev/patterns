package sd_patterns.structure_patterns.behavioral_patterns.iterator

interface IterCollection : MutableList<String> {
    fun createIterator():Iterator
}