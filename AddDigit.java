public class AddDigit {
    // Method to sum digits until a single digit remains
    public static int addDigits(int num) {
        while (num >= 10) { 
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Extract last digit and add to sum
                num /= 10;         // Remove last digit
            }
            num = sum; // Assign sum back to num
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38; // Example input
        System.out.println("Sum of digits until single digit: " + addDigits(num));
    }
}
