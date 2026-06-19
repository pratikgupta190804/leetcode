class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxAltitude = 0;
        for (int g : gain) {
            sum += g;
            maxAltitude = Math.max(maxAltitude, sum);
        }
        return maxAltitude;
    }
}