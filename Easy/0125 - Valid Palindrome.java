class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            char head = s.charAt(left);
            char tail = s.charAt(right);
            
            if(!Character.isLetterOrDigit(head))
            {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(tail))
            {
                right--;
                continue;
            }

            if(Character.toLowerCase(head)!=Character.toLowerCase(tail))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}