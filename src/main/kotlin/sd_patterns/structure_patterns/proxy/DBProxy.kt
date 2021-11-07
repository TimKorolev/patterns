package sd_patterns.structure_patterns.proxy

class DBProxy(private val realService: DB): IDB {

    override fun insertInDb() {
        //проверить доступ
        realService.openDB()
        realService.insertInDb()
    }
}