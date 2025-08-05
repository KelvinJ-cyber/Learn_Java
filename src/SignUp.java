import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.*;

public class SignUp {

    static String userEmail;
    static String f_name;
    static String l_name;
    static String password;

    public void userDetails(){
        try {
            HashMap<String, List<String>> userDetails = new HashMap<>();

            Scanner sc = new Scanner(System.in);

            System.out.println("How many users do you want to add?: ");
            int n = sc.nextInt();
            sc.nextLine();

            // Loop to get user details
            for(int i = 0; i < n; i++){
                System.out.print("Enter User ID: ");
                String userId = sc.nextLine();

                System.out.println("Enter your first name: ");
                String f_name = sc.nextLine();

                System.out.println("Enter your last name: ");
                String l_name = sc.nextLine();

                System.out.println("Enter your email: ");
                String email = sc.nextLine();

                System.out.println("Enter your password: ");
                String password = sc.nextLine();


                List<String> userInfo = new ArrayList<>();
                userInfo.add(f_name);
                userInfo.add(l_name);
                userInfo.add(email);
                userInfo.add(password);

                userDetails.put(userId, userInfo);
                System.out.println("User " + userId + " added successfully! ✅");
    //            for (String info : userInfo){
    //                System.out.println(info);
    //            }


            }
            List<String> details = userDetails.get("ST101");
            if (details != null) {
                userEmail = details.get(2); // Get email
            }
            else {
                System.out.println("User not found.");
            }
            f_name = details.get(0);
            l_name = details.get(1);
            password = details.get(3);
        } catch (NullPointerException e) {
            System.out.println( "User details not found. Please ensure you have entered the user ID correctly.");
        }
    }

    String recipient;

    public void sendEmail(String recipient){

        // Sender's email credentials
        final String senderEmail = "kelvinosondu419@gmail.com"; // Your Gmail address
        final String appPassword = "ghks pnyk wmtt kfsu"; // Your app password (not Gmail login)

        // Recipient email
        this.recipient = recipient;

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
            message.setSubject("Welcome to Kelvin Dev Community! 🎉 (Note: This is a test email for now, using Java Mail API)");
            message.setText("Hello " + f_name +" "+ l_name +   " ,\n\n" +
                    "Thank you for signing up with Kelvin Dev Community! \n" +
                    "We are excited to have you on board. \n\n" +
                    "Best regards Bitch!,\n" +
                    "Kelvin Dev Community Team 😌🧃");

            // Send message
            Transport.send(message);

            System.out.println("✅ Email sent successfully to " + recipient);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("❌ Failed to send email.");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("----Welcome to Kelvin Dev Community! Sign up now! 👻---");
        SignUp signUp = new SignUp();
        signUp.userDetails();
        String email = userEmail;
        System.out.println("User email: " + email);
        if (email != null && !email.isEmpty()) {
            System.out.print("Sending mail, Please wait!");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(3000);
                System.out.print(".");
            }
            System.out.println("\n✔ Sent!");
            signUp.sendEmail(email);
        } else {
            System.out.println("No email found for the user.");
        }
        System.out.println("----Now Sign in with Email and Password----\n");
        System.out.println("Enter your email: ");
        Scanner scanner = new Scanner(System.in);
        String inputEmail = scanner.nextLine();
        System.out.println("Enter your password: ");
        String inputPassword = scanner.nextLine();
        if (inputEmail.equals(userEmail) && inputPassword.equals(password) ){
            System.out.println("Welcome " + f_name + " " + l_name + "! You have successfully signed in.");
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║                                               ║");
            System.out.println("║       ✅  LOGIN SUCCESSFUL! WELCOME BACK      ║");
            System.out.println("║                                               ║");
            System.out.println("║         🔐 Access Granted to the System        ║");
            System.out.println("║                                               ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.println("\n");
        } else {
            System.out.println("Invalid email or password. Please try again.");
            System.out.println("\n");
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║                                               ║");
            System.out.println("║       ❌  LOGIN FAILED! ACCESS DENIED         ║");
            System.out.println("║                                               ║");
            System.out.println("║       🚫 Please check your credentials         ║");
            System.out.println("║                                               ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.println("\n");
        }



        System.out.println("Thank you for signing up! We will be in touch soon.");




    }
}
