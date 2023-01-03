import java.util.Scanner;
import java.util.Random;
public class Quiz04 {
    public void creatId(){
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int s_num;

        System.out.print("출생년도를 입력해주세요. : ");
        int year = in.nextInt();
        System.out.print("출생월을 입력해주세요. : ");
        int month = in.nextInt();
        System.out.print("출생일을 입력해주세요. : ");
        int day = in.nextInt();
        System.out.print("성별을 입력해주세요. : ");
        String sex = in.next();
        char s = sex.charAt(0);

        if(s == 'm'){
            s_num = 3;
        }
        else {
            s_num = 4;
        }
        int random_number;
        System.out.printf("%d%d%d-%d",year,month,day,s_num);
        for (int i = 0; i < 6; i++) {
            random_number = rnd.nextInt(10);
            System.out.print(random_number);
        }
    }
}
