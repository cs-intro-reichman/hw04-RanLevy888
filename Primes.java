public class Primes {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    boolean[] prime = new boolean[n + 1];

    int i = 2;
    while (i <= n) {
        prime[i] = true;
        i++;
    }

    i = 2;
    while (i * i <= n) {
        if (prime[i]) {
            int k = i * i;
            while (k <= n) {
                prime[k] = false;
                k += i;
            }
        }
        i++;
    }

    System.out.println("Prime numbers up to " + n + ":");

    int count = 0;
    i = 2;

    while (i <= n) {
        if (prime[i]) {
            System.out.println(i);
            count++;
        }
        i++;
    }

    double percent = (100.0 * count) / n;

    System.out.println("There are " + count + " primes between 2 and " + n +
                       " (" + percent + "% are primes)");
}
}