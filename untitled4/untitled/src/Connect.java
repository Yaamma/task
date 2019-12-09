import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Connect {
    public Connect() throws Exception{
        Socket socket = new Socket("localhost",8080);
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true){
            bufferedWriter.write(scanner.nextLine());
            bufferedWriter.flush();
        }
    }

    public static void main(String[] args) throws Exception{
        new Connect();
    }
}
