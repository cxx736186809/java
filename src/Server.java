import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
用socket实现客户端和服务器端相互通信，直到某一端发送over结束通信
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket ss = new ServerSocket(8888);
        Socket server = ss.accept();
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                InputStream is = server.getInputStream();
                OutputStream out = server.getOutputStream();
                byte[] b = new byte[1024];
                int len = is.read(b);
                String msg = new String(b, 0, len);
                if ("over".equals(msg)) {
                    out.close();
                    is.close();
                    server.close();
                    break;
                }
                System.out.println(msg);
                String s = sc.nextLine();
                out.write(s.getBytes());
            }
        } catch (Exception e) {
            System.out.println("通信结束");
        }
    }
}
class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream os = client.getOutputStream();
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                String s = sc.nextLine();
                os.write(s.getBytes());
                InputStream in = client.getInputStream();
                byte[] b = new byte[100];
                int len = in.read(b);
                String msg = new String(b, 0, len);
                if ("over".equals(msg)) {
                    in.close();
                    os.close();
                    client.close();
                    break;
                }
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println("通信结束");;
        }
    }
}