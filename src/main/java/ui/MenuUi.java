package ui;

import utils.Utils;

public class MenuUi {
    private String opcao;


    public void run() {
        do {
            System.out.println("\n");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7.");
            System.out.println("8. ");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza Opção :");
            switch (opcao) {
                case "1": {

                    break;
                }
                case "2": {

                    break;
                }
                case "3": {

                    break;
                }
                case "4": {

                    break;
                }
                case "5": {

                    break;
                }
                case "6": {

                    break;
                }
                case "7": {

                    break;
                }
                case "8": {

                    break;
                }
            }
        }
        while (!opcao.equals("0"));
    }
}
