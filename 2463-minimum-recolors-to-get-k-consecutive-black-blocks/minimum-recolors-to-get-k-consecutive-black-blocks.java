class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int white = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < blocks.length(); right++) {

            
            if (blocks.charAt(right) == 'W') {
                white++;
            }

            
            if (right - left + 1 == k) {

                ans = Math.min(ans, white);

                
                if (blocks.charAt(left) == 'W') {
                    white--;
                }

                left++;
            }
        }

        return ans;
    }
}
