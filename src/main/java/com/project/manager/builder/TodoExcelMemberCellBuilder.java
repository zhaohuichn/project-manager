package com.project.manager.builder;

import com.google.common.collect.Maps;
import com.project.manager.source.excel.cell.ExcelCell;

import java.util.Map;

/**
 * 经办人列值构造器
 * <p>
 * 经办人标准输入格式为：岗位：姓名，每行一人
 * 经办人将按照所在部门分组依次取值，每个部门取1个人作为经办人
 *
 * @author zhaohui
 */
public class TodoExcelMemberCellBuilder extends AbstractExcelCellValueBuilder<Map<String, String>> {

    public TodoExcelMemberCellBuilder(ExcelCell srcCell) {
        super(srcCell);
    }

    @Override
    public Map<String, String> build() {
        if (null == srcCell) {
            return Maps.newHashMap();
        }

        Map<String, String> rsMap = Maps.newHashMap();
        String[] memberArray = srcCell.getValue().split("\n");
        for (String standardMember : memberArray) {
            String[] stdMem = standardMember.split("：");
            String post = stdMem[0];
            String memName = stdMem[1];
            if (!rsMap.containsKey(post)) {
                rsMap.put(post, memName);
            }
        }

        return rsMap;
    }

}
