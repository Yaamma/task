import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import sun.java2d.pipe.SpanShapeRenderer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public SimpleServer(int port) throws Exception{
        ServerSocket serverSocket = new ServerSocket(port);
        while (true){
            Socket accept = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            String s = bufferedReader.readLine();
            System.out.println(s);
            bufferedWriter.write(s);
            bufferedWriter.flush();
        }
    }

    public static void main(String[] args) throws Exception{
        new SimpleServer(8080);
    }
}
