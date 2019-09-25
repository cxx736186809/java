import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
使用UDP协议实现一个程序(发送端)发送信息给另一个程序(接收端)，接收端将接收到的内容打印输出即可。
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        String str = "Hello World";

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"),8001);
        ds.send(dp);
        ds.close();
    }
}
class ServerTest {
    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub

        byte[] buf = new byte[1024];

        DatagramSocket ds = new DatagramSocket(8001);//定义一个datagramsocket对象，监听的端口8001

        DatagramPacket dp = new DatagramPacket(buf, 1024);//用于接收数据

        System.out.println("等待接受数据");
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();

        System.out.println(str);
        ds.close();
    }
}

