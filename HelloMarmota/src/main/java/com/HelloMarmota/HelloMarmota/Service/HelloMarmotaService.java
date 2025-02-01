package com.HelloMarmota.HelloMarmota.Service;
import org.springframework.stereotype.Service;

@Service
public class HelloMarmotaService {

    public String helloMarmota(String name) {
        return "Hello Marmota! " + name;
    }

}
