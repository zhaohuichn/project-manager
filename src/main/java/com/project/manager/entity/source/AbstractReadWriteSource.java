package com.project.manager.entity.source;

import java.net.URL;

/**
 * AbstractReadWriteSource
 *
 * @author ZHAOHUI
 */
public abstract class AbstractReadWriteSource implements InputSource, OutputSource {

    private final InputSource inputSource;

    private final OutputSource outputSource;

    public AbstractReadWriteSource(InputSource is, OutputSource os) {
        this.inputSource = is;
        this.outputSource = os;
    }

    @Override
    public URL url() {
        return this.inputSource.url();
    }

    public URL getInputUrl() {
        return inputSource.url();
    }

    public URL getOutputUrl() {
        return outputSource.url();
    }
}
