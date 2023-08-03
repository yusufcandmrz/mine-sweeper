import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        System.out.println();
        System.out.print("Mayının Satır Uzunluğunu Giriniz: ");
        row = scanner.nextInt();
        System.out.print("Mayının Sütun Uzunluğunu Giriniz: ");
        column = scanner.nextInt();
        System.out.println();

        if(row < 2 || column < 2){
            System.out.println("Hatalı Giriş");
        }
        else{
            MineSweeper mineSweeper = new MineSweeper(row, column);
            mineSweeper.play();
        }
    }
}