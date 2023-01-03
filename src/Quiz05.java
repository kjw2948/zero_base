import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
public class Quiz05 {
    public void calendar(){
        Scanner in = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = in.nextInt();
        System.out.print("달력의 월을 입력 주세요.(mm):");
        int month = in.nextInt();
    }
}
