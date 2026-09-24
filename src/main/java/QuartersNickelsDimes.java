public class QuartersNickelsDimes {
    public static void main(String[] args) {
        int target = 50;
        System.out.println("Combinations that make 50 cents:");

        int q = 0;
        while (q <= target / 25) {
            int d = 0;
            while (d <= target / 10) {
                int n = 0;
                while (n <= target / 5) {
                    if (q * 25 + d * 10 + n * 5 == target) {
                        System.out.printf("%d quarters + %d dimes + %d nickels == 50 cents%n", q, d, n);
                    }
                    n++;
                }
                d++;
            }
            q++;
        }
    }
}
