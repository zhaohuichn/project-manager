package com.project.manager.parse.excel.sheet.cell.out;

import com.project.manager.enums.OutExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * RequirementName
 *
 * @author ZHAOHUI
 */
public class DocumentUrlParser extends AbstractOutputExcelCellParser<String>{
    @Override
    public String id() {
        return OutExcelCellTypeEnum.DOCUMENT_URL.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}
