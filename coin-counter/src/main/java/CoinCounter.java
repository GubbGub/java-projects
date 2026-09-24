public class CoinCounter {
    private int quarters;
    private int nickels;
    private int dimes;

    public CoinCounter(int quarters, int nickels, int dimes) {
        this.quarters = quarters;
        this.nickels = nickels;
        this.dimes = dimes;
    }

    public double calculateTotal() {
        double total = (quarters * 0.25) + (nickels * 0.05) + (dimes * 0.10);
        return total;
    }

    public static void main(String[] args) {
        CoinCounter counter = new CoinCounter(4, 10, 5);
        System.out.println("Total amount: $" + counter.calculateTotal());
    }
}