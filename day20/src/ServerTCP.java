import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
在项目下创建TCP 服务器端 端口号为8888
1：等待客户端连接 如果有客户端连接 获取到客户端对象。
2：获取到客户端对象之后读取数据客户端传送数据并输出到控制台。
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket ss = new ServerSocket(8888);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        String msg = new String(b, 0, len);
        System.out.println(msg);
        is.close();
        server.close();
    }
}
