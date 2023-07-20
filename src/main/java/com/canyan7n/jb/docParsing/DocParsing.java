package com.canyan7n.jb.docParsing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.docParsing
 * @className: DocParsing
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/20 10:10
 * @version: 1.0
 */

public class DocParsing {
    public static void main(String[] args) throws Exception{
        //word();
        excel();
    }
    public static void word()throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("1.docx"));
        XWPFDocument document = new XWPFDocument(fileInputStream);
        List<XWPFParagraph> paragraphs = document.getParagraphs();
        for (XWPFParagraph paragraph :paragraphs){
            String text = paragraph.getText();
            System.out.println(text);
        }
        fileInputStream.close();
    }
    public static void excel()throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("1.xlsx"));
        Workbook sheets = new XSSFWorkbook(fileInputStream);
        Sheet sheet = sheets.getSheetAt(0);

        for (Row row: sheet){
            for (Cell cell : row){
                String cellValue = "";
                switch (cell.getCellType()){
                    case STRING:
                        cellValue = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        cellValue = String.valueOf(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        cellValue = String.valueOf(cell.getBooleanCellValue());
                        break;
                    default:
                        break;
                }
                System.out.print(cellValue + "\t|");
            }
            System.out.println();
        }
        sheets.close();
        fileInputStream.close();
    }
}
