package sd_patterns.behavioral_patterns.iterator

interface Iterator {
    fun getNext():String
    fun hasMore():Boolean
}