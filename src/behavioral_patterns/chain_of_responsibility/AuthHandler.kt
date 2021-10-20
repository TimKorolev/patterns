package behavioral_patterns.chain_of_responsibility

class AuthHandler : Handler {
    private var h: Handler? = null

    override fun setNext(h: Handler) {
        this.h = h
    }

    override fun handle(request: String) {
        println("Processed by Login")
    }
}