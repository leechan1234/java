package Chaptor_04;

import src.Number;

public class _for_01 {
    public static void main(String[] args) {
        int[] score = {90,23,67,50,12,100};
        for (int i=0; i<score.length; i++){
            if (score[i]>= 60){
                System.out.println((i+1)+"번 학생은 힙격입니다");
            }else {
                System.out.println((i+1 +"번 학생은 불합격입니다"));
            }
        }

        }
    }

