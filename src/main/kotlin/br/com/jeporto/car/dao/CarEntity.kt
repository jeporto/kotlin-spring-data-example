package br.com.jeporto.car.dao

import javax.persistence.*

@Entity
@Table(name = "car")
data class CarEntity(
        val name: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0) {

	constructor():this("")
    override fun toString(): String {
        return "Car(id=$id, name='$name')"
    }
}