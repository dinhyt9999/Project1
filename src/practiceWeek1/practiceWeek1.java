package practiceWeek1;

import static java.lang.Math.sqrt;

public class practiceWeek1 {

    public static void main(String[] args){
        System.out.println("cac hop so nho hon 100:");
        findNum1();
        System.out.println("\n20 so nguyen to dau tien:");
        findNum2();
        System.out.println("\ncac so nguyen to tu 1000 den 2000:");
        findNum3();
        System.out.println("\ncac so chia het cho 3 va 7 nho hon 100:");
        findNum4();
        System.out.println("\n5 so hoan hao dau tien:");
        findNum5();
        System.out.println("\ncac so chia het cho 3 5 7 tu 1000 den 2000:");
        findNum6();
    }

    public static boolean checkNum1(int a){
        int i,n;
        n = (int)sqrt(a);
        if (a < 4)
            {
                return false;
            }
        else
        {
            for( i = 2; i <= n; i++) {
                if (a % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void findNum1(){
        int i, k = 0;
        for( i = 1; i <= 100; i++){
            if(checkNum1(i)){
                System.out.print(i + " ");
                k++;
                if(k == 20){
                    System.out.println();
                    k = 1;
                }
            }
        }
    }

    public static void findNum2(){
        int i = 0, k = 2;
        while (i<20){
            if (checkNum1(k)){
                k++;
            }
            else{
                System.out.print(k + " ");
                k++;
                i++;
            }
        }
    }

    public static void findNum3(){
        int i,k = 1;
        for(i = 1000; i <= 2000; i++){
            if (!checkNum1(i)){
                System.out.print(i + " ");
                k++;
                if(k == 20){
                    System.out.println();
                    k = 1;
                }
            }
        }
    }

    public static boolean checkNum2(int a){
        if ((a % 3 == 0) && (a % 7 == 0)){
            return true;
        }
        else return false;
    }

    public static void findNum4(){
        int i;
        for(i = 1; i <= 100; i++){
            if(checkNum2(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkNum3(int a){
        int i, s = 0;
        for(i = 1; i < a; i++){
            if(a % i == 0){
                s+=i;
            }
        }
        if(s == a){
            return true;
        }
        else {
            return false;
        }
    }

    public static void findNum5(){
        int i = 0, k = 2;
        while(i <= 5){
            if(checkNum3(k)){
                System.out.print(k + " ");
                i++;
                k++;
            }
            else {
                k++;
            }
        }
    }

    public static void findNum6(){
        int i,k = 0;
        for(i = 1000; i <= 2000; i++){
            if(checkNum2(i) && (i % 5 == 0)){
                System.out.print(i + " ");
                k++;
                if(k == 20){
                    System.out.println();
                }
            }
        }
    }
}
