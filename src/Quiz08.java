import java.util.Scanner;
import java.util.Random;
public class Quiz08 {
    public void tax(){
        Scanner in = new Scanner(System.in);
        int tax = 0;
        int tax_sum = 0;
        int [] ratio = {6, 15, 24, 35, 38, 40, 42, 45};
        int [] income_tax = {720000, 5100000, 10080000, 21700000, 57000000, 80000000, 210000000};
        int [] income_step = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000};
        int [] proDeduct = {1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
        int deduct_tax = 0;
        System.out.println("[과세금액 계산 프로그램");
        System.out.print("연소득을 입력해주세요 : ");
        int income = in.nextInt();
        if(income<=12000000) {
            tax = income*6/100;
            System.out.printf("% 11d * % 3d%% = % 11d\n",income, ratio[0], tax);
            tax_sum += tax;
            deduct_tax = income/100 * ratio[0];
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>12000000 && income<=46000000){
            deduct_tax = income/100*ratio[1] - proDeduct[0];
            for (int i = 0; i < 1; i++) {

                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==0){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>46000000 && income<=88000000) {
            deduct_tax = income/100*ratio[2] - proDeduct[1];
            for (int i = 0; i < 2; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==1){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>88000000 && income<=150000000) {
            deduct_tax = income/100*ratio[3] - proDeduct[2];
            for (int i = 0; i < 3; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==2){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>150000000 && income<=300000000) {
            deduct_tax = income/100*ratio[4] - proDeduct[3];
            for (int i = 0; i < 4; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==3){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>300000000 && income<=500000000) {
            deduct_tax = income/100*ratio[5] - proDeduct[4];
            for (int i = 0; i < 5; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==4){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>500000000 && income<=1000000000) {
            deduct_tax = income/100*ratio[6] - proDeduct[5];
            for (int i = 0; i < 6; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==5){
                    tax = income * ratio[i+1] / 100;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
        else if(income>1000000000) {
            deduct_tax = income/100*ratio[7] - proDeduct[6];
            for (int i = 0; i < 7; i++) {
                income -= income_step[i];
                System.out.printf("% 11d *% 3d%% = % 11d\n", income_step[i], ratio[i], income_tax[i]);
                tax_sum += income_tax[i];
                if(i==6){
                    tax = income / 100 * ratio[i+1] ;
                    System.out.printf("% 11d *% 3d%% = % 11d\n", income, ratio[i+1], tax);
                    tax_sum += tax;
                }
            }
            System.out.println("\n[세율에 의한 세금] :\t\t\t"+ tax_sum);
            System.out.println("[누진공제 계산에 의한 세금] :\t\t"+ deduct_tax);
        }
    }

}
