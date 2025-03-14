package nested.test.ex1;

public class Library {

    private Book[] books;
    private int idx = 0;

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if(idx >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[idx++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for(int i=0; i<idx; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " +  books[i].author);
        }
    }
}
