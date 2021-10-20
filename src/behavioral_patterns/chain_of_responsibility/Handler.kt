package behavioral_patterns.chain_of_responsibility

interface Handler {
    fun setNext(h: Handler)
    fun handle(request: String)
}