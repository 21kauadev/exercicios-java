package entities;

public class Grader {

    // classe criada apenas para a análise se o estudante foi aprovado ou não
    // motivos:

    // 1. Maior flexibilidade
    // 2. Menor acoplamento
    // 3. Maior organização

    public String verifyStudentApproval(Student student) {

        double finalGrade = student.finalGrade();

        if (finalGrade < 60.00) // somenete caso seja menor que a média
            return "FAILED"; // retornará que reprovou.

        return "PASS"; // por padrao retorna que passou.
    }

}
