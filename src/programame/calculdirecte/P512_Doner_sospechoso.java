package programame.calculdirecte;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P512_Doner_sospechoso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        StringBuilder sortida = new StringBuilder();
        int casos = scanner.nextInt();
        int c = 0, v = 0;

        for (int i = 0; i < casos; i++) {
            c = scanner.nextInt();
            v = scanner.nextInt();
            sortida.append((int) (100.0 * c / (c + v))).append('\n');
        }   
        System.out.print(sortida);
    }
}
/*
in:
3
53 47
3 5
86 97

out:
53
37
46
*/
