class Hranilishe( val name: String,  var author: String,  var years: Int, var rate: Double) {

    var yearBook: Boolean = true
        get() {
            return rate > 7
        }
        set(value) {
            if (value){
                print("Оценка критиков выше среднего")
            }
            else {
                print("Оценка критиков ниже среднего")
            }
            field = value
        }
}