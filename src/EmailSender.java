import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {

        // Sender's email credentials
        final String senderEmail = "kelvinosondu419@gmail.com"; // Your Gmail address
        final String appPassword = "ghks pnyk wmtt kfsu"; // Your app password (not Gmail login)

        // Recipient email
        String recipient = "justineikechi6@gmail.com";

        // SMTP server info
        String host = "smtp.gmail.com";

        // Required for TLS 1.2 compatibility
        System.setProperty("https.protocols", "TLSv1.2");

        // ✅ Set up mail properties (SMTP settings)
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true"); // Yes, we need login
        props.put("mail.smtp.starttls.enable", "true"); // Enable TLS encryption
        props.put("mail.smtp.host", host); // Gmail's server
        props.put("mail.smtp.port", "587"); // Gmail's port for TLS
        props.put("mail.smtp.ssl.protocols", "TLSv1.2"); // Explicitly say use TLSv1.2
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // Trust this host

        // ✅ Set up the session with an authenticator
        // Create session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
            // Create email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipient)
            );
            message.setSubject("Test Email from Java");
            message.setText("Hello Kelvin,\n\nThis is a test email sent from Java using Gmail SMTP!");

            // Send message
            Transport.send(message);

            System.out.println("✅ Email sent successfully to " + recipient);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("❌ Failed to send email.");
        }
    }
}
