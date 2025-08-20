 /* 
public class Lab_6 {

    
    static class EvenThread extends Thread {
        int n;

        EvenThread(int n) {
            this.n = n;
        }

        public void run() {
            for (int i = 2; i <= n; i += 2) {
                System.out.println(Thread.currentThread().getName() + " - Even: " + i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

   
    static class OddThread extends Thread {
        int n;

        OddThread(int n) {
            this.n = n;
        }

        public void run() {
            for (int i = 1; i <= n; i += 2) {
                System.out.println(Thread.currentThread().getName() + " - Odd: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        int limit = 10; 

        EvenThread even = new EvenThread(limit);
        OddThread odd = new OddThread(limit);

       
        even.start();
        odd.start();
    }
}


*/

//CODE 2

class TicketCounter {
    private int tickets;

    TicketCounter(int tickets) {
        this.tickets = tickets; 
    }

   
    public synchronized void bookTicket(String userName, int requestedTickets) {
        System.out.println(userName + " trying to book " + requestedTickets + " tickets.");
        
        if (tickets >= requestedTickets) {
            System.out.println("Booking successful for " + userName);
            tickets -= requestedTickets;
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println("Booking failed for " + userName + ". Not enough tickets.");
        }
    }
}


class User extends Thread {
    private TicketCounter counter;
    private int ticketsToBook;

    User(TicketCounter counter, int ticketsToBook, String name) {
        super(name); 
        this.counter = counter;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        counter.bookTicket(getName(), ticketsToBook);
    }
}

// Main class
public class Lab_6 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(10); 

        
        User u1 = new User(counter, 4, "User1");
        User u2 = new User(counter, 3, "User2");
        User u3 = new User(counter, 5, "User3");

       
        u1.start();
        u2.start();
        u3.start();
    }
}



