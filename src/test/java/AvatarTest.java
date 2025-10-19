import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AvatarTest {

    @Test
    public void changeAvatarTest() {
        // создай драйвер для браузера Chrome        
        // перейди на страницу тестового стенда
        open("https://qa-mesto.praktikum-services.ru/");
        // выполни авторизацию
        $(byId("email")).setValue("kaseka_2999@gmail.com");
        $(byId("password")).setValue("Qwerty123");
        $(byClassName("auth-form__button")).click();
        // кликни по изображению профиля
        $(byCssSelector(".profile__image")).click();
        // в поле ссылки на изображение введи ссылку
        $(byId("owner-avatar")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenide.png");
        // сохрани новое изображение
        $(byXpath(".//form[@name='edit-avatar']/button[text()='Сохранить']")).click();

    }

    @Test
    public void addNewCardTest() {
        open("https://qa-mesto.praktikum-services.ru/");
        $(byId("email")).setValue("kaseka_2999@gmail.com");
        $(byId("password")).setValue("Qwerty123");
        $(byClassName("auth-form__button")).click();
        $(byClassName("profile__add-button")).click();
        $(byName("name")).setValue("Москва");
        $(byName("link")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
        $x("//form[@name='new-card']//button[text()='Сохранить']").click();
        $x(".//button[contains(@class, 'card__delete-button') and contains(@class, 'card__delete-button_visible')]").click();


    }


    @Test
    public void changeProfileDateTest() {
        open("https://qa-mesto.praktikum-services.ru/");
        $(byId("email")).setValue("kaseka_2999@gmail.com");
        $(byId("password")).setValue("Qwerty123");
        $(byClassName("auth-form__button")).click();
        $(byClassName("profile__edit-button")).click();
        $(byId("owner-name")).setValue("Аристарх Сократович");
        $(byId("owner-description")).setValue("Автор автотестов");
        $x("//form[@name='edit']//button[text()='Сохранить']").click();
    }





}