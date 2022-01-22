package com.project.manager.parse.out;

import com.project.manager.enums.OutExcelCellTypeEnum;
import org.springframework.util.ObjectUtils;

/**
 * TodoMemoParser
 *
 * @author ZHAOHUI
 */
public class TodoMemoParser extends AbstractOutputExcelCellParser<String> {
    @Override
    public String id() {
        return OutExcelCellTypeEnum.TODO_MEMO.toString();
    }

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }
}