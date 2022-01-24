package com.project.manager.parse.excel.sheet.cell.in;

import com.project.manager.enums.InputExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * TodoMemoParser
 *
 * @author ZHAOHUI
 */
public class RowNoParser extends AbstractInputExcelCellParser<String> {
    @Override
    public String id() {
        return InputExcelCellTypeEnum.ROW_NO.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}