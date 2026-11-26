

import java.util.HashMap;
import java.util.Map;

public class fastestApi {

    public static void main(String[] args) {
        HashMap<String, Integer> responseTimes = new HashMap<>();

        responseTimes.put("Login", 250);
        responseTimes.put("Deposit", 720);
        responseTimes.put("Withdrawal", 500);
        responseTimes.put("Balance", 150);

        int minTime = Integer.MAX_VALUE;
        String fastestApi = "";

        for (Map.Entry<String, Integer> entry : responseTimes.entrySet()) {

            String apiName = entry.getKey();
            int responseTime = entry.getValue();

            if (responseTime < minTime) {
                minTime = responseTime;
                fastestApi = apiName;
            }
        }

        System.out.println("Fastest API: " + fastestApi);
        System.out.println("Response time: " + minTime + " ms");
    }
}