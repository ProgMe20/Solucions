package programame.buclesimple;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class p513_Empleado_del_any {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        StringBuilder sortida = new StringBuilder();
        int dias;
        int patents, anteriorT, mitja;
        String[] lstMitjanas;
        int d = 0;

        while (scanner.hasNextInt()) {
            dias = Integer.parseInt(scanner.nextLine());
            patents = 0;
            anteriorT = 0;
            mitja = 0;
            lstMitjanas = scanner.nextLine().split(" ");

            for (int i = 0; i < dias; i++) {
                mitja = Integer.parseInt(lstMitjanas[i]);
                patents = (mitja * (i + 1)) - anteriorT;
                anteriorT += patents;
                sortida.append(patents).append(' ');
            }
            sortida.delete(sortida.length() - 1, sortida.length());
            sortida.append("\n");
            System.out.print(sortida);

        }
        //Se li ha de treure l'últim espai en blanc i el salt de línia
        System.out.print(sortida);
    }
}

/* 
IN
3
3 4 5
3
3 4 3

OUT
3 5 7
3 5 1
 */
