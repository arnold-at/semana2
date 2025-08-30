package estacionamiento

fun crearVehiculos() {
    val auto = Auto()
    val moto = Moto()

    println("Vehículo: ${auto.tipo}, Color: ${auto.color}")
    auto.mover()

    println("Vehículo: ${moto.tipo}, Color: ${moto.color}")
    moto.mover()
}

fun construirEstacionamientos() {
    val e1 = Estacionamiento()
    e1.imprimirDatos()

    val e2 = Estacionamiento(vehiculos = 15)
    e2.imprimirDatos()

    val e3 = EstacionamientoCircular(radio = 10)
    e3.imprimirDatos()
}

fun main() {
    println("=== Vehículos ===")
    crearVehiculos()

    println("\n=== Estacionamientos ===")
    construirEstacionamientos()
}
