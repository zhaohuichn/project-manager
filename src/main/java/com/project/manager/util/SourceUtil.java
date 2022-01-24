package com.project.manager.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * SourceUtil
 *
 * @author zhaohui
 */
public class SourceUtil {

    public static URL getUrl(String url) {
        try {
            return new File(url).toURI().toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
