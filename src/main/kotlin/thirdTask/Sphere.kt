package thirdTask

import kotlin.math.pow

class Sphere( private val radius: Double) : ThreeDimensionalShape {

    override fun volume(): Double {
        return 4.0 / 3.0 * Math.PI * radius.pow(3.0)
    }

    override fun baseArea(): Double {
        return Math.PI * radius.pow(2.0)
    }
}