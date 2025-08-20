import java.util.*;


interface CollabDevice{
    void powerOn();
    void powerOff();
    void statusReport();
}

interface InternetEnabled{
    void connectWifi(String network);
}

class SmartTv implements CollabDevice, InternetEnabled{
    String network;

    public SmartTv(String n) {
        this.network = n;
        System.out.println("The network is " + n);
    }

    public void powerOn() {
        System.out.println("Turn on the power!");
    }

    public void powerOff() {
        System.out.println("Turn off the power!");
    }

    public void statusReport() {
        System.out.println("Status of SmartTv!");
    }

    public void connectWifi(String network) {
        System.out.println("The network is " + network);
    }
}

class SmartFridge implements CollabDevice, InternetEnabled {
    public void powerOn() {
        System.out.println("Turn on the SmartFridge!");
    }

    public void powerOff() {
        System.out.println("Turn off the SmartFridge!");
    }

    public void statusReport() {
        System.out.println("Status of SmartFridge!");
    }

    public void connectWifi(String network) {
        System.out.println("The network is " + network);
    }
}

class SmartAc implements CollabDevice, InternetEnabled {
    private boolean f = false;

    public void powerOn() {
        f = true;
        System.out.println("Turn on the SmartAc!");
    }

    public void powerOff() {
        f = false;
        System.out.println("Turn off the SmartAc!");
    }

    public void statusReport() {
        System.out.println("Status of SmartAc!");
    }

    public void connectWifi(String network){
        System.out.println("The network is " + network);
    }
}

public class Lab_5 {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("Name: Shubham Desai");
        System.out.println("Rno :-IT3109");
        System.out.println("------------------------------------");

        SmartTv s = new SmartTv("Jio");
        s.powerOff();
        s.powerOn();
        s.connectWifi("Airtel");
        s.statusReport();

        System.out.println("------------------------------");

        SmartFridge f = new SmartFridge();
        f.connectWifi("JIO");
        f.powerOn();
        f.powerOff();
        f.statusReport();

        System.out.println("------------------------------");

        SmartAc a = new SmartAc();
        a.connectWifi("BSNL");
        a.powerOn();
        a.powerOff();
        a.statusReport();

        System.out.println("------------------------------");
    }
}
