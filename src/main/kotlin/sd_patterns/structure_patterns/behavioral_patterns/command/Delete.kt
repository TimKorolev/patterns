package sd_patterns.structure_patterns.behavioral_patterns.command

class Delete(val receiver: TextProcessor): Command {

    override fun execute() {
        receiver.delete()
    }
}