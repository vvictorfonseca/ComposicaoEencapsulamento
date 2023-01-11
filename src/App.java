public class App {
    public static void main(String[] args) throws Exception {
        Aluno novoAluno = new Aluno();
        novoAluno.setName("Victor Hugo Fonseca");
        novoAluno.setAge(24);
        novoAluno.setBirth("03/03/1998");
        novoAluno.setCity("Rio de Janeiro");
        novoAluno.setCollege("UFRJ");

        novoAluno.getCurso().setName("Fundamentos da Física Quântica");
        novoAluno.getCurso().setMateria("Física");
        novoAluno.getCurso().setDuracao("2 meses");

        System.out.println(novoAluno.getName() + ": " + novoAluno.getCollege());
        System.out.println(novoAluno.getCurso().getName());
    }
}
