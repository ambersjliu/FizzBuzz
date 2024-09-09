public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 1000; i++){
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy3 || divBy5){
                count++;
            }
        }
        System.out.println(count);
    }
}
