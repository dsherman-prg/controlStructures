fun main() {
    var temperature: Double = 99.6
    println("Please enter the temperature")
    temperature = readLine()!!.toDouble()

    if (temperature < 97.5)
        println("The temperature $temperature is low.")
    else if (temperature <= 99.5)
        println("The temperature $temperature is normal.")
    else
        println("The temperature $temperature is high.")
}