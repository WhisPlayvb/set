import java.net.*;
class InetAddressTest
{

	public static void main(String args[]) throws UnknownHostException
	{

		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);

		address = InetAddress.getByName("WWW.Google.com");
		System.out.println(address);
		
		InetAddress sw[] = InetAddress.getAllByName("WWW.Yahoo.com");

		for(int i=0; i<sw.length; i++)
		{

			System.out.println(sw[i]);	

		}//end of i for loop		

	}//end of main method

}//end of InetAddressTest class