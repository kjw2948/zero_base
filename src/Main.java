import java.util.Scanner;
public class Main {
    public void gugudan() {
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String gugudan;

        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                s1 = String.format("%02d", j);
                s2 = String.format(" x ");
                s3 = String.format("%02d", i);
                s4 = String.format(" = ");
                s5 = String.format("%02d", i * j);
                s6 = String.format("   ");
                gugudan = s1 + s2 + s3 + s4 + s5 + s6;
                System.out.print(gugudan);
            }
            System.out.println(" ");
        }
    }
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
    public static void main(String[] args) {
        Main s1 = new Main();
        s1.ticket();
    }
}