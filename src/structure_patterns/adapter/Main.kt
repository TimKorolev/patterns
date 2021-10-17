package structure_patterns.adapter

fun main() {
    val localData = LocalData()
    localData.openLocalData()
    val adapter = Adapter()
    adapter.openLocalData()
}