package com.ocrrecgen.OCRrecipegenerator.service;

import org.springframework.stereotype.Service;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

@Service
public class OcrService {

    Tesseract tesseract;

    public OcrService() {
        this.tesseract = new Tesseract();
    }

    public String scanImage() {
        try {
            tesseract.setDatapath("C:\\Tess4J\\tessdata");

            return tesseract.doOCR(new File("C:\\Users\\russk\\Downloads\\testocr.png"));
        } catch (TesseractException e) {
            return e.getMessage();
        }
    }
}
