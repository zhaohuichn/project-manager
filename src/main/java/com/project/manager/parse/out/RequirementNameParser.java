package com.project.manager.parse.out;

import com.project.manager.enums.OutExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * RequirementName
 *
 * @author ZHAOHUI
 */
public class RequirementNameParser extends AbstractOutputExcelCellParser<String>{
    @Override
    public String id() {
        return OutExcelCellTypeEnum.REQUIREMENT.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}
