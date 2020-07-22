package com.company;

public class Main {

        public static boolean canPack2 (int bigCount, int smallCount, int goal){

            if ( (bigCount < 0) || (smallCount < 0) || (goal < 0)){
                return false;
            }

            else {

                int difference = ( (bigCount * 5) + smallCount) - goal;

                if (difference == 0){
                    return true;
                }

                if (difference < 0){
                    return false;
                }

                while (difference >= 5){
                    if (bigCount > 0){
                        bigCount--;
                        difference -= 5;
                    }
                    else if(smallCount >= 5){
                        smallCount -= 5;
                        difference -= 5;
                    }
                }

                while (difference > 0){
                    if (smallCount == 0){
                        break;
                    }
                    if (smallCount > 0){
                        smallCount--;
                        difference--;
                    }
                }

                if (difference == 0){
                    return true;
                }

                else {
                    return false;
                }

            }

        }
        public static int liczbaPierwsza(int number){
            int n = 1;
            while (n <= number){
                n++;
                int sprawdzacz = number % n;
                if(sprawdzacz == 0 && n != number)
                    break;
                else if(n == number){
                    return n;
                }
                else {
                    continue;
                }
            }
            return n;
        }

        public static int getLargestPrime (int number){
            int x = 1;
            int y = 1;
            int m = 1;
            int n = 1;
            //pętla sprawdzająca czy jest liczbą pierwszą
            while (n <= number){
                n++;
                int sprawdzacz = number % n;
                if(sprawdzacz == 0 && n != number)
                    break;
                else if(n == number){
                    return number;
                }
                else {
                    continue;
                }
            }

            if (number < 0){
                return -1;
            }
            else if (number == 0){
                return -1;
            }
            else {
                for (int i = 1 ; i <= number; i++){
                    for (int j = 1; j <= number; j++){
                        int mnozenie = i*j;
                        if(mnozenie == number){
                            //System.out.println(mnozenie);
                            if(y > j && y != number){
                                continue;
                            }
                            x = i;
                            y = j;


                        }
                    }


                }

                x = y;
                int z = getLargestPrime(y);
                if (z == -1){
                    return y;
                }
                else if (z == y ){
                    return y;
                }
                else {
                   return getLargestPrime(y);
                }



            }




        }



    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(13));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime( 0));
        System.out.println(liczbaPierwsza(45));



    }
}
