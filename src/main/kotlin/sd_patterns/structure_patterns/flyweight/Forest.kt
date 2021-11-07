package sd_patterns.structure_patterns.flyweight

object Forest {
    val trees: MutableList<Tree> = mutableListOf()

    fun plantTree(x: Int, y: Int, name: String, color: String, texture: String) {
        println("Tree was planted")
    }
}