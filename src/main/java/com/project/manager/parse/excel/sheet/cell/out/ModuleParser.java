package com.project.manager.parse.excel.sheet.cell.out;

import com.project.manager.enums.OutExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * RowNoParser
 *
 * @author ZHAOHUI
 */
public class ModuleParser extends AbstractOutputExcelCellParser<String> {

    @Override
    public String id() {
        return OutExcelCellTypeEnum.MODULE.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }

}
