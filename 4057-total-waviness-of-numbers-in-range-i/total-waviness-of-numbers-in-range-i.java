class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        if (num2 <= 100) return count;
        for (int num = num1; num <= num2; num++) {
            if (num <= 100) continue;
            StringBuilder sb = new StringBuilder(String.valueOf(num));
            int n1, n2, n3, n4, n5;
            if (num > 100 && num < 1000) {
                n1 = sb.charAt(0) - '0';
                n2 = sb.charAt(1) - '0';
                n3 = sb.charAt(2) - '0';
                if ((n2 < n1 && n2 < n3) || (n2 > n1 && n2 > n3))
                    count++;
            } else if (num >= 1000 && num < 10000) {
                n1 = sb.charAt(0) - '0';
                n2 = sb.charAt(1) - '0';
                n3 = sb.charAt(2) - '0';
                n4 = sb.charAt(3) - '0';
                if ((n2 < n1 && n2 < n3) || (n2 > n1 && n2 > n3))
                    count++;
                if ((n3 < n2 && n3 < n4) || (n3 > n2 && n3 > n4))
                    count++;
            } else if (num >= 10000 && num < 100000) {
                n1 = sb.charAt(0) - '0';
                n2 = sb.charAt(1) - '0';
                n3 = sb.charAt(2) - '0';
                n4 = sb.charAt(3) - '0';
                n5 = sb.charAt(4) - '0';
                if ((n2 < n1 && n2 < n3) || (n2 > n1 && n2 > n3))
                    count++;
                if ((n3 < n2 && n3 < n4) || (n3 > n2 && n3 > n4))
                    count++;
                if ((n4 < n3 && n4 < n5) || (n4 > n3 && n4 > n5))
                    count++;
            }
        }
        return count;
    }
}