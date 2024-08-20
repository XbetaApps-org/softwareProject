package com.software.models;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailSender {

    private static final Logger LOGGER = Logger.getLogger(MailSender.class.getName());

    private MailSender() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void sendEmail(String senderName, String senderEmail, String recipientName, String recipientEmail, String subject, String body) {
        try {
            String apiKey = "2b14f75b29mshb1f72f0726dd5cep15447ejsn6ce89eab052b";
            String apiHost = "mail-sender-api1.p.rapidapi.com";
            String isHtml = "false";
            String requestBody = String.format(
                "{\"sendto\":\"%s\",\"name\":\"%s\",\"replyTo\":\"%s\",\"ishtml\":\"%s\",\"title\":\"%s\",\"body\":\"%s\",\"recipientName\":\"%s\"}",
                recipientEmail, senderName, senderEmail, isHtml, subject, body, recipientName
            );

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://mail-sender-api1.p.rapidapi.com/"))
                    .header("x-rapidapi-key", apiKey)
                    .header("x-rapidapi-host", apiHost)
                    .header("Content-Type", "application/json")
                    .method("POST", HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            LOGGER.log(Level.INFO, "Response: {0}", response.body());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            LOGGER.log(Level.SEVERE, "Thread was interrupted during email sending", e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An error occurred while sending the email", e);
        }
    }
}
