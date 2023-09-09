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
        tesseract.setDatapath("/Users/yukijanvier/Documents/OCR-recipe-generator/tessdata");
        tesseract.setLanguage("eng");
        tesseract.setPageSegMode(1);
        tesseract.setOcrEngineMode(1);
    }

    public String scanImage() {
        try {
            File image = new File("/Users/yukijanvier/Documents/OCR-recipe-generator/src/main/java/com/ocrrecgen/OCRrecipegenerator/images/image.png");
            return tesseract.doOCR(image);

        } catch (TesseractException e) {
            return e.getMessage();
        }
    }
}
