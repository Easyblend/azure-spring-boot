package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/")
public class HomeController {
    
 @GetMapping("/")
    public String home() {
        // Array of random image URLs
        String[] images = {
            "https://picsum.photos/400/300",  // Random image 1
            "https://placekitten.com/400/300",  // Random image 2
            "https://media2.giphy.com/media/UoeaPqYrimha6rdTFV/giphy.gif?cid=6c09b952of1auo735mo8uad5ry0c9adfupykvudmwhbw6kwt&ep=v1_gifs_search&rid=giphy.gif&ct=g",  // Random image 3
            "https://webartdevelopers.com/blog/wp-content/uploads/2021/05/404-error-page-svg-animation.gif",
            "https://i.pinimg.com/originals/a4/62/d1/a462d192479048db0f02f4466b900e0a.gif"
        };

        // Select a random image from the array
        Random random = new Random();
        String randomImage = images[random.nextInt(images.length)];

        // Return full HTML page as a String
        return "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Home Page</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; text-align: center; padding: 20px; }"
                + "img { max-width: 100%; height: auto; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<h1>Welcome to Home</h1>"
                + "<p>This is a simple Spring Boot web page with a random image.</p>"
                + "<img src=\"" + randomImage + "\" alt=\"Random Image\"/>"
                + "</body>"
                + "</html>";
    }
}
