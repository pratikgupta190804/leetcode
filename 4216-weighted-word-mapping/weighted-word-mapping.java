class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            map.put(ch, weights[i]);
        }
        for(String word: words){
            int sum = 0;
            for(char ch: word.toCharArray()){
                sum += map.get(ch);
            }
            sum %= 26;
            char c = (char)('z' - sum);
            result.append(c);
        }
        return result.toString();
    }
}