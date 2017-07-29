package br.com.jeporto.car.api

import org.springframework.web.bind.annotation.DeleteMapping  
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import br.com.jeporto.car.service.CarService

@RestController
class CarRest(val carService: CarService) {

    @PostMapping("/")
    fun save(@RequestBody car: Car) = carService.save(car)

	@PutMapping("/")
    fun update(@RequestBody car: Car) = carService.update(car)

    @GetMapping("/")
    fun findAll() = carService.findAll()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id :Long) {
		carService.delete(id)
	} 
}