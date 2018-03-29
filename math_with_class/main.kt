fun main(args: Array<String>) {

     val math = Math()
     
     println("Sum of 20 and 10 is ${math.add(20, 10)}")
     println("Subtraction of 20 by 10 is ${math.subtract(20, 10)}")
     println("Multiplication of 20 by 10 is ${math.multiply(20, 10)}")
     println("Division of 20 by 10 is ${math.divide(20, 10)}")
     println("Maximum among 20 and 10 is ${math.max(200, 1000)}")

	 print("Value of expression ((20*10)/(20-10)) + 100 is ")
     val result = math.add(math.divide(math.multiply(20, 10), math.subtract(20, 10)), 100)
     println(result)
     
     
}
