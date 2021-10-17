package structure_patterns.adapter

interface RemoteData {
    fun openRemoteData(){
        println("Remote data is open")
    }
}