package com.project.manager.parse.excel.sheet.cell.in;

import com.project.manager.enums.InputExcelCellTypeEnum;

/**
 * MemberScheduleParser
 *
 * @author ZHAOHUI
 */
public class MemberParser extends AbstractInputExcelCellParser<String>{
    @Override
    public String id() {
        return InputExcelCellTypeEnum.MEMBER.toString();
    }

    @Override
    public String parse(Object rawData) {
        return null;
    }
}
