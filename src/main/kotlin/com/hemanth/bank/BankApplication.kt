package com.hemanth.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankApplication

fun main(args: Array<String>) {
	runApplication<BankApplication>(*args)

	println("Hello koltin spring boot")
}
