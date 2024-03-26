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
        else if (lowercaseMessage.contains("how old are you")) {
            response = "I'm a chatbot, so I don't have an age!";
        } else if (lowercaseMessage.contains("what is your purpose")) {
            response = "My purpose is to assist and provide information.";
        } else if (lowercaseMessage.contains("who created you")) {
            response = "I was created by a team of developers.";
        } else if (lowercaseMessage.contains("what time is it")) {
            response = "I'm sorry, I don't have access to the current time.";
        } else if (lowercaseMessage.contains("how do I reset my password")) {
            response = "To reset your password, go to the login page and click on 'Forgot Password'.";
        }
        else if (lowercaseMessage.contains("how to cook pasta")) {
            response = "Cooking pasta is easy! Boil water, add pasta, cook until al dente, then drain.";
        } else if (lowercaseMessage.contains("tell me a fun fact")) {
            response = "Did you know that a group of flamingos is called a flamboyance?";
        } else if (lowercaseMessage.contains("recommend a book")) {
            response = "One highly recommended book is 'To Kill a Mockingbird' by Harper Lee.";
        } else if (lowercaseMessage.contains("how to learn programming")) {
            response = "To learn programming, start with basics like HTML, CSS, and then move on to languages like Python or JavaScript.";
        } else if (lowercaseMessage.contains("what is the capital of France")) {
            response = "The capital of France is Paris.";
        }
        else if (lowercaseMessage.contains("what is the meaning of life")) {
            response = "The meaning of life is subjective and varies from person to person.";
        } else if (lowercaseMessage.contains("what is the largest mammal")) {
            response = "The blue whale is the largest mammal on Earth.";
        } else if (lowercaseMessage.contains("what is the square root of 144")) {
            response = "The square root of 144 is 12.";
        } else if (lowercaseMessage.contains("how does a computer work")) {
            response = "Computers work by processing data through various components like the CPU, memory, and input/output devices.";
        } else if (lowercaseMessage.contains("what is the boiling point of water")) {
            response = "The boiling point of water is 100 degrees Celsius or 212 degrees Fahrenheit.";
        }
        else if (lowercaseMessage.contains("who wrote Romeo and Juliet")) {
            response = "Romeo and Juliet was written by William Shakespeare.";
        } else if (lowercaseMessage.contains("what is the speed of light")) {
            response = "The speed of light in a vacuum is approximately 299,792 kilometers per second.";
        } else if (lowercaseMessage.contains("what is the capital of Australia")) {
            response = "The capital of Australia is Canberra.";
        } else if (lowercaseMessage.contains("tell me a random fact")) {
            response = "A group of crows is called a murder.";
        } else if (lowercaseMessage.contains("how do I change my email address")) {
            response = "To change your email address, go to your account settings and edit your contact information.";
        }
        else if (lowercaseMessage.contains("what is the meaning of love")) {
    response = "Love is a complex emotion that can mean different things to different people.";
} else if (lowercaseMessage.contains("how do I start a small business")) {
    response = "Starting a small business involves planning, market research, financing, and determination.";
} else if (lowercaseMessage.contains("tell me about Albert Einstein")) {
    response = "Albert Einstein was a theoretical physicist known for the theory of relativity and the equation E=mc².";
} else if (lowercaseMessage.contains("what is the currency of Japan")) {
    response = "The currency of Japan is the Japanese Yen (JPY).";
} else if (lowercaseMessage.contains("what is artificial intelligence")) {
    response = "Artificial intelligence (AI) refers to the simulation of human intelligence in machines.";
}
else if (lowercaseMessage.contains("how do I improve my communication skills")) {
    response = "Improving communication skills involves active listening, clarity, empathy, and practice.";
} else if (lowercaseMessage.contains("tell me about Nelson Mandela")) {
    response = "Nelson Mandela was a South African anti-apartheid revolutionary and political leader.";
} else if (lowercaseMessage.contains("what is the currency of China")) {
    response = "The currency of China is the Chinese Yuan Renminbi (CNY).";
} else if (lowercaseMessage.contains("what is the meaning of democracy")) {
    response = "Democracy is a system of government where power is vested in the people and exercised through elected representatives.";
} else if (lowercaseMessage.contains("what is the purpose of life")) {
    response = "The purpose of life is a philosophical question that varies from individual to individual.";
}
else if (lowercaseMessage.contains("how do I start learning a new language")) {
    response = "To start learning a new language, begin with basic vocabulary and grammar, practice regularly, and immerse yourself in the language.";
} else if (lowercaseMessage.contains("tell me about Mahatma Gandhi")) {
    response = "Mahatma Gandhi was a leader of the Indian independence movement against British rule and an advocate for nonviolent civil disobedience.";
} else if (lowercaseMessage.contains("what is the currency of Russia")) {
    response = "The currency of Russia is the Russian Ruble (RUB).";
} else if (lowercaseMessage.contains("what is climate change")) {
    response = "Climate change refers to long-term changes in temperature, precipitation, and other atmospheric patterns, largely due to human activities.";
} else if (lowercaseMessage.contains("what is the meaning of success")) {
    response = "Success can be defined as the achievement of a desired outcome or the fulfillment of goals.";
}
else if (lowercaseMessage.contains("how do I improve my problem-solving skills")) {
    response = "Improving problem-solving skills involves practice, breaking down problems into smaller parts, and considering multiple solutions.";
} else if (lowercaseMessage.contains("tell me about Isaac Newton")) {
    response = "Isaac Newton was an English mathematician, physicist, and astronomer known for his laws of motion and universal gravitation.";
} else if (lowercaseMessage.contains("what is the currency of Germany")) {
    response = "The currency of Germany is the Euro (EUR).";
} else if (lowercaseMessage.contains("what is renewable energy")) {
    response = "Renewable energy is energy derived from natural resources that are replenished on a human timescale, such as sunlight, wind, and water.";
} else if (lowercaseMessage.contains("what is the meaning of success")) {
    response = "Success can be defined as the accomplishment of an aim or purpose, whether personal, professional, or academic.";
}
else if (lowercaseMessage.contains("how do I improve my leadership skills")) {
    response = "Improving leadership skills involves effective communication, decision-making, delegation, and leading by example.";
} else if (lowercaseMessage.contains("tell me about Rosa Parks")) {
    response = "Rosa Parks was an African American civil rights activist known for her pivotal role in the Montgomery bus boycott.";
} else if (lowercaseMessage.contains("what is the currency of Canada")) {
    response = "The currency of Canada is the Canadian Dollar (CAD).";
} else if (lowercaseMessage.contains("what is the greenhouse effect")) {
    response = "The greenhouse effect is the process by which Earth's atmosphere traps heat, leading to a rise in global temperatures.";
} else if (lowercaseMessage.contains("what is the meaning of education")) {
    response = "Education is the process of acquiring knowledge, skills, values, and beliefs through teaching, training, or study.";
}
else if (lowercaseMessage.contains("how do I improve my public speaking skills")) {
    response = "Improving public speaking skills involves practice, preparation, organization, and connecting with the audience.";
} else if (lowercaseMessage.contains("tell me about Marie Antoinette")) {
    response = "Marie Antoinette was the last Queen of France before the French Revolution, known for her extravagant lifestyle.";
} else if (lowercaseMessage.contains("what is the currency of Italy")) {
    response = "The currency of Italy is the Euro (EUR).";
} else if (lowercaseMessage.contains("what is the ozone layer")) {
    response = "The ozone layer is a region of Earth's stratosphere that contains a high concentration of ozone molecules, which absorb and block ultraviolet radiation from the sun.";
} else if (lowercaseMessage.contains("what is the meaning of democracy")) {
    response = "Democracy is a system of government in which power is vested in the people, who rule either directly or through freely elected representatives.";
}
else if (lowercaseMessage.contains("how do I improve my teamwork skills")) {
    response = "Improving teamwork skills involves effective communication, collaboration, conflict resolution, and mutual respect.";
} else if (lowercaseMessage.contains("tell me about Winston Churchill")) {
    response = "Winston Churchill was a British statesman and Prime Minister known for his leadership during World War II.";
} else if (lowercaseMessage.contains("what is the currency of South Africa")) {
    response = "The currency of South Africa is the South African Rand (ZAR).";
} else if (lowercaseMessage.contains("what is deforestation")) {
    response = "Deforestation is the clearing, removal, or destruction of forests, primarily for the purpose of converting land to agriculture or urban use.";
} else if (lowercaseMessage.contains("what is the meaning of friendship")) {
    response = "Friendship is a close and trusting relationship between two or more people, characterized by mutual affection, support, and understanding.";
}

else if (lowercaseMessage.contains("how do I improve my time management skills")) {
    response = "Improving time management skills involves setting priorities, creating schedules, avoiding procrastination, and being organized.";
} else if (lowercaseMessage.contains("tell me about Leonardo da Vinci")) {
    response = "Leonardo da Vinci was an Italian polymath known for his contributions to art, science, engineering, and anatomy.";
} else if (lowercaseMessage.contains("what is the currency of the United Kingdom")) {
    response = "The currency of the United Kingdom is the British Pound Sterling (GBP).";
} else if (lowercaseMessage.contains("what is globalization")) {
    response = "Globalization is the process of interaction and integration among people, companies, and governments of different nations.";
} else if (lowercaseMessage.contains("what is the meaning of happiness")) {
    response = "Happiness is a state of being characterized by positive emotions, contentment, and fulfillment.";
}

        else if (lowercaseMessage.contains("what is the largest desert in the world")) {
            response = "The largest desert in the world is the Antarctic Desert.";
        } else if (lowercaseMessage.contains("how do I make pancakes")) {
            response = "To make pancakes, mix flour, eggs, milk, and baking powder, then cook on a griddle until golden brown.";
        } else if (lowercaseMessage.contains("tell me about Marie Curie")) {
            response = "Marie Curie was a physicist and chemist known for her pioneering research on radioactivity.";
        } else if (lowercaseMessage.contains("what is the capital of Brazil")) {
            response = "The capital of Brazil is Brasília.";
        } else if (lowercaseMessage.contains("what is the population of India")) {
            response = "As of my last update, the population of India is over 1.3 billion people.";
        }
        else {
           
            response = "I'm sorry, I didn't understand that. Can you please rephrase?";
        }

        return response;
    }
}
