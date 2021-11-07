package sd_patterns.structure_patterns.bridge

class Radio: Device() {
    override fun enable() {
        println("Radio on")
    }

    override fun disable() {
        println("Radio on")
    }

    override fun record() {
        println("Music was recorded")
    }
}