package br.com.jeporto.car.dao

import org.springframework.data.repository.CrudRepository 
import org.springframework.stereotype.Repository

@Repository
interface CarRepository : CrudRepository<CarEntity, Long> {

	fun findByName(name: String): Iterable<CarEntity>
}
