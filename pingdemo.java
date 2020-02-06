import java.io.*;
import java.net.*;
class pingdemo
{
public static void main(Stringargs[])
{
BufferdReader in;
try
{
Runtime r=Runtime.getRuntime();
Process p=r.exec("ping 127.0.0.1");
if(p==null)
System.out.println("could not connect");
in=new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while(line=in.readLine())!=null)
{
if(line.startsWith("reply"))
System.out.println("this is not reply");
else if(line.startsWith("request"))
System.out.println("there is no reply");
if(line.startsWith("destinator"))
System.out.println("destinator host unreached");
else
System.out.println(line);
}
System.out.printlm(in.readLine());
in.close();
}
catch(IOExeception e)
{
System.out.println(e.toString());
}
}
}