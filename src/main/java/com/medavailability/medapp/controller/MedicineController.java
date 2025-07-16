package com.medavailability.medapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicineController {

    // Route for homepage (fixes 404)
    @GetMapping("/")
    public String home() {
        return "search"; // maps to search.html inside templates folder
    }

    // Your existing search logic
    @GetMapping("/search")
    public String search(String name, Model model) {
        // Assume you fetch data from DB using name
        // model.addAttribute("stocks", result);
        return "search"; // same view page with data
    }
}
