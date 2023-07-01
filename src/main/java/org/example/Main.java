package org.example;

import KeyWords.Browser;
import static Pages.Login.*;

import Pages.ClassesPage;
import Pages.Login;
import org.checkerframework.checker.units.qual.C;

public class Main extends Browser{

    public static void main  (String[] args) throws InterruptedException {
        loginBOS();
        ClassesPage classesPage = new ClassesPage();
        classesPage.SearchClasses();

    }
}
/*
    LoginPage loginPage;

    //LoginPage loginPage = new LoginPage(driver);

    public void loginBos()throws InterruptedException{

        //Khởi tạo đối tượng trang LoginPage
        //Truyền driver từ BaseTest
        loginPage = new LoginPage(driver);

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.Login();
    }*/
