package com.project.manager.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

/**
 * ExcelUtil
 *
 * @author ZHAOHUI
 */
public class ExcelUtil {

    public static XSSFWorkbook readWorkbook(InputStream inputStream) {
        try {
            return new XSSFWorkbook(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getCellStringValue(Cell cell) {
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
