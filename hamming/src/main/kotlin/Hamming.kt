import java.lang.*

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var count: Int = 0
            if (leftStrand.length != rightStrand.length) {
                throw IllegalArgumentException("left and right strands must be of equal length")
            } else {
                var length = leftStrand.length
                for (i in 0..length - 1) {
                    if (leftStrand[i] != rightStrand[i]) {
                        count++;
                    }
                }
            }
            return count
    }
}
