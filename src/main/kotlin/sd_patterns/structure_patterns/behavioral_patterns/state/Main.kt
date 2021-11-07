package sd_patterns.structure_patterns.behavioral_patterns.state


fun main() {
    val draft = Draft()
    val document = Document()
    val context = Context(draft)
    context.doThis()
    context.state = document
    context.doThat()
}