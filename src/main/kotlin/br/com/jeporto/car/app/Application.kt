package br.com.jeporto.car.app

import org.slf4j.LoggerFactory  
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@ComponentScan("br.com.jeporto.car")
@EnableJpaRepositories("br.com.jeporto.car")
@EntityScan("br.com.jeporto.car")
class Application {

	companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
