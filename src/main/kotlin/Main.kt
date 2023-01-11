import uniffi.ldk_node.Builder
import uniffi.ldk_node.Node

fun main() {
    println("Hello World!")
    val node: Node = Builder().build()
    println(node)
}
