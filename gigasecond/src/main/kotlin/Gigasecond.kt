import java.lang.Math.pow
import java.time.LocalDate
import java.time.LocalDateTime
class  Gigasecond(val dt: LocalDateTime) {
    constructor(dt: LocalDate) : this(dt.atStartOfDay()) {}
    val date: LocalDateTime = dt.plusSeconds(pow(10.0, 9.0).toLong())
}