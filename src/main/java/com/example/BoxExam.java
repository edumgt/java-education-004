package com.example;
import java.util.Scanner;

public class BoxExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = readDouble(scanner, "박스의 길이를 입력하세요 (cm): ");
        double width = readDouble(scanner, "박스의 너비를 입력하세요 (cm): ");
        double height = readDouble(scanner, "박스의 높이를 입력하세요 (cm): ");

        try {
            Box box = new Box(length, width, height);

            Box box1 = new Box(length, width, height);
            // System.out.println("입력한 박스 정보:");
            // System.out.println(box.toString());
            // System.out.println(box.getClass().getPackageName());


            System.out.println(" box1.getHeight() -- " + box1.getHeight());

        } catch (IllegalArgumentException e) {
            System.out.println("⚠ 오류: " + e.getMessage());
        }

        scanner.close();
    }

    // 🔹 숫자 입력을 안전하게 받는 메서드
    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ 숫자를 입력해야 합니다. 다시 시도해주세요.");
            }
        }
    }
}
