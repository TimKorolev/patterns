package sd_patterns.structure_patterns.composite

fun main() {
    val root = Composite()
    root.children.add(Leaf())
    root.children.add(Leaf())
    root.children.add(Leaf())
    root.children.add(Leaf())
    val root2 = Composite()
    root2.children.add(Leaf())
    root2.children.add(Leaf())
    root2.children.add(Leaf())
    root2.children.add(Leaf())
    root.children.add(root2)

    println(root.getWeight())
}