package sd_patterns.behavioral_patterns.strategy

class Context() {
    var strategy: Strategy? = null

    fun doStrategy(){
        strategy?.execute()
    }
}