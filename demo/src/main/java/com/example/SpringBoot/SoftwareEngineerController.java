package com.example.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    
    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return List.of(
            new SoftwareEngineer(1,"John Doe","Java"),
            new SoftwareEngineer(2,"Jane Doe","Python"),
            new SoftwareEngineer(3,"Bob Smith","C++"),
            new SoftwareEngineer(4,"Alice Johnson","JavaScript"),
            new SoftwareEngineer(5,"Mike Williams","Java")
        );
    }
}
