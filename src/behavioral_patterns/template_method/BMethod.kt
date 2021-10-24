package behavioral_patterns.template_method

class BMethod: Method() {
    override fun step2() {
        println("Step 2 B")
    }

    override fun step3() {
        println("Step 3 B")
    }

    override fun step4() {
        println("Step 4 B")
    }
}