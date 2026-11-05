class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for(int a1: arr1){
            for(int a2: arr2){
                int dist = Math.abs(a1 - a2);
                if(dist <= d){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}