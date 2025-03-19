
package menuinterativoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInterativoArrayList {

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu de Tarefas:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("Lista de tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa que deseja remover: ");
                        int tarefaIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (tarefaIndex > 0 && tarefaIndex <= tarefas.size()) {
                            tarefas.remove(tarefaIndex - 1);
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                    } else {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
