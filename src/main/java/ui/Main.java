package ui;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.*;
import java.io.IOException;

public class Main {

    public static final String TITULO_APLICACAO = "Calculadora";

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle(TITULO_APLICACAO);
            stage.setScene(scene);

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Alert alerta = AlertaUI.criarAlerta(Alert.AlertType.CONFIRMATION, TITULO_APLICACAO,
                            "Confirmação da ação.", "Deseja mesmo encerrar a aplicação?");

                    if (alerta.showAndWait().get() == ButtonType.CANCEL) {
                        event.consume();
                    }
                }
            });
            stage.show();
        } catch (IOException ex) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, TITULO_APLICACAO,
                    "Problemas no arranque da aplicação.", ex.getMessage()).show();
            ex.printStackTrace();
        }
    }



    public static class AlertaUI {

        public static Alert criarAlerta(Alert.AlertType tipoAlerta, String titulo, String cabecalho, String mensagem) {
            Alert alerta = new Alert(tipoAlerta);

            alerta.setTitle(titulo);
            alerta.setHeaderText(cabecalho);
            alerta.setContentText(mensagem);

            if (tipoAlerta == Alert.AlertType.CONFIRMATION) {
                ((Button) alerta.getDialogPane().lookupButton(ButtonType.OK)).setText("Sim");
                ((Button) alerta.getDialogPane().lookupButton(ButtonType.CANCEL)).setText("Não");
            }

            return alerta;


        }
    }

    public static void main(String[] args) {
    }
}
