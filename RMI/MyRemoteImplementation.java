package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImplementation extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteImplementation() throws RemoteException {}

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }
}
