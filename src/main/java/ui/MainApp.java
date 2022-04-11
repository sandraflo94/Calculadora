package ui;

import model.Calculadora;

import java.util.Scanner;


public class MainApp {

//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
//
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/styles/Styles.css");
//
//        stage.setTitle("JavaFX and Maven");
//        stage.setScene(scene);
//        stage.show();
//    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        launch(args);

        Scanner ler = new Scanner(System.in);
        int opcao;


        double x;
        double y;

        do {
            System.out.println("\n1-Soma\n2-Produto\n3-Subtração\n4-Quociente\n8-x^y\n9-Factorial\n0-Sair.\n" +
                    "Qual a operação que quer realizar?\n");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Indique o primeiro número da soma");
                    x = ler.nextDouble();
                    System.out.println("Indique o segundo número da soma");
                    y = ler.nextDouble();
                    System.out.println(Calculadora.formulaSoma(x, y));
                    break;
                }
                case 2: {
                    System.out.println("Indique o primeiro número da multiplicação");
                    x = ler.nextDouble();
                    System.out.println("Indique o segundo número da multiplicação");
                    y = ler.nextDouble();
                    System.out.println(Calculadora.formulaProduto(x, y));
                    break;
                }
                case 3: {
                    System.out.println("Indique o primeiro número da subtração");
                    x = ler.nextDouble();
                    System.out.println("Indique o segundo número da subtração");
                    y = ler.nextDouble();
                    System.out.println(Calculadora.formulaSubtracao(x, y));
                    break;
                }
                case 4: {
                    System.out.println("Indique o primeiro número da divisão");
                    x = ler.nextDouble();
                    System.out.println("Indique o segundo número da divisão");
                    y = ler.nextDouble();
                    System.out.println(Calculadora.formulaQuociente(x, y));
                }
                case 8: {
                    System.out.println("Indique a base");
                    x = ler.nextDouble();
                    System.out.println("Indique o expoente");
                    y = ler.nextDouble();
                    System.out.println(Calculadora.calcXelevadoY(x, y));
                    break;
                }
                case 9: {
                    System.out.println("Indique o número");
                    x = ler.nextDouble();
                    System.out.println(Calculadora.factorial(x));
                    // break;
                }
            }
        }
        while (opcao != 0);
    }
}
