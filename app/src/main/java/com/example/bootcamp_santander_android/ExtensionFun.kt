package com.example.bootcamp_santander_android

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

//dentro da ordem que chamar, pegar o itens e fazer um filtro pelo preço caso ele venha
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull {
    it.price
}?.price ?: 0f

//chamar pelo preço
fun Order.maxPricedItemName() = this.items.maxByOrNull {
    it.price
}?.name ?: "NO_PRODUCTS"

//declarando uma propriedade
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(
        listOf(
            Item("Bread", 25.0f), Item("Wine", 29.0f),
            Item("Water", 12.0f)
        )
    )

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}