package sisdisk;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalcCliente {

    public static void main(String[] args) throws NotBoundException {
        try {
            ICalculadora c = (ICalculadora) Naming.lookup("rmi://localhost/rmiCalculatorService");

            Scanner s = new Scanner(System.in);
            int sair, opcao, num1, num2, resultado;
            do {
                opcao = sair = num1 = num2 = resultado = 0;
                System.out.println("Digite o primeiro número");
                num1 = s.nextInt();
                System.out.println("Digite o segundo número");
                num2 = s.nextInt();
                System.out.println("Digite a operação:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");

                opcao = s.nextInt();

                switch (opcao) {
                    case 1:
                        resultado = c.add(num1, num2);
                        System.out.println("O resultado é: " + resultado);
                        break;
                    case 2:
                        resultado = c.sub(num1, num2);
                        System.out.println("O resultado é: " + resultado);
                        break;
                    case 3:
                        resultado = c.mul(num1, num2);
                        System.out.println("O resultado é: " + resultado);
                        break;
                    case 4:
                        resultado = c.div(num1, num2);
                        System.out.println("O resultado é: " + resultado);
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }

                System.out.println("Deseja Continuar?");
                System.out.println("1 = Sim");
                System.out.println("Qualquer outro número = Não");
                sair = s.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } while (sair == 1);
                System.out.println("Saindo...");
        } catch (Exception e) {
            System.out.println();
            System.out.println(e);
            System.exit(0);
        }
    }
}
