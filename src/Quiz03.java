import java.util.Scanner;
import java.util.Random;
public class Quiz03 {
    public void ticket(){
        int ticket_price = 10000;
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요. : ");
        int age = in.nextInt();
        System.out.print("입장시간을 입력해주세요. : ");
        int entrance = in.nextInt();
        System.out.print("국가유공자 여부를 입력해주세요. : ");
        String checkMerit = in.next();
        System.out.print("복지카드 여부를 입력해주세요. : ");
        String checkCard = in.next();
        char cM = checkMerit.charAt(0);
        char cC = checkCard.charAt(0);
        if(age<3){
            ticket_price = 0;
            System.out.println("입장료 : " + ticket_price );
        }
        else if (age<13 || entrance > 17){
            ticket_price = 4000;
            System.out.println("입장료 : " + ticket_price );
        }
        else if (cM == 'y' || cC == 'y'){
            ticket_price = 8000;
            System.out.println("입장료 : " + ticket_price );
        }
        else {
            System.out.println("입장료 : " + ticket_price );
        }
    }
}
