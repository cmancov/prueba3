package co.com.choucair.certification.prueba.pom.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaUrl extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade user;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade pass;
    @FindBy(xpath = "//button[contains(text(), 'Sign in')]")
    public WebElementFacade btn_sing_in;

    @FindBy(xpath = "//li[contains(text(), 'Menu')]")
    public WebElementFacade lbl_Menu;
}
