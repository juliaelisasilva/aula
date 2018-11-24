package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;

public class TrelloStep {
    LoginPage loginPage;

    @Dado("^que esteja logado no trello$")
    public void queEstejaLogadoNoTrello() throws Throwable {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin("juliaelisasilva", "123456");
        Assert.assertEquals("Página Inicia do Trello",
                loginPage.checkInitialPage());
        //System.out.println("queEstejaLogadoNoTrello");
    }

    @E("^acesse o board$")
    public void acesseOBoard() throws Throwable{
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com o nome \"([^\"]*)\"$")
    public void crioUmCardComONome(String arg0) throws Throwable {
        System.out.println("crioUmCardComONome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        System.out.println("Comento");
}

    @Então("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() throws Throwable{
        System.out.println("oCardDeveEstarNaLista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluoOCard");
    }

    @Então("^o card não existe mais$")
    public void oCardNãoExisteMais() {
        System.out.println("oCardNaoExisteMais");
    }
}
