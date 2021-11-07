package sd_patterns.structure_patterns.bridge

abstract class Device(var volume: Int = 0, var channel: Int = 1) {
    abstract fun enable()
    abstract fun disable()
    abstract fun record()
}