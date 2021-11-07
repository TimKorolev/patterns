package sd_patterns.structure_patterns.behavioral_patterns.memento

class Caretaker(val history: MutableList<Issue.Memento> = mutableListOf()) {
}