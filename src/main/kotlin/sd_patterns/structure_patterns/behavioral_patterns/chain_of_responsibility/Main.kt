package sd_patterns.structure_patterns.behavioral_patterns.chain_of_responsibility

fun main() {
    var h1 = AuthHandler()
    var h2 = LoginHandler()
    h1.setNext(h2)
    h1.handle("Auth")
}