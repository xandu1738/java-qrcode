package com.ceres.qrcode;

import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class QrcodeApplication {
    public static void main(String[] args) throws IOException, WriterException, NotFoundException {
        SpringApplication.run(QrcodeApplication.class, args);
    }
}
