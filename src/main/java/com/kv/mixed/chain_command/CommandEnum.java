package com.kv.mixed.chain_command;

import java.util.ArrayList;
import java.util.List;

/**
 * CommandEnum
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public enum CommandEnum {
    ls(""),
    df("");

    private String value = "";
    // 定义构造函数
    private CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (CommandEnum ce : values()) {
            names.add(ce.name());
        }
        return names;
    }

}
