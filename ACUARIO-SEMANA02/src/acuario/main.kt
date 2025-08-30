
package acuario

fun construirAcuario() {
    val acuario1 = acuario()
    acuario1.imprimirTamano()

    val acuario2 = acuario(ancho = 25)
    acuario2.imprimirTamano()

    val acuario3 = acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario4 = acuario(ancho = 25, alto= 40, largo = 110)
    acuario4.imprimirTamano()

    val acuario6 = acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 1000} l")

    val acuario7 = acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    val acuario8 = acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    val miAcuario = acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()


}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Tiburón color: ${tiburon.color}")
    println("Pez Payaso color: ${pezPayaso.color}")
}

fun main() {
    construirAcuario()
    crearPeces()
}