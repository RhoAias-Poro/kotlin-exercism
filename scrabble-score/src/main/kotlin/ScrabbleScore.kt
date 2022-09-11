object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
       return letterTable(c.toUpperCase())
    }

    fun scoreWord(word: String): Int {
       var result = 0
        for(i in 0..word.length-1)
        {
            result += letterTable(word[i].toUpperCase())
        }
        return result
    }

    fun letterTable(c: Char): Int{
        when(c)
        {
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> return 1
            'D', 'G' -> return 2
            'B', 'C', 'M', 'P' -> return 3
            'F', 'H', 'V', 'W', 'Y' -> return 4
            'K' -> return 5
            'J' , 'X' -> return 8
            'Q', 'Z' -> return 10
        }
        return 0;
    }
}
