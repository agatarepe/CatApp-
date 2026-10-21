fun main() {

    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    println("Before:")
    println(binnie)
    println(clyde)

    println("Binnie walks 3: ${binnie.walk(3)}")
    println("Clyde walks 2: ${clyde.walk(2)}")

    println("Binnie eats 5: ${binnie.eat(5)}")
    println("Clyde eats 20: ${clyde.eat(20)}")

    println("After:")
    println(binnie)
    println(clyde)
}