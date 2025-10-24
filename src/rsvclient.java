import java.rmi.*;

public class rsvclient {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage cases: \njava rsvclient list <server_name>\n , \njava reserve <server_name> <class> <passenger_name> <seat_number>\n, \njava passengerlist <servername>\n");
            return;
        }

        try {
            switch(args[0].toLowerCase()){
                case "list":
                 String availableSeats = ReservationInterface.listAvailability();
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
                    String result = rsvserver.reserveseat(seatnum, passengername, seatclass);
                    System.out.println(result);
                    break;
                case "passengerlist":
                    System.out.println(rsvserver.passengerList());
                    break;
                default:
                     System.out.println("Unkown command");
                     }
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
