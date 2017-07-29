package br.com.jeporto.car.service

import org.junit.Test  
import org.junit.Before
import br.com.jeporto.car.service.CarService
import br.com.jeporto.car.dao.CarRepository
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import br.com.jeporto.car.dao.CarEntity
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.hamcrest.Matchers.equalTo
import br.com.jeporto.car.api.Car


class CarServiceTest {
	
	private lateinit var service: CarService
	private lateinit var car: Car

	@Before
	fun setUp() {
		car = Car("ferrari", 1)
		var repository: CarRepository = mock(CarRepository::class.java)
		`when`(repository.findAll()).thenReturn(listOf(CarEntity("ferrari", 1)))
		service = CarService(repository)
	}

	@Test fun shouldSaveCar() {
		assertThat(service.save(car), equalTo("Ok"))
	}

	@Test fun shouldReturnCarList() {
		assertEquals(service.findAll(), mutableListOf(car))
	}
}