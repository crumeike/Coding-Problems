public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }
        
        // Check if there is only one set bit by using bitwise operations
        return (n & (n - 1)) == 0;
    }
