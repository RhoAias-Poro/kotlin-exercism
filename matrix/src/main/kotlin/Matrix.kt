class Matrix(private val matrixAsString: String) {

    var row = 1
    var column = 1

    fun convertStringToIntMatrix(): Array<IntArray> {
        for (i in 0..matrixAsString.length - 1) {
            if (matrixAsString[i].toString().compareTo("\n") == 0) row++
        }
        for (i in 0..(matrixAsString.length - 1) / row) {
            if (matrixAsString[i].toString().compareTo(" ") == 0) column++
        }
        var matrix = Array(row) { IntArray(column) }
        var index = 0
        for (i in 0..row - 1) {
            for (j in 0..column - 1) {
                var string: String = ""
                while (matrixAsString[index].toString().compareTo(" ") != 0 && matrixAsString[index].toString()
                        .compareTo("\n") != 0
                ) {
                    string += matrixAsString[index].toString()
                    index++
                    if (index > matrixAsString.length - 1) break
                }
                matrix[i][j] = string.toInt()
                if (index <= matrixAsString.length) index++
            }
        }
        return matrix
    }


    fun column(colNr: Int): List<Int> {
        var matrix = convertStringToIntMatrix()
        var result = mutableListOf<Int>()
        for (i in 0..row - 1) {
            result.add(matrix[i][colNr - 1])
        }
        return result
    }

    fun row(rowNr: Int): List<Int> {
        var matrix = convertStringToIntMatrix()
        var result = mutableListOf<Int>()
        for (i in matrix[rowNr - 1].indices) {
            result.add(matrix[rowNr - 1][i])
        }
        return result
    }
}
