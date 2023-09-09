package com.ocrrecgen.OCRrecipegenerator.controller;

import com.ocrrecgen.OCRrecipegenerator.service.OcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/scan")
public class OcrController {

    private final OcrService ocrService;

    @Autowired
    public OcrController(OcrService ocrService) {
        this.ocrService = ocrService;
    }

    @GetMapping(value = "/example-image")
    public String exampleImage() {
        return this.ocrService.scanImage();
    }
}
