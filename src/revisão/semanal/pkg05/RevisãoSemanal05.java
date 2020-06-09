package revisão.semanal.pkg05;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class RevisãoSemanal05 {
    public static void main(String[] args) {

        double salarioAntigo, salarioNovo, diferenca;
        int codigo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu salário atual?");
        salarioAntigo = ler.nextDouble();
        System.out.println("Qual o seu código de funcionário?");
        codigo = ler.nextInt();
        if (codigo == 310 || codigo == 456 || codigo == 885) {
            switch (codigo) {
                case 310:
                    salarioNovo = (salarioAntigo/100)*5+salarioAntigo;
                    break;
                case 456:
                    salarioNovo = (salarioAntigo/100)*7.5+salarioAntigo;
                    break;
                default:                
                    salarioNovo = (salarioAntigo/100)*10+salarioAntigo;
                    break;
            }
        }
        else {
            salarioNovo = (salarioAntigo/100)*15+salarioAntigo;
        }
        diferenca = salarioNovo-salarioAntigo;
        
        System.out.println("Seu antigo salario é: R$"+salarioAntigo+"\nSeu novo salario é: R$"+salarioNovo+"\nSeu aumento é: R$"+diferenca);
    }
    
}
