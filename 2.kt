class prodavec(var t1: Int, val n: String) {

    var tov1: Boolean = true
        get() {
            return t1 == 1
        }
        set(value) {
            if (value) {
                print("Товар $n есть в наличии ")
            }
            else {
                print("Товар $n продан покупателю")
            }
            field = value
        }
}
