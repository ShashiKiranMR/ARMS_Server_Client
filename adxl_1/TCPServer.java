import java.io.*;
import java.net.*;
class TCPServer
{
	public static void main(String argv[])throws Exception
   	{
		String clientSentance;
      String capitalizedSentance;
		ServerSocket welcomeSocket = new ServerSocket(80);
      while(true)
      {
         Socket connectionSocket = welcomeSocket.accept();
         BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
         //DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
         clientSentance = inFromClient.readLine();
         System.out.println("Received: "+clientSentance);
         //capitalizedSentance = clientSentance.toUpperCase() + '\n';
         //outToClient.writeBytes(capitalizedSentance);
         System.out.println(welcomeSocket.getLocalSocketAddress());
      }
     }
}