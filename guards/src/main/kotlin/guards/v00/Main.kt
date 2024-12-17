package guards.v00

object OrderService {
    fun viewOrderDetails(order: Order, customer: Customer) {
        if (order.placedByCustomerId == customer.id) {
            println("================================")
            println("Order placed by ${customer.name} (#${customer.id})")
            println("--------------------------------")
            println("Order details: ${order.details}")
            println("================================")
        }
    }
}

class Customer(val id: Int, val name: String)
class Order(val details: String, val placedByCustomerId: Int)

fun main() {
    val scott = Customer(100, "Scott")
    val betsy = Customer(300, "Betsy")

    val order = Order("Video Game System", scott.id)

    OrderService.viewOrderDetails(order, scott)
    OrderService.viewOrderDetails(order, betsy)
}
