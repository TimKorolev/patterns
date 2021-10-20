package structure_patterns.decorator

fun main() {
    val page = Page()
    page.clickMenu()
    val issuePage = IssueListDecorator(page)
    val kbPAge = SearchContextDecorator(SearchAssistantDecorator(page))
}