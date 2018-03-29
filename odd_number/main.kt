fun main(args: Array<String>) {

    val oddNumbers = oddNumber(args[0].toInt(), args[1].toInt()) as IntArray
    for (x in oddNumbers){
    	print(" $x")
    } 
    println("") 
}
