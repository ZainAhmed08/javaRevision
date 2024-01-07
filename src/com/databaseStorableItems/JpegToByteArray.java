package com.databaseStorableItems;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JpegToByteArray {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\zaina\\javaRevision\\src\\com\\databaseStorableItems\\whiteCat.jpg");
            byte[] imageData = convertImageToByteArray(inputFile);

            // Print the formatted byte array
            for (int i = 0; i < imageData.length; i++) {
                System.out.print(imageData[i]);
                if (i < imageData.length - 1) {
                    System.out.print(", ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] convertImageToByteArray(File imageFile) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(imageFile);

        // Check if the image was successfully read
        if (bufferedImage != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            return baos.toByteArray();
        } else {
            return null;
        }
    }
}
