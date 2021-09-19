fun main() {
    // Initialize variables
    var temperature = 99.6

    // Get user input
    println("Please enter the temperature")
    temperature = readLine()!!.toDouble()

    // Compare the user input temperature and print if it is low, normal, or high.
    if (temperature < 97.5)
        println("The temperature $temperature is low.")
    else if (temperature <= 99.5)
        println("The temperature $temperature is normal.")
    else
        println("The temperature $temperature is high.")
}