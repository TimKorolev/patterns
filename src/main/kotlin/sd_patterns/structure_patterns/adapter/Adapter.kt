package sd_patterns.structure_patterns.adapter

class Adapter : LocalData(), RemoteData {

    override fun openLocalData() {
        openRemoteData()
        super.openLocalData()
    }
}