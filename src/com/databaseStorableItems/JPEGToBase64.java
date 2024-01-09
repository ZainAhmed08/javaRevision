package com.databaseStorableItems;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class JPEGToBase64 {
    public static void main(String[] args) {
        try {
            // Replace "your_image.jpg" with the path to your JPEG image
            Path imagePath = Paths.get("C:\\Users\\zaina\\javaRevision\\src\\com\\databaseStorableItems\\whiteCat.jpg");

            // Read the image content
            byte[] imageBytes = Files.readAllBytes(imagePath);

            // Convert image to Base64
            String encodedImage = Base64.getEncoder().encodeToString(imageBytes);

            // Print or use the Base64 encoded image as needed
            System.out.println(encodedImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
