package com.flightway.flightway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlightwayApplication

fun main(args: Array<String>) {
	runApplication<FlightwayApplication>(*args)
}
