package sd_patterns.structure_patterns.bridge

class TV: Device() {
    override fun enable() {
        println("TV on")
    }

    override fun disable() {
        println("TV on")
    }

    override fun record() {
        println("Video was recorded")
    }
}