import java.rmi.*;

public class rsvclient {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java rsvclient list <server_name>");
            System.out.println("Usage: java reserve <server_name> <class> <passenger_name> <seat_number>");
            System.out.println("Usage: java passengerlist <servername>");
            return;
        }

        String serverIP = args[0];
        int serverPort = Integer.parseInt(args[1]);
        String filename = args[2];

        Socket socket = null;
        DataInputStream in = null;
        DataOutputStream out = null;
        FileOutputStream fileOutputStream = null;

        try {
            switch();
                case "list":
                 String availableSeats = reservationService.listavailableseats();
                    System.out.println(availableSeats);
                    break;
                case "reserve":
                    if (args.length < 5) {
                     System.out.println("Usage: java reservationclient reserve <server_name> <seat> <passenger> <class>");
                        return;
                    }
                    int seatnum = Integer.parseInt(args[2]);
                    String passengername = args[3];
                    String seatclass = args[4];
                    String result = reservationService.reserveSeat(seatnum, passengername, seatclass);
                    System.out.println(result);
                    break;
                case "passengerlist":
                    System.out.println(server.passengerList());
                    break;
                default:
                     System.out.println("Unkown command");
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
