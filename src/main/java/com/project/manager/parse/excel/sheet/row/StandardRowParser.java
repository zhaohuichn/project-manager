package com.project.manager.parse.excel.sheet.row;

import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.row.StandardRow;
import org.apache.commons.compress.utils.Lists;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 *
 * @author ZHAOHUI
 */
public class StandardRowParser implements ExcelRowParser {


    @Override
    public ExcelRow parse(Row raw) {
        StandardRow row = new StandardRow();

        int rowNum = raw.getRowNum();
        row.setId(rowNum);

        row.setCells(Lists.newArrayList());

        return row;
    }
}
