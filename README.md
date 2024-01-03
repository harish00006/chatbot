# chatbot
simple chatbot project able to understand and responds for the user queries.
# Chatbot Application

## Overview

This is a simple chatbot application built using Spring Boot and designed for interaction through a web interface. The application responds to user messages with predefined responses and allows users to communicate with the chatbot.

## Technologies Used

- Spring Boot
- HTML/CSS
- JavaScript
- WebSockets (for real-time communication)

## Getting Started

To run the chatbot application locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/chatbot-application.git

--Navigate to the project directory:

cd chatbot-application

--Run the Spring Boot application:

./mvnw spring-boot:run
--Open your web browser and go to http://localhost:8080 to interact with the chatbot.

--Usage
* Enter a message in the input field and click "Send" to send a text message to the chatbot.
* Click the "Voice" button to use voice recognition for input.
* The chat history will display both user and bot messages.

--Customization
* To customize the chatbot responses, modify the ChatController class in the com.helloworlds.chatbot package. Add or modify responses based on your requirements.
