package br.com.jeporto.car.service

import org.springframework.stereotype.Service 
import br.com.jeporto.car.dao.CarRepository
import br.com.jeporto.car.api.Car
import br.com.jeporto.car.dao.CarEntity

@Service
class CarService (val carRepository: CarRepository) {

    fun save(car: Car): String {
		var entity = CarEntity(car.name)
    	carRepository.save(entity)
        return "Ok"
	}    

    fun update(car: Car): String {
		var entity = CarEntity(car.name, car.id)
    	carRepository.save(entity)
        return "Ok"
	}    

    fun findAll(): List<Car> {
		return carRepository
					.findAll()
					.map { c-> Car(c.name, c.id) }
	}    

    fun delete(id: Long) {
		carRepository.delete(id)
	}    
}