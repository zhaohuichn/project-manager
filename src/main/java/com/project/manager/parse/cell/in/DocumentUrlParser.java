package com.project.manager.parse.cell.in;

import com.project.manager.enums.InputExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * TodoMemoParser
 *
 * @author ZHAOHUI
 */
public class DocumentUrlParser extends AbstractInputExcelCellParser<String> {
    @Override
    public String id() {
        return InputExcelCellTypeEnum.DOCUMENT_URL.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}