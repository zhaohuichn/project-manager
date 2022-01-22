package com.project.manager.parse.out;

import com.project.manager.enums.OutExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * RowNoParser
 *
 * @author ZHAOHUI
 */
public class MemberParser extends AbstractOutputExcelCellParser<String> {

    @Override
    public String id() {
        return OutExcelCellTypeEnum.MEMBER.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : "@" +rawData.toString();
    }

}
