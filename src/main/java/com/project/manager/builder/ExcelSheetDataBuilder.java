package com.project.manager.builder;

import com.google.common.collect.Maps;
import com.project.manager.entity.dto.ExcelSheetData;
import com.project.manager.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

/**
 * InputExcelRowDataBuilder
 *
 * @author ZHAOHUI
 */
public class ExcelSheetDataBuilder implements Builder<ExcelSheetData> {

    private Map<Integer, String> cellNameMap;

    private Map<Integer, Map<Integer, String>> cellValueMap;

    public ExcelSheetDataBuilder(String path) {
        try {
            XSSFSheet sheet = ExcelUtil.getFirstSheet(new FileInputStream(path));
            init(sheet);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ExcelSheetDataBuilder(XSSFSheet sheet) {
        init(sheet);
    }

    private void init(XSSFSheet sheet) {
        // 列名
        this.cellNameMap = getCellNameMap(sheet);
        // 行列数据
        this.cellValueMap = getCellValueMap(sheet);
    }

    private Map<Integer, String> getCellNameMap(XSSFSheet sheet) {
        XSSFRow sheetHeader = sheet.getRow(0);
        Map<Integer, String> cellNameMap = Maps.newHashMap();
        for (int i = 0; i < sheetHeader.getLastCellNum(); i++) {
            cellNameMap.put(i, ExcelUtil.getCellStringValue(sheetHeader.getCell(i)));
        }
        return cellNameMap;
    }

    /**
     * 获取列值
     * <p>
     * key-rowNo
     * value-cellValueMap
     *
     * @param sheet
     * @return
     */
    private Map<Integer, Map<Integer, String>> getCellValueMap(XSSFSheet sheet) {
        Map<Integer, Map<Integer, String>> rowData = Maps.newHashMap();
        for (int rowIndex = 1; rowIndex < sheet.getLastRowNum(); rowIndex++) {
            XSSFRow row = sheet.getRow(rowIndex);
            Map<Integer, String> cellValue = Maps.newHashMap();
            for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {
                cellValue.put(cellIndex, ExcelUtil.getCellStringValue(row.getCell(cellIndex)));
                rowData.put(rowIndex, cellValue);
            }
        }
        return rowData;
    }


    @Override
    public ExcelSheetData build() {
        ExcelSheetData instance = new ExcelSheetData();
        instance.setCellNameMap(cellNameMap);
        instance.setCellValueMap(this.cellValueMap);
        return instance;
    }


}
