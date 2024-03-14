package com.MapsSpring.MapsSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {

    @GetMapping("/showMap")
    public String index() {
        return "index"; // Return the HTML page containing the map
    }

    @PostMapping("/calculateRoute")
    @ResponseBody
    public String calculateRoute(@RequestParam("destination") String destination) {
        // Process the destination and calculate the route
        // Return the route information as JSON or any other format
        return "Route calculated for destination: " + destination;
    }
}
