

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Liedson");
        listaAprovados.add("Vasco");
        listaAprovados.add("Jose");
        listaAprovados.add("Karen");

        for(String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
    }
}
