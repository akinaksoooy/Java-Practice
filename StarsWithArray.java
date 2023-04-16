public class StarsWithArray {
    public static void main(String[] args) {
        String[][] letter = new String[7][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                switch (i) {
                    case 0, 3, 6 -> letter[i][j] = (j <= 3) ? "*" : " ";
                    default -> letter[i][j] = (j == 0 || j == 4) ? "*" : " ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}