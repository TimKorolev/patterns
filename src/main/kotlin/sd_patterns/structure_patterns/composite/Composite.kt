package sd_patterns.structure_patterns.composite

class Composite:Component() {
    val selfWeight = 2
    val children: MutableList<Component> = mutableListOf()

    override fun getWeight(): Int {
        return children.sumOf { child -> child.getWeight() } + selfWeight
    }
}