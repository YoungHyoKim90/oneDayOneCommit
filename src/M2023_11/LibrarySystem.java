package M2023_11;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("도서가 없습니다.");
        } else {
            System.out.println("도서 목록:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + (book.isAvailable() ? "대출 가능" : "대출 중"));
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(title + "이(가) 대출되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서를 대출할 수 없습니다.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println(title + "이(가) 반납되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서를 반납할 수 없습니다.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // 초기 도서 추가
        library.addBook("책1");
        library.addBook("책2");
        library.addBook("책3");

        while (true) {
            System.out.println("\n1. 도서 목록 보기");
            System.out.println("2. 도서 대출하기");
            System.out.println("3. 도서 반납하기");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("대출할 도서 제목을 입력하세요: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("반납할 도서 제목을 입력하세요: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
