public class MineSweeper {
    int row;
    int column;
    int mayin;
    String[][] arr = new String[row][column]; //satır sutunları gösteren dizi

    String[][] arr2 = new String[row][column]; // mayınları gösteren dizi

    String[][] arr3 = new String[row][column]; // oyuncunun girdiği değerleri gösteren dizi

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        String[][] arr = new String[row][column];
        System.out.println("Satır Sayısı: " + this.row + " Sütun Sayısı: " + this.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                arr[i][j] = " - ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public void run() {
        String[][] arr2 = new String[row][column];
        int mayin = (this.row * this.column) / 4;
        System.out.println("Mayın Sayısı: " + mayin);
        int mayinSayac = 0;
        System.out.println("Mayınların Olduğu Yerler");

        while (mayinSayac < mayin) {
            int randomRow = (int) (Math.random() * this.row);
            int randomColumn = (int) (Math.random() * this.column);
            arr2[randomRow][randomColumn] = " * ";
            mayinSayac++;
        }
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (arr2[i][j] == null) {
                    arr2[i][j] = " - ";
                }
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}



