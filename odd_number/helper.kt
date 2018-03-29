fun oddNumber(start: Int, end: Int) : IntArray? {
	
	var index = 0
	var startIndex = start
	if (startIndex %2 == 0) {
		// The start number is even
		startIndex += 1
	}
	
	var intArray = IntArray((end-start)/2)
	for(x in startIndex..end step 2) {		
		intArray.set(index, x)
		index++
	}
	
	return intArray
}