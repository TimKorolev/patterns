package behavioral_patterns.state

class Draft(var context: Context? = null) : State {

    override fun doThis() {
        println("draft this")
    }

    override fun doThat() {
        println("draft that")
    }
}