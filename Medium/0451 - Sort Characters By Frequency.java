class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        int[] mp = new int[123];

        for(char c : s.toCharArray()) mp[c]++;

        Character[] t = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            t[i] = s.charAt(i);  
        }

        Arrays.sort(t, (a, b) -> {
            if(mp[a] != mp[b]) return mp[b] - mp[a];
            return a - b;
        });

        StringBuilder sb = new StringBuilder();

        for(char ch : t){
            sb.append(ch);
        }

        return sb.toString();
    }
}