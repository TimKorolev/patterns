package generative_patterns.builder

class OneMoreConcreteBuilder: AbstractBuilder() {

    private val product:Product = Product()

    override fun buildItem1() {
        product.item1 = "item11"
    }

    override fun buildItem2() {
        product.item2 = "item22"
    }

    override fun buildItem3() {
        product.item3 = "item33"
    }

    override fun returnProduct(): Product {
        return product
    }
}