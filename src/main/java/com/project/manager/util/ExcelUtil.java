package com.project.manager.util;

import org.apache.commons.compress.utils.Lists;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * ExcelUtil
 *
 * @author ZHAOHUI
 */
public class ExcelUtil {

    public static XSSFRow getSheetHeader(XSSFSheet sheet) {
        return null != sheet && sheet.getLastRowNum() >= 0 ? sheet.getRow(0) : null;
    }

    public static List<XSSFRow> getRows(XSSFSheet sheet, int startRowNos) {
        if (null == sheet) {
            return Lists.newArrayList();
        }
        List<XSSFRow> rows = Lists.newArrayList();
        int lastRowNo = sheet.getLastRowNum();
        for (int index = startRowNos; index < lastRowNo; index++) {
            rows.add(sheet.getRow(index));
        }
        return rows;
    }


    public static XSSFSheet getFirstSheet(String url) {
        try {
            return getFirstSheet(new FileInputStream(url));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static XSSFSheet getFirstSheet(InputStream is) {
        try {
            return getSheet(is, 0);
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

    public static XSSFWorkbook readWorkbook(URL url) {
        try {
            return readWorkbook(new FileInputStream(url.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
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
