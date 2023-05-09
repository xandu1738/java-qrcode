package com.ceres.qrcode;

import com.google.zxing.WriterException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

import static com.ceres.qrcode.generator.QrGenerator.createQRImage;

@SpringBootApplication
public class QrcodeApplication {
    public static void main(String[] args) throws IOException, WriterException {
        SpringApplication.run(QrcodeApplication.class, args);
        String qrCodeText = "https://www.amigoscode.com";
        String filePath = "qrImage.png";
        int size = 250;
        String fileType = "png";
        File qrFile = new File(filePath);
        createQRImage(qrFile, qrCodeText, size, fileType);
        System.out.println("DONE");
    }
}
