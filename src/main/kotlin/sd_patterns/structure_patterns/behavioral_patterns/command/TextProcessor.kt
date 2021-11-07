package sd_patterns.structure_patterns.behavioral_patterns.command

class TextProcessor {

    fun delete(){

    }

    fun undo(){

    }

    val operations: MutableList<Command> = mutableListOf()
    val history: MutableList<Command> = mutableListOf()
}