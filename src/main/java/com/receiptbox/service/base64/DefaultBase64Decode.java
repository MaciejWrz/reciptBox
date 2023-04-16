package com.receiptbox.service.base64;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;

@Service
public class DefaultBase64Decode implements Base64Decode {
    @Override
    public byte[] decode(String scannedReceipt) {
        if (scannedReceipt == null || scannedReceipt.isBlank()) {
            return null;
        }

        return new Base64().decode(scannedReceipt.trim().getBytes());
    }
}
