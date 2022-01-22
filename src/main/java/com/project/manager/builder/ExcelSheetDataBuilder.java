package com.project.manager.builder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.project.manager.entity.dto.ExcelSheetData;
import com.project.manager.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;
import java.util.Map;

/**
 * InputExcelRowDataBuilder
 *
 * @author ZHAOHUI
 */
public class ExcelSheetDataBuilder implements Builder<ExcelSheetData> {

    private Map<Integer, String> cellNameMap;

    private Map<Integer, String> cellValueMap;

    public ExcelSheetDataBuilder(XSSFSheet sheet) {
        XSSFRow sheetHeader = sheet.getRow(0);
        // 列名
        Map<Integer, String> cellNameMap = Maps.newHashMap();
        for (int i = 0; i < sheetHeader.getLastCellNum(); i++) {
            cellNameMap.put(i, ExcelUtil.getStringCellValue(sheetHeader.getCell(i)));
        }
        // 行列数据
        Map<Integer, List<String>> rowData = Maps.newHashMap();
        int rowNo = 0;
        while ((rowNo++) < sheet.getLastRowNum()) {
            XSSFRow row = sheet.getRow(rowNo);
            int cellNo = 0;
            List<String> cellValue = Lists.newLinkedList();
            for (int index = 0; index < row.getLastCellNum(); index++) {
                cellValue.add(ExcelUtil.getStringCellValue(row.getCell(cellNo)));
                rowData.put(rowNo, cellValue);
            }
        }
    }

    @Override
    public ExcelSheetData build() {
        ExcelSheetData instance = new ExcelSheetData();
        instance.setCellNameMap(cellNameMap);
        instance.setCellValueMap(this.cellValueMap);
        return instance;
    }


}
