import java.rmi.*;

public interface ReservationInterface extends Remote {
    String listAvailability() throws RemoteException;
    String reserveSeat(String seatClass, String passenger, int seatNumber) throws RemoteException;
    String passengerList() throws RemoteException;
}