package structure_patterns.decorator

open class BasePageDecorator(private val page: IPage): IPage {

    override fun clickMenu() {
        page.clickMenu()
    }

}