package sd_patterns.behavioral_patterns.template_method

class AMethod: Method() {
    override fun step2() {
        println("Step 2 A")
    }

    override fun step3() {
        println("Step 3 A")
    }

    override fun step4() {
        println("Step 4 A")
    }
}