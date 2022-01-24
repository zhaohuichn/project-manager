package com.project.manager.source;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * 资源加载起
 * <p>
 * 任意
 *
 * @author zhaohui
 */
public class SourceLoader {


    public static InputStream load(URL url) {
        return load(url.getFile());
    }

    public static InputStream load(String path) {
        try {
            return new FileInputStream(path);
        } catch (Exception e) {
            return null;
        }
    }

}
