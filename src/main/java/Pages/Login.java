package Pages;

import KeyWords.WebUI;
import org.openqa.selenium.By;

import static KeyWords.WebUI.*;

public class Login extends WebUI {
    private static String URL = "https://spu.bos.hocmai.com/auth/login";
    private static String account = "ctvanhnt2";
    private static String password = "anhnt216836";
    static By  usernameInput = By.name("username");
    static By passwordInput = By.name("password");
    static By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/button");

    public Login(){
    }
    public static void loginBOS () throws InterruptedException {
        openBrowser();
        openURL(URL);
        setText(usernameInput,account);
        setText(passwordInput,password);
        clickElement(loginButton);

    }

}
