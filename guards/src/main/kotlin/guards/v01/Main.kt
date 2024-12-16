@file:OptIn(ExperimentalUuidApi::class)

package guards.v01

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

sealed class Request(val id: Uuid = Uuid.random())
class OrderRequest(val amount: Int) : Request()
class RefundRequest(val amount: Int) : Request()
class SupportRequest(val text: String) : Request()

object FrontDesk {
    fun receive(request: Request) {
        when (request) {
            is OrderRequest   -> Warehouse.fulfillOrder(request)
            is RefundRequest  -> Warehouse.fulfillRefund(request)
            is SupportRequest -> HelpDesk.handle(request)
        }
    }
}

object Warehouse {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}

object HelpDesk {
    fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
}

fun main() {
    val request = RefundRequest(8)
    FrontDesk.receive(request)
}
