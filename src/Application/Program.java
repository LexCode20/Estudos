package Application;

import Excessoes.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        //Define os pontos como separadores de decimais e não a virgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.println("Informe a quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
