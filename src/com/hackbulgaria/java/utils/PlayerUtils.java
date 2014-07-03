package com.hackbulgaria.java.utils;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class PlayerUtils {
    private static void printPixel(int intensity) {
        if (intensity > 240) {
            System.out.print(" ");
        } else if (intensity > 200 && intensity <= 240) {
            System.out.print(".");
        } else if (intensity > 160 && intensity <= 200) {
            System.out.print("^");
        } else if (intensity > 120 && intensity <= 160) {
            System.out.print("*");
        } else if (intensity > 80 && intensity <= 120) {
            System.out.print("%");
        } else if (intensity > 40 && intensity <= 80) {
            System.out.print("#");
        } else {
            System.out.print("@");
        }
    }

    private static int getStep(BufferedImage image, int columns) {
        final int width = image.getWidth();
        int step = 1;
        if (columns < width) {
            step = width / columns + 1;
        }
        return step;
    }

    private static int getAverage(int xCoordinate, int yCoordinate, int step, BufferedImage image) {
        int averageIntensity = 0;
        for (int y = yCoordinate; y < yCoordinate + step; y++) {
            for (int x = xCoordinate; x < xCoordinate + step; x++) {
                final int redGreenBlue = image.getRGB(x, y);
                final Color color = new Color(redGreenBlue, false);
                averageIntensity += intensity(color.getRed(), color.getGreen(), color.getBlue());
            }
        }
        return averageIntensity / (step * step);
    }

    public static void write(BufferedImage image, int columns) {
        final int step = getStep(image, columns);
        final int imageHeight = image.getHeight();
        final int imageWidth = image.getWidth();
        for (int y = 0; y < imageHeight && y + step < imageHeight; y += step) {
            for (int x = 0; x < imageWidth && x + step < imageWidth; x += step) {
                printPixel(getAverage(x, y, step, image));
            }
            System.out.println();
        }
    }

    private static int intensity(int red, int green, int blue) {
        return (red + green + blue) / 3;
    }
}
