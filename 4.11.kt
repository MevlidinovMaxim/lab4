fun main(){

    val Book1 = Hranilishe("Возвращение", "Ремарк Эрих Мария", 1931, 6.7)
    val Book2 = Hranilishe("Иллюзия греха", "Маринина Александра", 1996, 8.4)
    val Book3 = Hranilishe("Триумфальная арка", "Ремарк Эрих Мария", 1945, 5.2)
    val Book4 = Hranilishe("Преступление и наказание", "Достоевский Фёдор", 1866, 9.1)
    val Book5 = Hranilishe("Яд бессмертия", "Робертс Нора", 1996, 7.5)

    print("Название книги: ")
    println(Book1.name)
    print("Автор: ")
    println(Book1.author)
    print("Год выпуска: ")
    println(Book1.years)
    Book1.yearBook = false
    println("\n")

    print("Название книги: ")
    println(Book2.name)
    print("Автор: ")
    println(Book2.author)
    print("Год выпуска: ")
    println(Book2.years)
    Book2.yearBook = true
    println("\n")

    print("Название книги: ")
    println(Book3.name)
    print("Автор: ")
    println(Book3.author)
    print("Год выпуска: ")
    println(Book3.years)
    Book3.yearBook = false
    println("\n")

    print("Название книги: ")
    println(Book4.name)
    print("Автор: ")
    println(Book4.author)
    print("Год выпуска: ")
    println(Book4.years)
    Book4.yearBook = true
    println("\n")

    print("Название книги: ")
    println(Book5.name)
    print("Автор: ")
    println(Book5.author)
    print("Год выпуска: ")
    println(Book5.years)
    Book5.yearBook = true
    println()

}