package List.java;

import java.util.List;
import java.util.ArrayList;

public class ExList {

    public static void main(String[] args) {
                // Criando uma lista de Strings
                List<String> frutas = new ArrayList<>();

                // Adicionando elementos
                frutas.add("Maçã");
                frutas.add("Banana");
                frutas.add("Laranja");

                // Mostrando a lista
                System.out.println("Lista: " + frutas);

                // Removendo um elemento
                frutas.remove("Banana");
                System.out.println("Após remover Banana: " + frutas);

                // Alterando um elemento
                frutas.set(1, "Abacaxi");
                System.out.println("Após alterar Laranja para Abacaxi: " + frutas);

                // Percorrendo a lista
                System.out.println("Percorrendo a lista:");
                for (String fruta : frutas) {
                    System.out.println(fruta);
                }
            }
        }
