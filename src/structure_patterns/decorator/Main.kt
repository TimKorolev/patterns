package structure_patterns.decorator

fun main() {
    val page = Page()
    page.clickMenu()
    val issuePage = IssueListDecorator(page)
    issuePage.clickIssueList()
    val kbPAge = SearchContextDecorator(SearchAssistantDecorator(page))
}