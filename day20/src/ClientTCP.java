import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
创建TCP 客户端，访问上一题创建的服务器端,服务器端ip：127.0.0.1 端口号：8888
1: 客户端连接服务器,并发送 hello.服务器,我是客户端。
2: 开启上一题服务器,等待客户端连接,客户端连接并发送数据。
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream os = client.getOutputStream();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        os.write(s.getBytes());
        os.close();
        client.close();
    }
}
