class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] charArray = new char[26];
        for(char ch: text.toCharArray()){
            int idx = ch - 'a';
            charArray[idx]++;
        }
        int countB = 0, countA = 0, countL = 0, countO = 0, countN = 0;
        countB = charArray[1];
        countA = charArray[0];
        countL = charArray['l' - 'a'] / 2;
        countO = charArray['o' - 'a'] / 2;
        countN = charArray['n' - 'a'];

        int min = countB;
        min = Math.min(min, countA);
        min = Math.min(min, countL);
        min = Math.min(min, countO);
        min = Math.min(min, countN);
        return min;
    }
}