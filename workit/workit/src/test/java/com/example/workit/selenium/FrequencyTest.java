package com.example.workit.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrequencyTest {

    @Test
    public void testMarkFrequency() {
        WebDriver driver = WebDriverConfig.getChromeDriver();

        try {
            driver.get("http://localhost:8080/frequency");

            WebElement checkbox = driver.findElement(By.id("frequency-checkbox"));
            checkbox.click();

            String cookie = driver.manage().getCookieNamed("frequency").getValue();
            Assertions.assertNotNull(cookie);

            WebElement weeklyCounter = driver.findElement(By.id("weekly-counter"));
            WebElement monthlyCounter = driver.findElement(By.id("monthly-counter"));
            Assertions.assertTrue(Integer.parseInt(weeklyCounter.getText()) > 0);
            Assertions.assertTrue(Integer.parseInt(monthlyCounter.getText()) > 0);

        } finally {
            driver.quit();
        }
    }
}
