
import java.util.HashMap;
import java.util.Map;

public class entryset {
    public static void main(String[] args) {
        HashMap<String, Integer> responseTimes = new HashMap<>();

        responseTimes.put("Login", 250);
        responseTimes.put("Deposit", 720);
        responseTimes.put("Withdrawal", 500);

        for (Map.Entry<String, Integer> entry : responseTimes.entrySet()) {
            String apiName = entry.getKey();
            int time = entry.getValue();

            if (time > 500) {
                System.out.println(apiName + " took " + time + " ms");
            }
        }
    }
}
    

