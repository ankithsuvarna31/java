class Employee1 {
    String company = "Coindcx";

    void working() {
        System.out.println("Dev is working");
    }
}

public class Developer extends Employee1 {

    void code() {
        System.out.println("Dev is writing code");
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.code();
        d.working();
    }
}