public class expHandl1 {

    public static void main(String[] args) {

        try {
            System.out.println("A");
            int x = 10 / 0;
        }

        finally {
            System.out.println("B");
        }

        System.out.println("C");
    }
}