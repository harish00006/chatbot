 package com.helloworlds.chatbot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ChatController {

    @PostMapping("/chat")
    public String processMessage(@RequestBody String message) {
        System.out.println("Received message: " + message);
        String response;

        // Convert the user message to lowercase for case-insensitive matching
        String lowercaseMessage = message.toLowerCase();

        if (lowercaseMessage.contains("hello")) {
            response = "Hi there! How can I help you?";
        } else if (lowercaseMessage.contains("how are you")) {
            response = "I'm just a bot, but thanks for asking!";
        } else if (lowercaseMessage.contains("good morning")) {
            response = "Good morning! What can I do for you today?";
        } else if (lowercaseMessage.contains("good afternoon")) {
            response = "Good afternoon! How can I assist you?";
        } else if (lowercaseMessage.contains("good evening")) {
            response = "Good evening! Is there anything I can help with?";
        } else if (lowercaseMessage.contains("bye") || lowercaseMessage.contains("goodbye")) {
            response = "Goodbye! If you have more questions, feel free to ask.";
        } else if (lowercaseMessage.contains("help")) {
            response = "Sure, I'm here to assist you. How can I help?";
        } else if (lowercaseMessage.contains("tell a joke")) {
            response = "Why don't scientists trust atoms? Because they make up everything!";
        } else if (lowercaseMessage.contains("weather")) {
            response = "I'm sorry, I don't have real-time weather information.";
        } // Add more responses as needed
        else {
            // Default response for unrecognized messages
            response = "I'm sorry, I didn't understand that. Can you please rephrase?";
        }

        return response;
    }
}
