package sd_patterns.structure_patterns.behavioral_patterns.memento


fun main() {
    val issue = Issue(1, "Name", "Description")
    issue.saveMemento()
    println(issue)
    println(issue.recoverFromMemento())
    issue.name = "Name 1"
    issue.saveMemento()
    println(issue.recoverFromMemento())
}