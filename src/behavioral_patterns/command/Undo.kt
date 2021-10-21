package behavioral_patterns.command


class Undo(val receiver: TextProcessor, private val stepsNumber: Int = 1): Command {
    override fun execute() {
        receiver.undo()
    }
}