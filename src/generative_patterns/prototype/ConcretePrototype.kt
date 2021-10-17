package generative_patterns.prototype

class ConcretePrototype(private var x: Double = 0.0, private var y: Double = 0.0) :AbstractPrototype() {

    private constructor(source: ConcretePrototype) : this(){
        x = source.x
        y = source.y
    }

    override fun clone(): AbstractPrototype {
        return ConcretePrototype(this)
    }

    override fun toString(): String {
        return "x = ${x} y = ${y}"
    }
}