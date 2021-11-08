package sd_patterns.behavioral_patterns.command

object Text {

    lateinit var command: Command

    fun executeCommand() {
        command.execute()
    }
}