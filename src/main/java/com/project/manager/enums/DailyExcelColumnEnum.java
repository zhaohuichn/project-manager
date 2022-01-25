package com.project.manager.enums;

/**
 * OutExcelCellTypeEnum
 *
 * @author ZHAOHUI
 */
public enum DailyExcelColumnEnum {

    ROW_NO(0, "序号"),
    MODULE(1, "需求所属模块"),
    REQUIREMENT_NO(2, "子序号"),
    REQUIREMENT_NAME(3, "需求名称"),
    REQUIREMENT_STATUS(4, "需求状态"),
    REQUIREMENT_SCHEDULE(5, "需求排期"),
    MEMBER_TOTAL(6, "资源占用"),
    MEMBER(7, "需求相关人"),
    DOCUMENT_URL(8, "需求JIRA地址"),
    CONFIRM_USER(9, "确认人"),
    SCHEDULE(10, "客观周期"),
    REMARK(11, "问题&备注");

    private int index;

    private String name;

    DailyExcelColumnEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
