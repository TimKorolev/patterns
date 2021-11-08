package sd_patterns.behavioral_patterns.template_method

abstract class Method {
    fun templateMethod() {
        step1()
        step2()
        step3()
        step4()
        step5()
    }

    fun step1() {
        println("Step 1")
    }

    abstract fun step2()
    abstract fun step3()
    abstract fun step4()

    fun step5() {
        println("Step 5")
    }
}