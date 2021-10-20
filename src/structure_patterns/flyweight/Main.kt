package structure_patterns.flyweight

fun main() {
    Forest.trees.add(Tree(1,0, TreeTypeFactory.getTreeType("Берёзка", "Белая", "Текстурная")))
}