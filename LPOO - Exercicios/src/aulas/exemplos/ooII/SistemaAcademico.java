package aulas.exemplos.ooII;

/**
 *
 * @author Rafael
 */
public class SistemaAcademico{
    public static void main(String[] args){
        String[] listaDisciplinas = new String[2];
        listaDisciplinas[0] = "LPOO";
        listaDisciplinas[1] = "Ger. de Projetos";
        Aluno[] listaAlunos = new Aluno[3];
        listaAlunos[0] = new Aluno("Pedro da Silva", 222222222, 333333333,
            "Rua Inventada, 0. Curitiba-PR",
            "GRR20112000", "TADS",
            4, listaDisciplinas);
        
        listaAlunos[1] = new Aluno("João de Souza", 222223322, 333443333,
            "Rua Zero, 1000. Curitiba-PR",
            "GRR20112010", "TADS",
            4, listaDisciplinas);
        listaAlunos[2] = new Aluno("Maria Bonita", 223323322, 333443883,
            "Rua Mil, 200. Curitiba-PR",
            "GRR20112020", "TADS",
            4, listaDisciplinas);
        Professor professor = new Professor("Rafael R Wandresen", 99999, 88888,
                "Rua Dois Milo", "4676", "Msc", listaDisciplinas, "TADS");
        Professor professor2 = professor;

        professor.setNome("Carlos");
        System.out.println(professor2.getNome());

        System.out.println("CSV da lista de alunos:");
        System.out.println(getCsvListaAlunos(listaAlunos));
    }
    public static String getCsvListaAlunos(Aluno[] lista){
        String csv="Nome;Matricula;Curso;Disciplina1;Disciplina2";
        for(Aluno aluno:lista){
            csv = csv+"\n" +aluno.getNome() +";"+aluno.getMatricula()+";"+
                    aluno.getCurso()+";"+aluno.getDisciplinasMatriculadas()[0]+";"+
                    aluno.getDisciplinasMatriculadas()[1];
        }
        return csv;
    }
}
