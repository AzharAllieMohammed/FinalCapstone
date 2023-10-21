package za.ac.cput.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dto.AuthenticationRequest;

@RestController
@RequestMapping("/api/v1/auth/greetings")
public class Controller {
    @GetMapping
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Safties Son Op");
    }

    @PostMapping("/post")
    public ResponseEntity<String> create(@RequestBody AuthenticationRequest stomp) {
        return ResponseEntity.ok("koala is getting dubs");
    }

}
