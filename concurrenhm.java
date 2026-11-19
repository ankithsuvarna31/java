import java.util.concurrent.ConcurrentHashMap;

public class concurrenhm {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> apiStatus =
            new ConcurrentHashMap<String, Integer>();

        apiStatus.put("Login", 200);
        apiStatus.put("Deposit", 201);

        System.out.println(apiStatus.get("Deposit"));
    }
}