package com.project.manager.parse.in;

import com.project.manager.enums.InputExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * TodoMemoParser
 *
 * @author ZHAOHUI
 */
public class ModuleParser extends AbstractInputExcelCellParser<String> {
    @Override
    public String id() {
        return InputExcelCellTypeEnum.MODULE.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}