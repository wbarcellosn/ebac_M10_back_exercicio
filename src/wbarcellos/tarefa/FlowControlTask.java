/**
 * @author winic
 */
package wbarcellos.tarefa;

import java.util.Scanner;

public class FlowControlTask {

    Scanner s = new Scanner(System.in);

    double note1;
    double note2;
    double note3;
    double note4;
    double average;
    int option;
    String name;
    String setedOption;

    public static void main(String[] args) {
        FlowControlTask task = new FlowControlTask();

        do {
            System.out.println("\n******SISTEMA DE CÁLCULO DE MÉDIA******");
            task.setOption();
            if(task.setedOption.equals("Sim")){
                System.out.println("\n***CADASTRANDO AS NOTAS:***\n");
                task.calculateAverage();
                task.printData();
                task.verifyIsAprovaded();
                System.out.println("\n**FIM DO CÁLCULO**:\n");
            }

        } while (!task.setedOption.equals("Não"));

        System.out.println("Fim do programa");

    }

    private void setOption(){
        do {
            System.out.println("\nDeseja cadastrar as notas de um novo aluno?");
            System.out.println("Digite o número da opção desejada");
            System.out.println("\n1 - SIM;\n2 - NÃO;\n");
            this.option = s.nextInt();
            s.nextLine();

            if (option == 1) {
                this.setedOption = "Sim";
            }
            else if (option == 2) {
                this.setedOption = "Não";
            }
            else {
                System.out.println("\nOpção inválida!");
            }
        } while (!(option == 1) && !(option == 2));
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Digite o nome do aluno:");
        this.name = s.nextLine();
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1() {
        System.out.println("Digite a primeira nota do aluno:");
        this.note1 = s.nextDouble();
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2() {
        System.out.println("Digite a segunda nota do aluno:");
        this.note2 = s.nextDouble();
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3() {
        System.out.println("Digite a terceira nota do aluno:");
        this.note3 = s.nextDouble();
    }

    public double getNote4() {
        return note4;
    }

    public void setNote4() {
        System.out.println("Digite a quarta nota do aluno:");
        this.note4 = s.nextDouble();
    }

    public double getAverage() {
        return average;
    }

    public void setAverage() {
        this.average = (this.note1 + this.note2 + this.note3 + this.note4) / 4;
    }

    public void calculateAverage() {
        setName();
        setNote1();
        setNote2();
        setNote3();
        setNote4();
        setAverage();
    }

    public void printData() {
        System.out.println("\nAbaixo estão as notas do aluno " + getName() + ":\n");
        System.out.println("Primeira nota: " + getNote1());
        System.out.println("Segunda nota: " + getNote2());
        System.out.println("Terceira nota: " + getNote3());
        System.out.println("Quarta nota: " + getNote4());
        System.out.println("A média das notas é: " + getAverage());
    }

    public void verifyIsAprovaded() {
        String message;

        if(this.average >= 7){
            message = "\nO aluno está APROVADO!";
        }
        else if(this.average >= 5){
            message = "\nO aluno está EM RECUPERAÇÃO!";
        }
        else{
            message = "\nO aluno está REPROVADO!";
        }

        System.out.println(message);
    }
}
