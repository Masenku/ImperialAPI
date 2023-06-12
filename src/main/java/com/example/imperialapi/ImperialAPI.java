package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialAPI {


    @RequestMapping("/api/centimeter")
    public double inchToCenti(@RequestParam double inch){
        return inch*2.54;
    }

    @RequestMapping("/api/meter")
    public double yardToMeter(@RequestParam double yard){
        return yard/1.094;
    }
}
