import java.io.*;
import java.util.*;
class Main {
    public static PrintWriter out;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int cases = sc.nextInt();
        while (cases != 0) {
            String ans = "+x";
            String[] z = sc.nextLine().split(" ");
            for (int i = 0; i < cases - 1; i++) {
                String change = z[i];
                if (change.equals("+z")) {
                    if (ans.equals("+x")) {
                        ans = change;
                    }
                    else if (ans.equals("-x")) {
                        ans = "-z";
                    }
                    else if (ans.equals("+z")) {
                        ans = "-x";
                    }
                    else if (ans.equals("-z")) {
                        ans = "+x";
                    }
                }
                else if (change.equals("-z")) {
                    if (ans.equals("+x")) {
                        ans = change;
                    }
                    else if (ans.equals("-x")) {
                        ans = "+z";
                    }
                    else if (ans.equals("+z")) {
                        ans = "+x";
                    }
                    else if (ans.equals("-z")) {
                        ans = "-x";
                    }
                }
                else if (change.equals("+y")) {
                    if (ans.equals("+x")) {
                        ans = change;
                    }
                    else if (ans.equals("-x")) {
                        ans = "-y";
                    }
                    else if (ans.equals("+y")) {
                        ans = "-x";
                    }
                    else if (ans.equals("-y")) {
                        ans = "+x";
                    }
                }
                else if (change.equals("-y")) {
                    if (ans.equals("+x")) {
                        ans = change;
                    }
                    else if (ans.equals("-x")) {
                        ans = "+y";
                    }
                    else if (ans.equals("+y")) {
                        ans = "+x";
                    }
                    else if (ans.equals("-y")) {
                        ans = "-x";
                    }
                }
            }
            out.println(ans);
            cases = sc.nextInt();
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
