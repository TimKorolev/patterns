package sd_patterns.generative_patterns.builder

class ConcreteBuilder: AbstractBuilder() {

    private val product:Product = Product()

    override fun buildItem1() {
        product.item1 = "item1"
    }

    override fun buildItem2() {
        product.item2 = "item2"
    }

    override fun buildItem3() {
        product.item3 = "item3"
    }

    override fun returnProduct(): Product {
        return product
    }
}