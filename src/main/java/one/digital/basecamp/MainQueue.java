package one.digital.basecamp;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // Pega o primeiro item que esta na fila (ou seja, a marca "Ford")
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // Pega o primeiro da fila e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); // Verifica se a fila esta vazia, retornando true ou false

        System.out.println(queueCarros.size()); // Ver o tamanho da fila
    }
}
