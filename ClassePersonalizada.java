
package classepersonalizada;

import java.util.ArrayList;

public class ClassePersonalizada {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("João", 8.5));
        alunos.add(new Aluno("Maria", 9.0));
        alunos.add(new Aluno("Carlos", 7.5));
        alunos.add(new Aluno("Ana", 6.8));
        alunos.add(new Aluno("Pedro", 9.2));

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        double mediaNotas = somaNotas / alunos.size();

        System.out.println("\nMédia das Notas: " + mediaNotas);
    }
}

