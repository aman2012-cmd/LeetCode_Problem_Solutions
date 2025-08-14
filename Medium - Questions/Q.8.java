
class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        int n = s.length();
        long num = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++; // fix: move to the next character after sign
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * num);
    }
}
