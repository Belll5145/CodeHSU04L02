public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int start = 1; start <= 6; start++){
            System.out.println(start);
        }

        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?
        for(int power = 1; power < 100; power *= 2){
            System.out.print(power + " ");
        }
        System.out.println();
        //write a for loop that counts by 4s from 5 up to 50
        for(int fours = 5; fours <= 50; fours += 4){
            System.out.print(fours +" ");
        }
        System.out.println();
        //write a for loop that sums the numbers from 1 to 10
        int total = 0;
        for(int i = 1; i <= 10; i++){
            total += i;
        }
        System.out.println("The sum of the integers 1 through 10 is: "+ total);
        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        System.out.println("Finished!");

    }
}
