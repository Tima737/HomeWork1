package ru.netology.sqr;

public class SQRService {
    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <=99; i++){
            int isquare = i * i;
            if (isquare >= min){
                if (isquare <= max){
                    counter++;


                }
            }
        }
        return counter;

    }
}
