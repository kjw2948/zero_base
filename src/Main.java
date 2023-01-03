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

    public static void main(String[] args) {
        Main s1 = new Main();
        s1.gugudan();
    }
}