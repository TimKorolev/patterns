package sd_patterns.structure_patterns.bridge

class AdvancedRemote(device: Device) :Remote(device) {

    fun recordMediaFile(){
        device.record()
    }
}