package sd_patterns.generative_patterns.builder

class Director(val builder: AbstractBuilder) {

    fun construct(): Product {
        builder.buildItem1()
        builder.buildItem2()
        builder.buildItem3()

        return builder.returnProduct()
    }
}