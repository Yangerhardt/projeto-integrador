package com.example.workit.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testUserLogin() {
        WebDriver driver = WebDriverConfig.getChromeDriver();

        try {
            driver.get("http://localhost:8080/login");

            driver.findElement(By.id("email")).sendKeys("joao.silva@teste.com");
            driver.findElement(By.id("senha")).sendKeys("senha123");

            driver.findElement(By.id("login-form")).submit();

            Assertions.assertTrue(driver.getCurrentUrl().contains("home"));

        } finally {
            driver.quit();
        }
    }
}
