import org.ldk.ldknode.Builder
import org.ldk.ldknode.Node

fun main() {
    println("Hello World!")
    val node: Node = Builder().build()
    println(node)
}
