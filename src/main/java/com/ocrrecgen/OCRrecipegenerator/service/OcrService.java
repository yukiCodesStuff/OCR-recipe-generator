package com.ocrrecgen.OCRrecipegenerator.service;

import net.sourceforge.tess4j.ITesseract;
import org.springframework.stereotype.Service;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Service
public class OcrService {

    Tesseract tesseract;

    public OcrService() {
        this.tesseract = new Tesseract();
    }

    public String scanImage() {
        try {
            tesseract.setDatapath("C:\\Tess4J\\tessdata");

            return tesseract.doOCR(new File("C:\\Users\\russk\\Downloads\\image.png"));
        } catch (TesseractException e) {
            return e.getMessage();
        }
    }
}
