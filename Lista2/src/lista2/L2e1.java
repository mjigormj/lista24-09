package lista2;

public class L2e1 {

    public static void main(String[] args) {

        String l = "";
        String t[][] = new String[20][20];
        int i, j, r, z, x;
        try {
            System.out.println("Tabuada do 1 a 10: ");
            l = "-----------";

            for (j = 1; j <= 10; j++) {
                for (i = 1; i <= 10; i++) {
                    r = i * j;

                    if (r >= 10) {
                        t[i][j] = ("| " + i + "X" + j + "=" + r + "  |");
                        if (j == 10) {
                            t[i][j] = ("| " + i + "X" + j + "=" + r + " |");
                        }
                    } else {
                        t[i][j] = ("|  " + i + "X" + j + "=" + r + "  |");
                    }
                    if (r == 100) {
                        t[i][j] = ("| " + i + "X" + j + "=" + r + "|");
                    }
                }
            }
            System.out.println(l + l + l + l + l);
            for (z = 1; z <= 10; z++) {

                for (x = 1; x <= 5; x++) {
                    System.out.print(t[x][z]);
                }
                System.out.println("");

            }
            System.out.println(l + l + l + l + l);
            for (z = 1; z <= 10; z++) {

                for (x = 6; x <= 10; x++) {
                    System.out.print(t[x][z]);
                }
                System.out.println("");
            }
            System.out.print(l + l + l + l + l);
        } catch (NullPointerException erro) {
            System.out.print("Obrigado por utilizar nosso sistema!");
        }
    }
}
