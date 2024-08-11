package com.software.models;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MailSender {

    public static void sendEmail(String senderName, String senderEmail, String recipientName, String recipientEmail, String subject, String body) {
        try {
            String apiKey = "2b14f75b29mshb1f72f0726dd5cep15447ejsn6ce89eab052b";
            String apiHost = "mail-sender-api1.p.rapidapi.com";
            String isHtml = "false";  // Set to "true" if the body is HTML content

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
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*   USAGE OF MAIL SENDER
String senderName = "Sender Name";
String senderEmail = "sender@example.com";
String recipientName = "Recipient Name";
String recipientEmail = "------------------";
String subject = "Email Subject";
String body = "This is the body of the email.";

MailSender.sendEmail(senderName, senderEmail, recipientName, recipientEmail, subject, body);
*/