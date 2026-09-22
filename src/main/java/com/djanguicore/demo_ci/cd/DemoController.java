package com.djanguicore.demo_ci.cd;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "democicd", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @GetMapping
    public List<Object> search() {
        return List.of(new Dem(1,"Belle formation", 1));
    }
}
