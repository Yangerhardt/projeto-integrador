package com.example.workit.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkoutTest {

    @Test
    public void testLoadWorkoutData() {
        WebDriver driver = WebDriverConfig.getChromeDriver();

        try {
            driver.get("http://localhost:8080/workout");

            WebElement mondayButton = driver.findElement(By.id("segunda-feira"));
            mondayButton.click();

            WebElement table = driver.findElement(By.id("training-table"));
            WebElement firstRow = table.findElement(By.tagName("tr"));
            Assertions.assertTrue(firstRow.getText().contains("SUPINO RETO"));

        } finally {
            driver.quit();
        }
    }
}
