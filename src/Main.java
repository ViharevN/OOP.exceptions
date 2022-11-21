public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate(
                "test",
                "test",
                "test"
        );
        if (success) {
            System.out.println("данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}