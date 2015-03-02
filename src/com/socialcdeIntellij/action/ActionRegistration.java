package com.socialcdeIntellij.action;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Teo on 02/03/2015.
 */
public class ActionRegistration {

    private BufferedImage resize(BufferedImage originalImage, int width, int height) throws IOException {
        BufferedImage resizedImage = null;
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }//ridimensione immagine

    public Image get_ImageStream(InputStream stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream
}
