import datastructure.model.Model
import datastructure.model.ModelStatLine

fun main(args: Array<String>) {
    val spaceMarineStats = ModelStatLine(6, 1, 3, 3, 4, 4, 2, 3, 7, 3)
    val spaceMarine = Model(externalId = "SM", name = "Space marine", stats = spaceMarineStats)
    println(spaceMarine)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}