package java8praice;

import java.io.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine().trim());
        int K = Integer.parseInt(br.readLine().trim());
        
        int out = solve(N, K);
        System.out.println(out)
;
        
        wr.close();
        br.close();
    }

    static int solve(int N, int K) {
        int totalBurntCandles = 0;
        int burntWax = 0;

        while (N > 0) {
            // Burn all available unburnt candles
            totalBurntCandles += N;
            burntWax += N;
            
            // Calculate how many new candles can be created from the burnt wax
            N = burntWax / K;
            
            // Update the remaining burnt wax after creating new candles
            burntWax = burntWax % K;
        }
        
        return totalBurntCandles;
    }
}
