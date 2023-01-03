import java.util.Scanner;
import java.util.Random;
public class Quiz02 {
    public void cashBack(){
        Scanner in = new Scanner(System.in);
        var cashback = 0;
        System.out.print("결제 금액을 입력해주세요.(금액) : ");
        int cash = in.nextInt();
        if (cash>3000) {
            cashback = 300;
        }
        else {
            cashback = cash/10;
            cashback = (int) (Math.floor(cashback / 100)*100);
        }
        System.out.println("결제 금액은 "+ cash +"원이고, 캐시백은 " +cashback + "원 입니다.");
    }
}
