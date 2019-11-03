import java.io.*;
import java.util.*;

public class ecoo19r2p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        for (int k = 0; k<10; k++) {
            int Q = Integer.parseInt(br.readLine());
            HashSet<String> emails = new HashSet<>();

            for (int q = 0; q<Q; q++) {
                String s = br.readLine().toLowerCase();
                int plus = 0, at = 0;

                for (int i = 0; i<s.length(); i++) {
                    if (s.charAt(i) == '+') {
                        plus = i;
                        break;
                    }
                }

                for (int i = s.length()-1; i>=0; i--) {
                    if (s.charAt(i)=='@') {
                        at = i;
                        break;
                    }
                }

                String ss = s.substring(0, at);

                if (plus>0) {
                    ss = s.substring(0, plus);
                }

                String se = s.substring(at);
                ss = ss.replace(".","");

                emails.add(ss+se);

            }

            System.out.println(emails.size());

        }

    }
}
