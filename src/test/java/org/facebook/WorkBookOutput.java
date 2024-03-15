package org.facebook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

public class WorkBookOutput {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Admin\\eclipse-workspace\\org.facebook\\target\\FebBatch.xlsx");
            FileOutputStream fileOut = new FileOutputStream(file);

            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Details");

            // Header row
            HSSFRow headerRow = sheet.createRow(0);
            HSSFCell headerCell = headerRow.createCell(0);
            headerCell.setCellValue("Name");

            List<String> names = new ArrayList<String>();
            names.add("Dhivya");
            names.add("Karna");
            names.add("Kavan");
            names.add("Analika");

            for (int i = 0; i < names.size(); i++) {
                HSSFRow dataRow = sheet.createRow(i + 1);
                HSSFCell dataCell = dataRow.createCell(0);
                dataCell.setCellValue(names.get(i));
            }

            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

            System.out.println("Excel file has been created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
