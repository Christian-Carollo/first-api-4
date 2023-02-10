package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/headers")
public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader("host") String host) {
        return "Host: " + host;
    }
}

