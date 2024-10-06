fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is an even number.")
        } else {
            println("$number is an odd number.")
        }
    } else {
        println("Please enter a valid number.")
    }
}
