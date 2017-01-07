import java.io.*;
import java.util.*;
class Main {
    public static PrintWriter out;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int noReq = sc.nextInt();
        int noNames = sc.nextInt();
        int ct = 1;
        while (noReq != 0 || noNames != 0) {
        	for (int i = 0; i < noReq; i++) {
        		sc.nextLine();
        	}
        	String maxName = "";
        	double cost = -1;
        	int satisfied = 0;
        	for (int i = 0; i < noNames; i++) {
        		String name = sc.nextLine();
        		double localCost = sc.nextDouble();
        		int localSatisfied = sc.nextInt();
        		for (int j = 0; j < localSatisfied; j++) {
        			sc.nextLine();
        		}
        		if (localSatisfied > satisfied || localSatisfied == satisfied && localCost < cost) {
        			maxName = name;
        			cost = localCost;
        			satisfied = localSatisfied;
        		}
        	}
        	if (ct != 1) out.printf("\nRFP #%d\n%s\n", ct, maxName);
        	else out.printf("RFP #%d\n%s\n", ct, maxName);
        	noReq = sc.nextInt();
        	noNames = sc.nextInt();
        	ct++;
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
