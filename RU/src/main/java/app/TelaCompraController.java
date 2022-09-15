package app;

import exceptions.ElementoJaExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.Label;
import negocio.Controlador;

=======
>>>>>>> 35c80eb0bdd5654da00a45799aa92417bd9f4b26
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import models.Estudante;
import models.Funcionario;
import models.TicketRefeicao;
import models.TipoRefeicao;
import negocio.Controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class TelaCompraController {

    private Stage stage;
    private Scene scene;
    private Parent root;

<<<<<<< HEAD
    @FXML
    private Label labelQtdAlmoco;

    @FXML
    private Label labelQtdJanta;

    @FXML
    private Label labelNomeAluno;

    @FXML
    protected void initialize() {
        labelNomeAluno.setText(" " + Controlador.getInstance().getUsuario().getNome());
    }

    @FXML
    void botaoComprarJanta(ActionEvent event) {

    }

    @FXML
    protected void botaoComprarAlmoco(ActionEvent event) {

    }

=======
    Random random = new Random();

    @FXML
    protected void botaoComprarAlmoco() throws ElementoJaExisteException {
        Controlador.getInstance().getRepositorioTicketRefeicao().inserir(new TicketRefeicao(LocalDate.now(), LocalDate.now().plusDays(30),String.valueOf(random.nextInt(100000)),3.5,Controlador.getInstance().getUsuario(), TipoRefeicao.ALMOCO));
    }

    @FXML
    protected void botaoComprarJanta() throws ElementoJaExisteException {
        Controlador.getInstance().getRepositorioTicketRefeicao().inserir(new TicketRefeicao(LocalDate.now(), LocalDate.now().plusDays(30),String.valueOf(random.nextInt(100000)),3.0,Controlador.getInstance().getUsuario(), TipoRefeicao.JANTAR));
    }
>>>>>>> 35c80eb0bdd5654da00a45799aa92417bd9f4b26

    @FXML
    protected void botaoVoltar(ActionEvent event) throws IOException {
        if (Controlador.getInstance().getUsuario() instanceof Estudante) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaAluno.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Tela Inicial");
        } else if (Controlador.getInstance().getUsuario() instanceof Funcionario) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaFuncionario.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Tela inicial");
        }
    }
}
