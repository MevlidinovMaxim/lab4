fun main(){

    val tovar1 = prodavec(1, "молоко" )
    val tovar2 = prodavec(1, "мясо" )
    val tovar3 = prodavec(1, "огурцы")
    val tovar4 = prodavec(1, "помидоры")
    val tovar5 = prodavec(1, "тыква")
    print("Информация о товаре №1: ")
    tovar1.tov1 = true
    println()
    print("Информация о товаре №2: ")
    tovar2.tov1 = false
    println()
    print("Информация о товаре №3: ")
    tovar3.tov1 = true
    println()
    print("Информация о товаре №4: ")
    tovar4.tov1 = false
    println()
    print("Информация о товаре №5: ")
    tovar5.tov1 = true

}