/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partition;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author samuel
 */
public class Partition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(20);
        lista.add(90);
        lista.add(200);
        lista.add(100);
        
        particion(lista);
    }

    static boolean particion(ArrayList<Integer> lista) {
        ArrayList<Integer> A = new ArrayList();
        ArrayList<Integer> B = new ArrayList();

        Collections.sort(lista, Collections.reverseOrder());
        for (Integer lista1 : lista) {
            if (Suma(A) < Suma(B)) {
                A.add(lista1);
            } else {
                B.add(lista1);
            }

        }
        if (Suma(A) == Suma(B)) {
            print(A);
            print(B);
            return true;
        } else {
            return false;
        }
    }

    static int Suma(ArrayList<Integer> lista) {
        int ret = 0;
        for (int i = 0; i < lista.size(); i++) {
            ret += lista.get(i);
        }
        return ret;
    }

    
    static void print(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+",");
        }
        System.out.println();
    }
    
    
}
