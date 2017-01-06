import java.io.*;
import java.util.*;
class Main {
    public static PrintWriter out;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int height = sc.nextInt();
        double climbDay = sc.nextInt();
        int slideDown = sc.nextInt();
        double factor = (sc.nextInt() / 100.0) * climbDay;
        while (height != 0) {
            double curr = climbDay;
            int iter = 1;
            while (curr <= height) {
                // out.printf("%d %f %d %f %f\n", height, climbDay, slideDown, factor, curr);
                curr -= slideDown;
                if (curr < 0) {
                    out.printf("failure on day %d\n", iter);
                    break;
                }
                climbDay = (climbDay - factor > 0 ? climbDay - factor : 0);
                curr += climbDay;
                iter++;
            }
            if (curr > height) out.printf("success on day %d\n", iter);
            height = sc.nextInt();
            climbDay = sc.nextInt();
            slideDown = sc.nextInt();
            factor = (sc.nextInt() / 100.0) * climbDay;
        }
        out.close();
    }

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public boolean hasNext() {
            try {
                boolean a = br.ready();
                return a;
            } catch (IOException e) {
                return false;
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
