package procon.chap8

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch8Q4Test {
    @Test
    fun test_orders() {
        read("q8-4") {
            val obj = Ch8Q4((0 until it.nextInt()).map { _ ->
                it.next()
            })
            println("Preorder")
            obj.preorder()
            println("Inorder")
            obj.inorder()
            println("Postorder")
            obj.postorder()
        }
    }
}