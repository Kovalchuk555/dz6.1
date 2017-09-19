package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       {

       }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму ");
        int payment = in.nextInt();
        System.out.println("Сумма равна ="+payment);

      Credit(payment);


    }

    private static void Credit(int payment) {





        int wholeprice= 700;

        {
            if (payment == 700) {
                System.out.println("Кредит погашен");

            }


            }
            if (payment < 700) {
                int dolg = wholeprice - payment;
                System.out.println("Ваш долг составляет:  " + dolg);

                Scanner in = new Scanner(System.in);
                System.out.println("Введите сумму ");
                int p = in.nextInt();
                System.out.println("Введенная сумма =  "+p);
                payment=payment+p;
                System.out.println("На вашем счету =  "+payment);
                if(payment==700){
                    System.out.println("Кредит погашен");
                }



            } if (payment>700){
                int count = payment - wholeprice;
                System.out.println("Кредит погашен ,на счету остаток= " + count);

        }}}

