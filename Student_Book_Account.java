
class Student {
    String name;
    int rollNo;
    Account account;
    Book book;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
            account.displayAccount();
            book.displayBook();  
    }
}


class Account {
    int accNumber;
    double balance;

    Account(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: ₹" + balance);
    }
}


class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Issued Book: " + title + " by " + author);
    }
}


public class Student_Book_Account {
    public static void main(String[] args) {
        Student s1 = new Student("SHUBHAM DESAI",9);
        s1.account = new Account(1001,500);
        s1.book = new Book("Java Programming", "James Gosling");
        s1.displayDetails();
    }
}
