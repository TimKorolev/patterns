package structure_patterns.decorator

class IssueListDecorator(private val page: IPage): BasePageDecorator(page) {

    override fun clickMenu() {
        // и сделай ещё что то
        page.clickMenu()
        // и сделай ещё что то
    }

}