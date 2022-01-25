package com.project.manager.enums;

/**
 * OutExcelCellTypeEnum
 *
 * @author ZHAOHUI
 */
public enum TodoExcelColumnEnum {

    MEMBER(0, "经办人"),
    MODULE(1, "所属模块"),
    REQUIREMENT(2, "需求名称"),
    DOCUMENT_URL(3, "JIRA地址"),
    TODO_TYPE(4, "待办类型"),
    TODO_CONTENT(5, "待办事项");


    private int index;

    private String name;

    TodoExcelColumnEnum(int index, String name) {
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
