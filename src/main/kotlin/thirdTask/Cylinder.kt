package thirdTask

import kotlin.math.pow

class Cylinder(private val radius: Double, private val height: Double) : ThreeDimensionalShape {
    override fun volume(): Double {
        return Math.PI * radius.pow(2.0) * height
    }

    override fun baseArea(): Double {
        return Math.PI * radius.pow(2.0)
    }
}