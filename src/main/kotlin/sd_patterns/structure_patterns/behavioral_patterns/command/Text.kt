package sd_patterns.structure_patterns.behavioral_patterns.command

object Text {

    lateinit var command: Command

    fun executeCommand() {
        command.execute()
    }
}