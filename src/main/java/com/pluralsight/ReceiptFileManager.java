package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import static java.nio.file.Files.write;

public class ReceiptFileManager {

    //Saves date and time for the receipt as file name
    public void saveReceipt(Order order) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mmdd/HH-mm-ss");
        String filename = "Receipt.txt" + LocalDateTime.now().format(formatter);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write((String) order.getReceiptText());

            System.out.println("Receipt saved: " + filename);
        } catch (Exception e) {
            System.out.println("Error saving Receipt file: " + e.getMessage());
        }
        }

    private void write(Object receiptText) {
    }
}

