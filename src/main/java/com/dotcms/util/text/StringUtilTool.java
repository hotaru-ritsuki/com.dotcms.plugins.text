package com.dotcms.util.text;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.tools.view.tools.ViewTool;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilTool extends StringUtils implements ViewTool {

    @Override
    public void init(Object arg0) {}

    public static String replaceMultilineRegex(String str, String regex, String substitution) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);

        // The substituted value will be contained in the result variable
        return matcher.replaceAll(substitution);
    }

    public static Map<String, String> regexToMap(String str, String regex) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(str);


        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        try {
            // The substituted value will be contained in the result variable
            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                linkedHashMap.put(key, value);
            }
            return linkedHashMap;
        } catch (Exception e){
            return linkedHashMap;
        }
    }
}
