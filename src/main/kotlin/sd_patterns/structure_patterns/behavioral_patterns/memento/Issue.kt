package sd_patterns.structure_patterns.behavioral_patterns.memento

data class Issue(private val id: Int, var name: String, private val description: String) {

    private lateinit var m: Memento
    private var c: Caretaker = Caretaker()

    fun saveMemento() {
        m = Memento(this)
        c.history.add(m)
    }

    fun recoverFromMemento(): Issue {
        return c.history.last().issue
    }

    data class Memento(val issue: Issue)
}