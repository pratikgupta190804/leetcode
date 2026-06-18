class Solution {
    public double angleClock(int hour, int minutes) {
        double minDegree = minutes * 6;
        double hourDegree = hour * 30 + minutes * 0.5;
        double degree = Math.abs(hourDegree - minDegree);
        degree = degree > 180 ? 360 - degree : degree;
        return degree;
    }
}