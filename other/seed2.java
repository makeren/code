import java.io.*;
public class seed2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int low = 1, high = 2000000000, mid = low+(high-low)/2;

        System.out.println(mid); System.out.flush();
        String result = br.readLine();

        while (!result.equals("OK")) {
            if (result.equals("SINKS")) low = mid;
            else high = mid;

            mid = low+(high-low)/2;

            System.out.println(mid);
            System.out.flush();

            result = br.readLine();
        }

    }

}
