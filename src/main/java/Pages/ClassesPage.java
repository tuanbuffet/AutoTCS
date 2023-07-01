package Pages;

import org.openqa.selenium.By;
import static KeyWords.WebUI.*;
import KeyWords.WebUI;
import org.openqa.selenium.Keys;

public class ClassesPage {
    private String URL = "https://spu.bos.hocmai.com/classes";
    private By LopHocButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/ul/div[3]");
    private By DanhSachLopButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/ul/div[4]/div/div/div/a[1]/div");
    private By TenLopInput = By.xpath("//*[@name=\"classKeyword\"]");
    private By SearchButton = By.xpath("//*[@id=\"root\"]/div/main/div[2]/form/div/div[3]/div/button[2]");
    private By ClassStatus = By.xpath("/html/body/div/div/main/div[2]/form/div/div[2]/div[1]/div[2]/div/div/div/input");
    private By ClassKind = By.xpath("/html/body/div/div/main/div[2]/form/div/div[2]/div[2]/div[2]/div/div/div/input");
    //Hàm khởi dựng
    public ClassesPage(){
    }

    public void SearchClasses(){
        clickElement(LopHocButton);
        clickElement(DanhSachLopButton);
        setText(TenLopInput,"NTA");
        setText(ClassStatus,"Đang Học"+ Keys.ARROW_DOWN + Keys.ENTER);
        setText(ClassKind,"Chính Thức"+Keys.ARROW_DOWN + Keys.ENTER);
        clickElement(SearchButton);


    }
}
