package sd_patterns.behavioral_patterns.command


fun main() {
    val receiver = TextProcessor()

    val delete = Delete(receiver)
    val undo = Undo(receiver)

    Text.command = delete
    Text.executeCommand()

}