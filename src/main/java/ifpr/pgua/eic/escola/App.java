package ifpr.pgua.eic.escola;

import java.util.ArrayList;

import ifpr.pgua.eic.escola.controllers.TelaCadastroAluno;
import ifpr.pgua.eic.escola.controllers.TelaPrincipal;
import ifpr.pgua.eic.escola.controllers.TelaVisualizarAlunos;
import ifpr.pgua.eic.escola.infra.Escritor;
import ifpr.pgua.eic.escola.infra.Leitor;
import ifpr.pgua.eic.escola.models.Escola;
import ifpr.pgua.eic.escola.models.Professor;
import ifpr.pgua.eic.escola.models.Aluno;
import ifpr.pgua.eic.escola.models.Curso;
import io.github.hugoperlin.navigatorfx.BaseAppNavigator;
import io.github.hugoperlin.navigatorfx.ScreenRegistryFXML;


/*A classe App extende a classe BaseAppNavigator, o que
 * permite fazer a navegação entre telas.
 */
public class App extends BaseAppNavigator{


    /*gerenciador da escola que será compartilhado com as diferentes telas
     * da aplicação.
     */
    private Escola gerenciador;


    /*método utilizado para inicializar dependências da aplicação. Este
     * método é executado sempre uma vez no início da aplicação.
     */
    @Override
    public void init() throws Exception {
        super.init();
        Leitor leitor = new Leitor();
        /*ArrayList<Aluno> listaAlunos = leitor.lerAlunos("alunos.txt");
        ArrayList<Professor> listaProfessores = leitor.lerProfessores("professor.txt");
        ArrayList<Curso> listaCursos = leitor.lerCursos("cursos.txt");*/

        gerenciador = new Escola("SuperEscola", "2233-1234");
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
        Escritor escritor = new Escritor();
        /*escritor.salvarAlunos("alunos.txt",gerenciador.getAlunos());
        escritor.salvarProfessores("professores.txt",gerenciador.getProfessores());
        escritor.salvarCursos("cursos.txt",gerenciador.getCursos());*/
        
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
        registraTela("CADASTRO_ALUNO", 
                      new ScreenRegistryFXML(App.class, 
                                             "cadastro_aluno.fxml",
                                            o->new TelaCadastroAluno()));
        registraTela("VISUALIZAR_ALUNOS",
                     new ScreenRegistryFXML(App.class, 
                                           "visualizar_alunos.fxml", o->new TelaVisualizarAlunos()));                                
    
        }
    
}
