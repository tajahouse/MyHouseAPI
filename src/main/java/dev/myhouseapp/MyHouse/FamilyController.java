package dev.myhouseapp.MyHouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/families")
public class FamilyController {
    @GetMapping
    public String allFamilies(){
        return "Families List";
    }
}
