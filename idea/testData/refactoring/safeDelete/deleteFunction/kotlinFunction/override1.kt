open class A {
    open fun foo() {

    }
}

class B: A {
    override fun <caret>foo() {

    }
}