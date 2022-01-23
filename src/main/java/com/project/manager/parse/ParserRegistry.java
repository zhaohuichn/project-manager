package com.project.manager.parse;

import com.google.common.collect.Maps;
import com.project.manager.parse.excel.sheet.cell.ExcelCellParser;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ParserRegistry
 *
 * @author ZHAOHUI
 */
@Component
public class ParserRegistry {

    private static final Map<String, ExcelCellParser<String>> inCellParserMap = Maps.newHashMap();
    private static final Map<String, ExcelCellParser<String>> outCellParserMap = Maps.newHashMap();

    public void registryParser(ExcelCellParser<String> parser, int type) {
        if (0 == type) {
            inCellParserMap.put(parser.id(), parser);
        } else {
            outCellParserMap.put(parser.id(), parser);
        }
    }

}
