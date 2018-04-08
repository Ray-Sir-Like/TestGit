import java.net.Socket;


public class Test {
public static void main(String[] args) {
	try {
		Socket socket=new Socket("192.168.0.208",15999);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
