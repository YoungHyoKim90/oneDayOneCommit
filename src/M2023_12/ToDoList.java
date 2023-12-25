package M2023_12;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("간단한 To-Do 리스트입니다. 할 일을 추가하고 삭제해보세요!");

        while (isRunning) {
            System.out.println("\n할 일 목록:");
            if (todoList.isEmpty()) {
                System.out.println("할 일이 없습니다.");
            } else {
                for (int i = 0; i < todoList.size(); i++) {
                    System.out.println((i + 1) + ". " + todoList.get(i));
                }
            }

            System.out.println("\n할 일을 추가하려면 'add', 삭제하려면 'remove', 나가려면 'exit'을 입력하세요:");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "add":
                    System.out.print("추가할 할 일을 입력하세요: ");
                    String newTodo = scanner.nextLine();
                    todoList.add(newTodo);
                    System.out.println("'" + newTodo + "'이(가) 추가되었습니다.");
                    break;
                case "remove":
                    if (!todoList.isEmpty()) {
                        System.out.print("삭제할 할 일 번호를 입력하세요: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // 개행 문자 제거

                        if (indexToRemove > 0 && indexToRemove <= todoList.size()) {
                            String removedTodo = todoList.remove(indexToRemove - 1);
                            System.out.println("'" + removedTodo + "'이(가) 삭제되었습니다.");
                        } else {
                            System.out.println("올바르지 않은 번호입니다.");
                        }
                    } else {
                        System.out.println("삭제할 할 일이 없습니다.");
                    }
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("올바르지 않은 명령입니다. 다시 입력해주세요.");
                    break;
            }
        }

        System.out.println("To-Do 리스트를 종료합니다.");
        scanner.close();
    }
}
