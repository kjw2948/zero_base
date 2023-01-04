import java.util.Scanner;
import java.util.Random;
public class Quiz07 {
    public int checkLotto(int lotto[], int my_lotto[]) {
        int num_lotto = lotto.length;
        int num_my = my_lotto.length;
        int check_num = 0;
        for (int i = 0; i < num_lotto; i++) {
            for (int j = 0; j < num_my; j++) {
                if (lotto[i] == my_lotto[j]) check_num++;
            }
        }
        return check_num;
    }

    public int[] deleteDup(int my_lotto[]) {
        Random rnd = new Random();
        Quiz07 r1 = new Quiz07();
        int check = 0;
        int num_my = my_lotto.length;
        for (int i = 0; i < num_my; i++) {
            for (int j = 0; j < num_my; j++) {
                if (my_lotto[i] == my_lotto[j]) {
                    if (i == j) continue;
                    else {
                        my_lotto[j] = rnd.nextInt(45);
                        check++;
                    }
                }
            }
        }
        if (check == 0) return my_lotto;
        else {
            r1.deleteDup(my_lotto);
            return my_lotto;
        }

    }


    public void lotto(){
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        Quiz07 s1 = new Quiz07();
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J'};
        int[] my_lotto_array = {0,0,0,0,0,0};
        int[] lotto_array = {0,0,0,0,0,0};
        int[][] every_lotto = null;
        int[] check_num_array = null;
        for (int i = 0; i < lotto_array.length; i++) {
            lotto_array[i] = rnd.nextInt(45);
        }

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("복권의 갯수를 입력해주세요 : ");
        // 내 복권 번호 생성
        int num_lotto = in.nextInt();
        every_lotto = new int[num_lotto][6];
        check_num_array = new int[num_lotto];
        for (int i = 0; i < num_lotto; i++) { // i는 로또 갯수
            System.out.printf("%c\t", alphabet[i]);
            for (int j = 0; j < my_lotto_array.length; j++) { //j는 로또 번호 갯수 = 6
                my_lotto_array[j] = rnd.nextInt(45);
                if (j == my_lotto_array.length - 1) System.out.printf("%02d \n", my_lotto_array[j]);
                else System.out.printf("%02d, ", my_lotto_array[j]);
                every_lotto[i][j] = my_lotto_array[j];
            }
            check_num_array[i] = s1.checkLotto(lotto_array, my_lotto_array); // 내 로또의 정답 갯수 저장
        }

        // 로또 결과 발표
        System.out.println("\n[로또 발표]");
        System.out.printf(" \t");
        for (int i = 0; i < lotto_array.length; i++) {
            if(i==my_lotto_array.length-1) System.out.printf("%02d \n", lotto_array[i]);
            else System.out.printf("%02d, ", lotto_array[i]);
        }
        System.out.println("\n[내 로또 결과]");
        for (int i = 0; i < num_lotto; i++) {
            System.out.printf("%c\t", alphabet[i]);
            for (int j = 0; j < my_lotto_array.length; j++) {
                if (j == my_lotto_array.length - 1) System.out.printf("%02d", every_lotto[i][j]);
                else System.out.printf("%02d, ", every_lotto[i][j]);
            }
            System.out.printf(" => %d개 일치\n", check_num_array[i]);
        }

    }

}

