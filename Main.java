//A program that count the number of even and odd elements in a given array of integers
public class Main {
    public static void main(String[] args) {
        int[] A1= {5,7,2,4,9};
        int count_even = 0;
        int count_odd = 0;
        for(int i =0; i<A1.length ; i++){
            if(A1[i] %2 ==0){
                count_even++;
            }else{
                count_odd++;
            }
        }
        System.out.println("Even: "+count_even);
        System.out.println("Odd: "+count_odd);

    }
}