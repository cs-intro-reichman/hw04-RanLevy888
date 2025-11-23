public class Primes {
    public static void main(String[] args) {
       boolean check = false;
       int count = 0;
int n = Integer.parseInt(args[0]);
System.err.println("Prime numbers up to " + n +":");
for(int i=2 ; i<=n ; i++){
    
    for(int j=2 ; j<=n/2+1 ; j++){
        if(i%j==0){
            System.out.println(i);
            count++;
            break;
        }

    }
}
double precemt = n/count;
System.out.println("There are " + count + " primes between 2 and " + n +
            " (" + precemt + "% are primes)");

    }
}