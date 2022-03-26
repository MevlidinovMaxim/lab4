class numVoler(val name: String,  var gender: String,  var size: String, var zvuk: String)

fun main(){
    val vol1 = numVoler("Котята, ", "мужской пол, ", "количество: 12, ", "звук: (мяу)" )
    val vol2 = numVoler("Собаки, ", "женский пол, ", "количество: 7, ", "звук: (гав)" )
    val vol3 = numVoler("Львы, ", "мужской пол, ", "количество: 4, ", "звук: (ррр)" )
    val vol4 = numVoler("Гуси, ", "женский и мужской пол, ", "количество: 23, ", "звук: (га-га-га)" )
    val vol5 = numVoler("Куры, ", "женский пол, ", "количество: 18, ", "звук: (ку-ка-ре-ку)" )

    print("Введите номер вольера от 1 до 5 к которому хотите подойти: ")
    val n = readLine()!!.toInt()
    if (n == 1){
        print("Вольер №1: ")
        print(vol1.name)
        print(vol1.gender)
        print(vol1.size)
        println(vol1.zvuk)
    }
    else if (n == 2) {
        print("Вольер №2: ")
        print(vol2.name)
        print(vol2.gender)
        print(vol2.size)
        println(vol2.zvuk)
    }
    else if (n == 3) {
        print("Вольер №3: ")
        print(vol3.name)
        print(vol3.gender)
        print(vol3.size)
        println(vol3.zvuk)
    }
    else if (n == 4) {
        print("Вольер №4: ")
        print(vol4.name)
        print(vol4.gender)
        print(vol4.size)
        println(vol4.zvuk)
    }
    else if (n == 5) {
        print("Вольер №5: ")
        print(vol5.name)
        print(vol5.gender)
        print(vol5.size)
        println(vol5.zvuk)
    }
}




