package com.Courses.MultimediaManagementSystem.infrastructure.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EmailHelper {

    private final JavaMailSender javaMailSender;

    public void sendEmail(String to, String name, LocalDateTime date) {

        MimeMessage message = javaMailSender.createMimeMessage();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String creationDate = date.format(formatter);
        String html = readHTMLTemplate(name, creationDate);

        try {
            message.setFrom("exampleEmailSender@example.com");
            message.setSubject("Account Created");
            message.setRecipients(MimeMessage.RecipientType.TO, to);
            message.setContent(html, "text/html");
            javaMailSender.send(message);
            System.out.println("Email sent to: " + to);
        } catch (Exception e) {
            System.out.println("Error sending email: " + e.getMessage());
            throw new RuntimeException("Error sending email: " + e.getMessage());
        }

    }

    private String readHTMLTemplate(String name, String date) {

        final Path path = Paths.get("src/main/resources/templates/emails/EmailTemplate.html");

        try (var lines = Files.lines(path)) {
            return lines.collect(Collectors.joining())
                    .replace("{{name}}", name)
                    .replace("{{date}}", date)
                    .replace("{{link}}", "https://jhonatantoro.netlify.app/");
        } catch (IOException e) {
            System.out.println("Error reading email template: " + e.getMessage());
            throw new RuntimeException("Error reading email template: " + e.getMessage());
        }

    }

}
