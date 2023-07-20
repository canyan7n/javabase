package com.canyan7n.jb.docParsing;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        word();
    }
    public static void word()throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("1.docx"));
        XWPFDocument xwpfDocument = new XWPFDocument(fileInputStream);
        List<XWPFParagraph> paragraph = xwpfDocument.getParagraphs();
        for (XWPFParagraph xwpfParagraph :paragraph){
            String text = xwpfParagraph.getText();
            System.out.println(text);
        }
    }
}
