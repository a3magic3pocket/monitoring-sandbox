package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping(value = ["/"])
    fun deploymentName(): String {
        return "hello world!"
    }
}
