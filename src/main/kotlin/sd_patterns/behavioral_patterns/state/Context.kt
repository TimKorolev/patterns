package sd_patterns.behavioral_patterns.state

class Context(var state: State) {

    fun doThis(){
        state.doThis()
    }

    fun doThat(){
        state.doThat()
    }
}