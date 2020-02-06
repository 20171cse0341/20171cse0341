import java.net.*;
import java.io.*;

public class Datagramserver {
public static DatagramSocket ds;
public static int clientport=1789,serverport=1790;

public static void main(String[] args) throws Exception {
byte buffer[]=new byte[1024];
ds=new DatagramSocket(serverport);
BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("server is waiting for input");
while(true)
{
String str=breader.readLine();
if(str==null|| str.equals("End"))
break;
buffer=str.getBytes();
ds.send(new DatagramPacket(buffer,str.length(),InetAddress.getLocalHost(),clientport));
}

}

}