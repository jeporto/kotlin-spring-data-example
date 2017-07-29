package br.com.jeporto.car.api

data class Car(
        val name: String,
        val id: Long) {

    override fun toString(): String {
        return "Car(id=$id, name='$name')"
    }
}