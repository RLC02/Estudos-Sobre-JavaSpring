package com.HelloMarmota.HelloMarmota.Controller;

import com.HelloMarmota.HelloMarmota.Domain.User;
import com.HelloMarmota.HelloMarmota.Service.HelloMarmotaService;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/hello-marmota")
public class HelloMarmotaController {

    private final HelloMarmotaService helloMarmotaService;

    public HelloMarmotaController(HelloMarmotaService helloMarmotaService) {
        this.helloMarmotaService = helloMarmotaService;
    }
    @GetMapping
    public String helloWorld() {
        return helloMarmotaService.helloMarmota("Ricardo");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam (value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello Marmota" + body.getName() + id + filter;
    }
}