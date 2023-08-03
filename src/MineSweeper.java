import java.util.Scanner;

public class MineSweeper {

    public int row;
    public int column;
    public String[][] mineField;
    public String[][] mineMap;
    public int totalMines;
    public boolean isGameOver = false;
    public int uncoveredCells = 0;

    public MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
        mineField = new String[row][column];
        mineMap = new String[row][column];
    }

    public void play(){
        int coordinateY;
        int coordinateX;
        Scanner scanner = new Scanner(System.in);

        //Mayın Tarlasını Oluşturma
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                mineField[i][j] = "-";
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                mineMap[i][j] = "-";
            }
        }

        totalMines = (row * column) / 4;
        for(int i = 0; i < totalMines; i++){
            int x = (int) (Math.random() * row);
            int y = (int) (Math.random() * column);

            mineMap[x][y] = "*";
        }

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        while(uncoveredCells < (row * column - totalMines)){

            //Mayın Tarlasını Gösterme
            for(String[] mineFieldChild : mineField){
                for (String partOfMineField : mineFieldChild){
                    System.out.print(partOfMineField + " ");
                }
                System.out.println();
            }

            System.out.println("****************");
            System.out.print("Satır Giriniz: ");
            coordinateY = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            coordinateX = scanner.nextInt();

            if(coordinateY < 0 || coordinateX < 0 || coordinateY >= mineField.length || coordinateX >= mineField[0].length){
                System.out.println("Lütfen Geçerli Bir Koordinat Giriniz");
            }
            else{
                if(mineMap[coordinateY][coordinateX].equals("*")){
                    isGameOver = true;
                    break;
                }
                else{

                    int totalMinesOfAround = 0;

                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int neighborY = coordinateY + i;
                            int neighborX = coordinateX + j;

                            if (neighborY >= 0 && neighborY < row && neighborX >= 0 && neighborX < column) {
                                if (mineMap[neighborY][neighborX].equals("*")) {
                                    totalMinesOfAround++;
                                }
                            }
                        }
                    }
                    mineField[coordinateY][coordinateX] = Integer.toString(totalMinesOfAround);
                }
                uncoveredCells++;
            }
        }

        for(String[] mineFieldChild : mineMap){
            for (String partOfMineField : mineFieldChild){
                System.out.print(partOfMineField + " ");
            }
            System.out.println();
        }

        if(isGameOver){
            System.out.println("Oyunu Kaybettiniz!");
        }
        else{
            System.out.println("Oyunu Kazandınız!");
        }
    }
}
