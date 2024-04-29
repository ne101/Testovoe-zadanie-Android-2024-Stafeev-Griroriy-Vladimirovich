package thirdTask

fun main() {
    val sphere = Sphere(5.0)
    println("Объем сферы: ${sphere.volume()}, Площадь основания сферы: ${sphere.baseArea()}")

    val cylinder = Cylinder(5.0, 10.0)
    println("Объем цилиндра: ${cylinder.volume()}, Площадь основания цилиндра: ${cylinder.baseArea()}")
}