package com.project.manager.entity.source.sheet;

import com.project.manager.entity.source.AbstractInputSource;
import com.project.manager.enums.SourceTypeEnum;

import java.net.URL;
import java.util.List;

/**
 * Excel输入源
 *
 * @author ZHAOHUI
 */
public class StandOutputExcelSheet extends AbstractInputSource {

    private int rowNo;
    /**
     * 需求归属分组
     */
    private int group;
    /**
     * 需求分组二级分组
     */
    private int subModule;

    private String requirementNo;
    /**
     * 需求简称
     */
    private String simpleRequirementName;
    /**
     * 需求名称
     */
    private String requirementName;
    /**
     * 需求排期
     */
    private String requirementSchedule;
    /**
     * 需求参与人安排
     */
    private String memberArrangement;

    private URL documentUrl;

    private List<String> problems;

    private List<String> notes;

    public StandOutputExcelSheet(String abstractPath) {
        super(abstractPath);
    }

    @Override
    public SourceTypeEnum type() {
        return SourceTypeEnum.SHEET;
    }

    @Override
    public String abstractPath() {
        return null;
    }

    @Override
    public URL url() {
        return null;
    }
}
