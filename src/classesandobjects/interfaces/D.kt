package classesandobjects.interfaces

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.foo()
    }

//    override fun foo() { }
}