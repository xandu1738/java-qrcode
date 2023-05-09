package com.ceres.qrcode.service;

import com.ceres.qrcode.reader.QrReader;
import com.google.zxing.EncodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.ceres.qrcode.generator.QrGenerator.createQRImage;
@Service
public class QrCodeService {
    public static void printQr(String qrText) throws IOException, WriterException {
        String filePath = "qrImage.png";
        int size = 250;
        String fileType = "png";
        File qrFile = new File(filePath);
        createQRImage(qrFile, qrText, size, fileType);
    }
    public static String readQr() throws NotFoundException, IOException {
        String path = "/home/artemis/Desktop/qrImage.png";
        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();

        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        System.out.println("QRCode output: " + QrReader.readQr(path, charset, hashMap));
        return QrReader.readQr(path, charset, hashMap);
    }
}
