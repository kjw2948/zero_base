import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
public class Quiz05 {
    public void calendar(){
        Scanner in = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = in.nextInt();
        System.out.print("달력의 월을 입력 주세요.(mm):");
        int month = in.nextInt();

        LocalDate month_day = LocalDate.of(year, month, 1);
        int month_start_day = month_day.get(ChronoField.DAY_OF_WEEK);
        int num_day = month_day.lengthOfMonth();

        System.out.printf("[%d년 %02d월] \n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int num_week = 0;
        for (int i = 0; i < month_start_day; i++) {
            if(month_start_day == 7){
                break;
            }
            else{
                num_week ++;
                System.out.printf("\t");
            }
        }
        //System.out.println(num_week);
        for (int j = 1; j <= num_day; j++) {
            System.out.printf("%02d\t", j);
            num_week ++;
            if(num_week % 7 == 0)
                System.out.println();
        }
    }
}
