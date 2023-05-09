package com.ceres.qrcode.controller;

import com.ceres.qrcode.service.QrCodeService;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class QrCodecontroller {
    private final QrCodeService service;
    @GetMapping("/make")
    String makeQr(String data) throws IOException, WriterException {
        QrCodeService.printQr("it worked.");
        return "Check out and scan the file";
    }
    @GetMapping("/read")
    String readQr(String data) throws NotFoundException, IOException {
        return QrCodeService.readQr();
    }
}
