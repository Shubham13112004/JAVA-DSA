import java.util.Scanner;

class Student{

    String name;
    int rollNo;

     Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

     void display(){
        System.out.println("Student Name: "+name+"\n"+"Roll No: "+rollNo);
        System.out.println("------------------------------------------");
    }

 }

  
 class book{
    String title;
    String author;

    book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void display(){ 
        System.out.println("Book: "+title+" by "+author);

        System.out.println("------------------------------------------");
    }
 }


 class Account{
    String accNo;
    double balance;

    Account(String accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance+amount;
        System.out.println("Deposited "+amount+". New Balance: "+balance);
        System.out.println("------------------------------------------");
    }

    void withdraw(double amount){
        if (amount<=balance){
            balance= balance-amount;
            System.out.println("Withdrawn " + amount+". New Balance: "+balance);
            System.out.println("------------------------------------------");
        }else{
            System.out.println("Insufficient balance!");
        }
    }
}



 public class Lab1 {

    public static void main(String[] args){

        System.out.println("NAME:- Shubham Desai\n RNo:-IT3109\n-----------------------------");


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String sName=sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll=sc.nextInt();
        sc.nextLine(); 
        Student s=new Student(sName, roll);
        s.display();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        book b = new book(title, author);
        b.display();

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        Account a = new Account(accNo, balance);

    
        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        a.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        a.withdraw(wd);

        sc.close();

   
    }
 }
