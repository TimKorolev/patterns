package behavioral_patterns.state

class Document(var context: Context? = null) : State {

    override fun doThis() {
        println("document this")
    }

    override fun doThat() {
        println("document that")
    }
}