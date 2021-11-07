package sd_patterns.structure_patterns.generative_patterns.builder

abstract class AbstractBuilder {

    abstract fun buildItem1()
    abstract fun buildItem2()
    abstract fun buildItem3()
    abstract fun returnProduct(): Product

}