package tasks;

public class task1 {
    public static void main(String[] args) {
        String cardNumberWithSpaces = "1234 5678 9012 3456";
        String cardNumberWithoutSpaces = "1234567890123456";

        System.out.println(maskCardNumber(cardNumberWithSpaces));
        System.out.println(maskCardNumber(cardNumberWithoutSpaces));
    }

    public static String maskCardNumber(String cardNumber) {
        cardNumber = cardNumber.replaceAll("\\s", "");
        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("Неверный номер карты");
        }
        return "**** **** **** " + cardNumber.substring(12);
    }
}
