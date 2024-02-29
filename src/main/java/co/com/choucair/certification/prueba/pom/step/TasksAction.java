package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TasksAction {
    private PaginaUrl paginaUrl;

    @Step
    public void singIn(){
        paginaUrl.user.sendKeys("@andresSanchez");
        paginaUrl.pass.sendKeys("@andres*1020");
        paginaUrl.btn_sing_in.click();
    }

    @Step
    public void verificar(){
        assertThat(paginaUrl.lbl_Menu.isCurrentlyVisible(), is(true));
    }
}
