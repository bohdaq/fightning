import java.net.*;
import java.io.*;

public class GreetingClient
{
    public static void main(String [] args)
    {
        String serverName = "192.168.0.81";
        int port = 9944;
        try
        {
            System.out.println("Connecting to " + serverName
                    + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to "
                    + client.getRemoteSocketAddress());


            //To server
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out =
                    new DataOutputStream(outToServer);
            out.writeUTF("Hello from "
                    + client.getLocalSocketAddress());


            //From server
            InputStream inFromServer = client.getInputStream();
            DataInputStream in =
                    new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
//            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}