fun main() {
    val name = "Ronica"
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("Merry Christmas, ${name}!")
    printBorder(border, timesToRepeat)
    println("")
    
    // Let's print a Christmas tree
    println("          _")
    println("       |\\ 0 /|")
    println("        |/|\\|")
    println("          |")
    println("          @")
    println("         /+\\")
    println("        o/@\\\\")
    println("      +//o/\\\\o")
    println("      //+/@\\\\/+o")
    println("     /\\/o//+/\\\\\\\\")
    println("    +///\\//\\o\\o+\\\\o")
    println("   o/+@/++/\\\\\\@\\\\/\\+")
    println("  /\\/+///o/@\\o+/\\+\\\\")
    println(" o/+/\\/@//||\\/\\\\o\\\\\\o _")
    println("  /__ /|  ||      /__ /|")
    println(" | * | | (__)___ | * | |")
    println(" |___|/_   /__ /||___|/")
    println("     /_/| | * | |")
    println("    |_|/  |___|/")
    
    // This prints an empty line
    println("")
    
    print("Christmas is the spirit of giving without a thought of getting.\n")
    print("It is happiness because we see joy in people.\n")
    print("It is forgetting self and finding time for others.\n")
    println("It is discarding the meaningless and stressing the true values.")
    println("- Thomas S. Monson")
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
