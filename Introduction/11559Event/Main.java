import java.io.*;
import java.util.*;
class Main {
    public static PrintWriter out;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        while (sc.hasNext()) {
        	int noPeople = sc.nextInt();
        	long budget = sc.nextInt();
        	int hotels = sc.nextInt();
        	int weeks = sc.nextInt();
        	int minimum = Integer.MAX_VALUE;
        	for (int i = 0; i < hotels; i++) {
        		int cost = sc.nextInt();
        		for (int j = 0; j < weeks; j++) {
        			int available = sc.nextInt();
        			if (available >= noPeople && noPeople * cost <= budget) {
        				minimum = Math.min(noPeople * cost, minimum);
        			}
        		}
        	}
        	if (minimum != Integer.MAX_VALUE) out.println(minimum);
        	else out.println("stay home");
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
