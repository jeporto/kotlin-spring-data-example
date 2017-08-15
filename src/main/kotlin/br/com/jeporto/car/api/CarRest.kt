package br.com.jeporto.car.api

import br.com.jeporto.car.service.CarService
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import io.swagger.annotations.Api

@RestController
@RequestMapping("/car")
@Api
class CarRest(val carService: CarService) {

	@ApiOperation(value = "Save a car")
    @PostMapping("/")
    fun save(@RequestBody car: Car) = carService.save(car)

	@ApiOperation(value = "Update a car")
	@PutMapping("/")
    fun update(@RequestBody car: Car) = carService.update(car)

	@ApiOperation(value = "Retrieve a list of cars")
    @GetMapping("/")
    fun findAll() = carService.findAll()

	@ApiOperation(value = "Delete a car")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id :Long) {
		carService.delete(id)
	} 
}