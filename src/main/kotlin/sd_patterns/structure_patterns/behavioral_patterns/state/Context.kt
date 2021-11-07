package sd_patterns.structure_patterns.behavioral_patterns.state

class Context(var state: State) {

    fun doThis(){
        state.doThis()
    }

    fun doThat(){
        state.doThat()
    }
}