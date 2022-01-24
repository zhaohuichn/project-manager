package com.project.manager.parse.excel.sheet.row;

import com.project.manager.entity.source.excel.row.ExcelRow;
import com.project.manager.entity.source.excel.row.StandardRow;
import org.apache.commons.compress.utils.Lists;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * StandardRowParser
 *
 * @author ZHAOHUI
 */
public class StandardRowParser implements ExcelRowParser {


    @Override
    public ExcelRow parse(XSSFRow xssfRow) {
        StandardRow row = new StandardRow();

        int rowNum = xssfRow.getRowNum();
        row.setId(rowNum);

        row.setCells(Lists.newArrayList());

        return row;
    }
}
