import java.util.Scanner;

public class Main {



    public static void main(String[] args){



        for(int a = 1; a<100;a++){

            if(a<4){

                if(a == 2 || a == 3 || a == 5 || a == 7){
                    System.out.print(a+" ");
                }

            }
            else {
                if(a%2 != 0 && a%3 !=0 && a%7 !=0 && a%5 !=0){
                    System.out.print(a+" ");
                }
            }

        }
    }
}
