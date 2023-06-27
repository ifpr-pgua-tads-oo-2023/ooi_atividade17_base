package ifpr.pgua.eic.biblioteca;

import java.util.ArrayList;

import ifpr.pgua.eic.biblioteca.controllers.TelaCadastroAutor;
import ifpr.pgua.eic.biblioteca.controllers.TelaPrincipal;
import ifpr.pgua.eic.biblioteca.controllers.TelaVisualizarAutores;
import ifpr.pgua.eic.biblioteca.infra.Escritor;
import ifpr.pgua.eic.biblioteca.infra.Leitor;
import ifpr.pgua.eic.biblioteca.models.Biblioteca;
import ifpr.pgua.eic.biblioteca.models.Autor;
import io.github.hugoperlin.navigatorfx.BaseAppNavigator;
import io.github.hugoperlin.navigatorfx.ScreenRegistryFXML;


/*A classe App extende a classe BaseAppNavigator, o que
 * permite fazer a navegação entre telas.
 */
public class App extends BaseAppNavigator{


    /*gerenciador da escola que será compartilhado com as diferentes telas
     * da aplicação.
     */
    private Biblioteca gerenciador;


    /*método utilizado para inicializar dependências da aplicação. Este
     * método é executado sempre uma vez no início da aplicação.
     */
    @Override
    public void init() throws Exception {
        super.init();
        Leitor leitor = new Leitor();
        
        gerenciador = new Biblioteca();
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
        Escritor escritor = new Escritor();
        
    }

    /*método para indicar qual é a tela inicial da aplicação */
    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    /*método para indicar o nome da aplicação */
    @Override
    public String getAppTitle() {
        return "Quiz App";
    }

    /*método para registrar as telas da aplicação*/
    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL",
                      new ScreenRegistryFXML(App.class, 
                                         "principal.fxml", 
                                          o->new TelaPrincipal()));
        registraTela("CADASTRO_AUTOR", 
                      new ScreenRegistryFXML(App.class, 
                                             "cadastro_autor.fxml",
                                            o->new TelaCadastroAutor()));
        registraTela("VISUALIZAR_AUTORES",
                     new ScreenRegistryFXML(App.class, 
                                           "visualizar_autores.fxml", o->new TelaVisualizarAutores()));                                
    
        }
    
}
