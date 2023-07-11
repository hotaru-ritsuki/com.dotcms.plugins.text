package com.dotcms.util.text;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class StringUtilToolInfo extends ServletToolInfo {

    @Override
    public String getKey() {
        return "StringUtils";
    }

    @Override
    public String getScope() {
        return ViewContext.APPLICATION;
    }

    @Override
    public String getClassname() {
        return StringUtilTool.class.getName();
    }

    @Override
    public Object getInstance(Object initData) {
        StringUtilTool viewTool = new StringUtilTool();
        viewTool.init(initData);

        setScope(ViewContext.APPLICATION);

        return viewTool;
    }

}