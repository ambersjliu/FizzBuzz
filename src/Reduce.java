public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while(num != 0){
            boolean numIsOdd = num % 2 == 1;
            if(numIsOdd){
                num--;
            }
            else{
                num /= 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
