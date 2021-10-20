package structure_patterns.proxy

class DB: IDB {
    fun openDB(){
        println("DB was opened")
    }

    override fun insertInDb() {
        println("info inserted")
    }
}