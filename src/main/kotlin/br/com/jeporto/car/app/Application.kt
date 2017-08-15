package br.com.jeporto.car.app

import com.google.common.base.Predicates
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@EnableAutoConfiguration
@ComponentScan("br.com.jeporto.car")
@EnableJpaRepositories("br.com.jeporto.car")
@EntityScan("br.com.jeporto.car")
@EnableSwagger2
class Application {

	companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }

	@Bean
    fun api(): Docket {
      return Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(Predicates.not(PathSelectors.regex("/error")))
      .build();
	}
}
