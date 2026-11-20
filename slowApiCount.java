import java.util.HashMap;
import java.util.Map;

public class slowApiCount {
    public static void main(String[] args) {

        HashMap<String, Integer> responseTimes =
            new HashMap<String, Integer>();

        responseTimes.put("Login", 250);
        responseTimes.put("Deposit", 720);
        responseTimes.put("Withdrawal", 650);
        responseTimes.put("Balance", 180);

        int count = 0;

        for (Map.Entry<String, Integer> entry : responseTimes.entrySet()) {

            int time = entry.getValue();

            if (time > 500) {
                count++;
            }
        }

        System.out.println("Total slow APIs: " + count);
    }
}