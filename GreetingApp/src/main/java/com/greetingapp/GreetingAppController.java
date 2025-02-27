package com.greetingapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {

    //Use Case 1
    // GET Method - Returns a simple greeting in JSON
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello", "BridgeLabz");
    }

    // POST Method - Accepts a greeting in the body and returns it as JSON
    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return greeting;
    }

    // PUT Method - Accepts updated greeting info and returns the updated greeting in JSON
    @PutMapping
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        // Here we would update the greeting, but for simplicity, we'll just return it
        return greeting;
    }

    // DELETE Method - Returns a goodbye message in JSON
    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting("Goodbye", "BridgeLabz");
    }
}

class Greeting {
    private String message;
    private String recipient;

    // Constructor
    public Greeting(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
