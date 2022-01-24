package com.project.manager.parse.excel.sheet.cell.in;

import com.project.manager.enums.InputExcelCellTypeEnum;

/**
 * ProblemParser
 *
 * @author ZHAOHUI
 */
public class ProblemParser extends AbstractInputExcelCellParser<String>{
    @Override
    public String id() {
        return InputExcelCellTypeEnum.PROBLEM.toString();
    }

    @Override
    public String parse(Object rawData) {
        return null;
    }
}
