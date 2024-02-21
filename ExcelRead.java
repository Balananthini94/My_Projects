package Pom_Maplogik;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClassMaplogik;

public class ExcelRead extends BaseClassMaplogik {
    public void excelRead() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            FileInputStream file = new FileInputStream(new File("D:\\Testing training\\Assessment.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through each row in the Excel sheet
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                // Read data from each cell in the row
                String question = row.getCell(0).getStringCellValue();
                String optionA = row.getCell(1).getStringCellValue();
                String optionB = row.getCell(2).getStringCellValue();
                String optionC = row.getCell(3).getStringCellValue();
                String optionD = row.getCell(4).getStringCellValue();
                String answer = row.getCell(5).getStringCellValue();

                // Perform actions on the webpage using the data
                driver.findElement(By.xpath("//span[text()='Add New']")).click();
        		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                driver.findElement(By.name("question_name")).sendKeys(question);
                driver.findElement(By.name("question_option1")).sendKeys(optionA);
                driver.findElement(By.name("question_option2")).sendKeys(optionB);
                driver.findElement(By.name("question_option3")).sendKeys(optionC);
                driver.findElement(By.name("question_option4")).sendKeys(optionD);
                driver.findElement(By.name("correctanswer")).sendKeys(answer);
                driver.findElement(By.id("submitbtn")).click();

                Thread.sleep(2000); // Add a delay
            }

            file.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
