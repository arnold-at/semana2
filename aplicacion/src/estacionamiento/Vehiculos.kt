package estacionamiento

abstract class Vehiculo {
    abstract val tipo: String
    abstract val color: String
}

interface AccionVehiculo {
    fun mover()
}

class Auto(
    override val color: String = "rojo"
) : Vehiculo(), AccionVehiculo {
    override val tipo = "Auto"
    override fun mover() {
        println("El auto avanza por la carretera")
    }
}

class Moto(
    override val color: String = "negra"
) : Vehiculo(), AccionVehiculo {
    override val tipo = "Moto"
    override fun mover() {
        println("La moto zigzaguea entre los autos")
    }
}
