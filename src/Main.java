import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int math , physics , chemical , biology , turkish , music ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Your Math score : ");
        math = inp.nextInt();

        System.out.print("Your Physics score : ");
        physics = inp.nextInt();

        System.out.print("Your Chemical score : ");
        chemical = inp.nextInt();

        System.out.print("Your Biology score : ");
        biology = inp.nextInt();

        System.out.print("Your Turkish score : ");
        turkish = inp.nextInt();

        System.out.print("Your Music score : ");
        music = inp.nextInt();

        int total = (math + physics + chemical + biology + turkish + music );
        double result = (total/6);

        boolean kosul1= result<60;
        boolean kosul2= result>60;
        boolean sonuc = kosul1 || kosul2;
        String cevap = sonuc ? "Gecti" : "Kaldi";
        System.out.println(cevap);

    }
}
