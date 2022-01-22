package com.project.manager.parse;

import com.project.manager.parse.out.AbstractOutputExcelCellParser;
import org.springframework.util.ObjectUtils;

/**
 * RowNoParser
 *
 * @author ZHAOHUI
 */
public class SubModuleParser extends AbstractOutputExcelCellParser<String> {

    @Override
    public String parse(Object rawData) {
        return ObjectUtils.isEmpty(rawData) ? "" : rawData.toString();
    }

}
