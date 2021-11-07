package sd_patterns.structure_patterns.bridge

fun main() {
    val tv = TV()
    val radio = Radio()
    val remote = AdvancedRemote(tv)
    val remote2 = AdvancedRemote(radio)

    remote.togglePower()
    remote.setChannel(1)
    remote.setVolume(1)
    remote.recordMediaFile()

    remote2.togglePower()
    remote2.setChannel(1)
    remote2.setVolume(1)
    remote2.recordMediaFile()

}