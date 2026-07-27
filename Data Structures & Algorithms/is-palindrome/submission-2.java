class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters from s
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        int start = 0;
        int end = s.length()-1;

        while (start != end && start < s.length()-1 && end > 0) {
            if (!(Character.toLowerCase(s.charAt(start)) 
                    == Character.toLowerCase(s.charAt(end)))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
