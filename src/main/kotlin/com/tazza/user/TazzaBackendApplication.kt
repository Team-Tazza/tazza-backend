package com.tazza.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TazzaBackendApplication

fun main(args: Array<String>) {
    runApplication<TazzaBackendApplication>(*args)
}
