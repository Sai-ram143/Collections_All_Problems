package NewProb;

import java.io.*;
import java.util.*;

public class Febinocci3 {

    static final long MOD = 1000000007;


    static long[] fib(long n) {
        if (n == 0) return new long[]{0, 1};

        long[] p = fib(n >> 1);
        long a = p[0], b = p[1];

        long c = (a * ((2 * b % MOD - a + MOD) % MOD)) % MOD;
        long d = (a * a % MOD + b * b % MOD) % MOD;

        if (n % 2 == 0) return new long[]{c, d};
        else return new long[]{d, (c + d) % MOD};
    }

   
    static long[] seg;
    static int N;

    static long build(long[] arr, int idx, int l, int r) {
        if (l == r) return seg[idx] = arr[l];
        int mid = (l + r) / 2;
        long left = build(arr, idx * 2, l, mid);
        long right = build(arr, idx * 2 + 1, mid + 1, r);
        return seg[idx] = gcd(left, right);
    }

    static long query(int idx, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) return 0;
        if (ql <= l && r <= qr) return seg[idx];
        int mid = (l + r) / 2;
        return gcd(query(idx * 2, l, mid, ql, qr),
                   query(idx * 2 + 1, mid + 1, r, ql, qr));
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

   
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        N = fs.nextInt();
        int Q = fs.nextInt();

        long[] arr = new long[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = fs.nextLong();

        seg = new long[4 * N];
        build(arr, 1, 1, N);

        StringBuilder sb = new StringBuilder();

        while (Q-- > 0) {
            int L = fs.nextInt();
            int R = fs.nextInt();

            long g = query(1, 1, N, L, R);

            long result = fib(g)[0] % MOD;
            sb.append(result).append("\n");
        }

        System.out.print(sb.toString());
    }

   
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) { in = is; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') ;
            long sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            long val = c - '0';
            while ((c = read()) > ' ') val = val * 10 + (c - '0');
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong(); 	
        }
    }
}

