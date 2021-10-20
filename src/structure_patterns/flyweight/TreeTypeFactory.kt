package structure_patterns.flyweight

object TreeTypeFactory { // or Context
    private val treeTypes: MutableList<TreeType> = mutableListOf()

    fun getTreeType(name: String, color: String,texture: String): TreeType {
        return if(name !in treeTypes.map { type -> type.name}){
            val newType = TreeType(name, color, texture)
            treeTypes.add(newType)
            newType
        } else{
            treeTypes.find { type -> name.equals(name)}!!
        }
    }
}