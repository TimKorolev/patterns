package structure_patterns.decorator

class Page : IPage{
    override fun clickMenu() {
        println("Menu was clicked")
    }
}