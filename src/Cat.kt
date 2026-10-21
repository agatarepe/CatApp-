class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk(distance: Int): Boolean {
        if (distance < 0 || weight - distance < 5) {
            return false
        }

        weight -= distance
        return true
    }

    fun eat(amount: Int): Boolean {
        if (amount < 0 || weight + amount > 20) {
            return false
        }

        weight += amount
        return true
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}