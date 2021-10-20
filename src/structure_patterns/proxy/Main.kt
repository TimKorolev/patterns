package structure_patterns.proxy

fun main() {
    val db = DB()
    val dbProxy = DBProxy(db)
    dbProxy.insertInDb()
}