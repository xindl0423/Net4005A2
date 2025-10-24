import java.rmi.*;
import java.util.*;

public class rsvserver {
    private static final int totalbusiness = 5;
    private static final int totaleconomy = 25;

    private Map<Integer, String> reservations = new HashMap<>();

    public rsvserver() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
    
        try {
            // Connect to server
            new rsvserver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
