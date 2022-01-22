package com.project.manager.util;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

/**
 * ExcelUtil
 *
 * @author ZHAOHUI
 */
public class ExcelUtil {

    public static XSSFSheet getFirstSheet(InputStream is) {
        try {
            XSSFWorkbook workbook = readWorkbook(is);
            return getSheet(workbook, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static XSSFSheet getSheet(InputStream is, int sheetNo) {
        XSSFWorkbook workbook = readWorkbook(is);
        return getSheet(workbook, sheetNo);
    }

    public static XSSFSheet getSheet(XSSFWorkbook workbook, int sheetNo) {
        if (null == workbook) {
            return null;
        }
        return workbook.getSheetAt(sheetNo);
    }

    public static XSSFWorkbook readWorkbook(InputStream inputStream) {
        try {
            return new XSSFWorkbook(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStringCellValue(XSSFCell cell) {
        if (null == cell) {
            return "";
        }
        if (CellType.NUMERIC == cell.getCellType()) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return cell.getStringCellValue();
        }
    }

}
