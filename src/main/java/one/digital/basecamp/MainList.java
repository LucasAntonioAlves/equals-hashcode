package one.digital.basecamp;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford"))); // Verifica se tem a marca do carro chamado "Ford"

        System.out.println(listCarros.get(2)); // Imprime quem está no indice 2 da lista

        System.out.println(listCarros.indexOf(new Carro("Fiat"))); // Imprime qual indice esta o carro com a marca "Fiat"

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}
