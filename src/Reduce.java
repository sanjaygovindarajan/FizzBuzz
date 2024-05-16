public class Reduce {
    public static void main(String[] args) {
        int n = 536;
        int steps = 0;
        while (n > 0){
            switch(n % 2){
                case 0:
                    n /= 2;

                case 1:
                    n += -1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
