package com.project.manager.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * ExcelUtil
 *
 * @author ZHAOHUI
 */
public class ExcelUtil {

    /**
     * 从输入流中读取
     *
     * @param inputStream
     * @return
     */
    public static byte[] read(InputStream inputStream) {
        try {
            XSSFWorkbook excel = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = excel.getSheetAt(0);
            XSSFRow sheetHeader = sheet.getRow(0);
            // 列名
            Map<Integer, String> cellNameMap = Maps.newHashMap();
            for (int i = 0; i < sheetHeader.getLastCellNum(); i++) {
                cellNameMap.put(i, getStringCellValue(sheetHeader.getCell(i)));
            }

            // 行列数据
            Map<Integer, List<String>> rowData = Maps.newHashMap();
            int rowNo = 0;
            while ((rowNo++) < sheet.getLastRowNum()) {
                XSSFRow row = sheet.getRow(rowNo);
                int cellNo = 0;
                List<String> cellValue = Lists.newLinkedList();
                for (int index = 0; index < row.getLastCellNum(); index++) {
                    cellValue.add(getStringCellValue(row.getCell(cellNo)));
                    rowData.put(rowNo, cellValue);
                }
            }
            return rowData.toString().getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    private static String getStringCellValue(XSSFCell cell) {
        if (null == cell) {
            return "";
        }
        if (CellType.NUMERIC == cell.getCellType()) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return cell.getStringCellValue();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        ExcelUtil.read(new FileInputStream("D:\\doc\\design\\Chailyn_20220122.xlsx"));
    }


}
