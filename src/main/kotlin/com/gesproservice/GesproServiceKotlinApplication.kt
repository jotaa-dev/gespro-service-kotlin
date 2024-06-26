package com.gesproservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.gesproservice.api"])
class GesproServiceKotlinApplication

fun main(args: Array<String>) {
	runApplication<GesproServiceKotlinApplication>(*args)
}
