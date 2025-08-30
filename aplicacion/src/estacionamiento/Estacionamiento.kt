package estacionamiento

import kotlin.math.PI

open class Estacionamiento(
    open var largo: Int = 50,
    open var ancho: Int = 20
) {
    open val forma = "rectángulo"

    open var capacidad: Int
        get() = (largo * ancho) / 10
        set(valor) {
            ancho = (valor * 10) / largo
        }

    init {
        println("Estacionamiento creado")
    }

    constructor(vehiculos: Int) : this() {
        largo = vehiculos * 2
    }

    open fun imprimirDatos() {
        println("Forma: $forma")
        println("Dimensiones: Largo=$largo, Ancho=$ancho")
        println("Capacidad: $capacidad vehículos")
    }
}

class EstacionamientoCircular(
    var radio: Int
) : Estacionamiento(ancho = radio, largo = radio) {

    override val forma = "circular"

    override var capacidad: Int
        get() = ((PI * radio * radio) / 15).toInt()
        set(valor) {
            radio = kotlin.math.sqrt((valor * 15 / PI)).toInt()
        }

    override fun imprimirDatos() {
        println("Forma: $forma")
        println("Radio: $radio")
        println("Capacidad: $capacidad vehículos")
    }
}
