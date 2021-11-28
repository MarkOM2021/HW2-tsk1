fun main() {
    val amount = 100_000
    val commonCommission = amount * 0.0075
    val finalCommission = if (commonCommission >= 3500) commonCommission else 3500
    println("Final Commission on Your Transaction: $finalCommission coins")

}