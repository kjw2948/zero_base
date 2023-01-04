import java.util.Scanner;
import java.util.Random;
public class Quiz06 {
    public int[] findMax(double a[]){
        int num_array = a.length;
        int check_num = 0;
        double max=a[0];
        int max_index = 0;
        for (int i = 1; i < num_array; i++) {
            if(max<a[i]) {
                max=a[i];
                max_index = i;
            }
        }
        for (int i = 0; i < num_array; i++) {
            if(max==a[i]) check_num ++;
        }
        int[] array = {max_index, check_num};
        return array;
    }

    public void president() {
        Random rnd = new Random();
        Quiz06 s1 = new Quiz06();
        double[] vote_array = {0,0,0,0};
        String[] name_array = {"이재명", "윤석열","심상정","안철수"};
        int random;
        for (int i = 1; i <= 10000; i++) {
            random = rnd.nextInt(4);
            // 투표수 계산
            double ratio = i / 100;
            if (random == 0) {
                vote_array[0]++;
                if (i == 1 || i == 2 || i == 10000) {
                    System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => 이재명 \n", ratio, i);
                }
            }
            else if (random == 1) {
                vote_array[1]++;
                if (i == 1 || i == 2 || i == 10000) {
                        System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => 윤석열 \n", ratio, i);
                }
            }
            else if (random == 2) {
                vote_array[2]++;
                if (i == 1 || i == 2 || i == 10000) {
                    System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => 심상정 \n", ratio, i);
                }
            }
            else {
                vote_array[3]++;
                if (i == 1 || i == 2 || i == 10000) {
                    System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => 안철수\n", ratio, i);
                }
            }

            if (i == 1 || i == 2 || i == 10000) {
                double lee_ratio = vote_array[0] / 100;
                double yoon_ratio = vote_array[1] / 100;
                double sim_ratio = vote_array[2] / 100;
                double ahn_ratio = vote_array[3] / 100;

                int int_lee = (int) vote_array[0];
                int int_yoon = (int) vote_array[1];
                int int_sim = (int) vote_array[2];
                int int_ahn = (int) vote_array[3];

                System.out.printf("[기호:1] 이재명: %.2f%%, (투표수 : %d) \n", lee_ratio, int_lee);
                System.out.printf("[기호:2] 윤석열: %.2f%%, (투표수 : %d) \n", yoon_ratio, int_yoon);
                System.out.printf("[기호:3] 심상정: %.2f%%, (투표수 : %d) \n", sim_ratio, int_sim);
                System.out.printf("[기호:4] 안철수: %.2f%%, (투표수 : %d) \n\n", ahn_ratio, int_ahn);
                if (i == 10000) {
                    int[] max_array = s1.findMax(vote_array);
                    int max_index = max_array[0];
                    int checkDup = max_array[1];
                    if (checkDup >= 2) System.out.printf("[투표결과] 당선인 : 동률");
                    else System.out.printf("[투표결과] 당선인 : %s", name_array[max_index]);
                }
            }
        }
    }
}
