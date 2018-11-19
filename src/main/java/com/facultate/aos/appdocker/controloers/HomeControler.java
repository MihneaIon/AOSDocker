package com.facultate.aos.appdocker.controloers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class HomeControler {

    @RequestMapping("/Mihnea")
    public ResponseEntity Hello() throws UnknownHostException
    {
         return ResponseEntity.ok("Hello world");
    }
}
