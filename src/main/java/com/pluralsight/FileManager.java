package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    // Folder where receipts will be stored
    private static final String RECEIPT_FOLDER = "receipts";

    public static void saveReceipt(Order order) {

        // Create receipts folder if it does not exist
        File folder = new File(RECEIPT_FOLDER);

        if (!folder.exists()) {
            folder.mkdir();
        }

        // Create filename using date and time
        // Example: 20260329-121523.txt
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));

        String filename = RECEIPT_FOLDER + "/" + timestamp + ".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            // Write receipt text into file
            bw.write(order.getReceiptText().toString());

            System.out.println("Receipt saved successfully:");
            System.out.println(filename);

        } catch (IOException e) {

            System.out.println("Error saving receipt.");
            e.printStackTrace();
        }
    }
}
