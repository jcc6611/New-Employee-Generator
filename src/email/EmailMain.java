package email;

public class EmailMain {

    public static void main(String[] args) {
        Email mail = new Email("John", "Smith");
        System.out.println(mail.showInfo());
    }
}
