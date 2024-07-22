package com.example.workit.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    @Test
    public void testUserRegistration() {
        WebDriver driver = WebDriverConfig.getChromeDriver();

        try {
            driver.get("http://localhost:8080/cadastro");

            driver.findElement(By.id("nome")).sendKeys("João Silva");
            driver.findElement(By.id("dataNascimento")).sendKeys("1997-06-21");
            driver.findElement(By.id("email")).sendKeys("joao.silva@teste.com");
            driver.findElement(By.id("senha")).sendKeys("senha123");

            driver.findElement(By.id("register-form")).submit();

            Assertions.assertTrue(driver.getCurrentUrl().contains("login"));

        } finally {
            driver.quit();
        }
    }
}
