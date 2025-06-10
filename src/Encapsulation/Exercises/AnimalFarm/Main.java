import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(scanner.nextLine());

            try {
                Chicken chicken = new Chicken(name, age);
                System.out.println(chicken);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("⚠️ 숫자 형식이 잘못되었습니다. 정수를 입력하세요.");
        }
    }
}
