package com.kv.mixed.chain_command;

import java.util.ArrayList;

/**
 * CommandVO
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class CommandVO {

    // 定义参数名和参数的分隔符号，一般是空格
    public final static String DIVIDE_FLAG = " ";

    // 定义参数前的符号，UNIX 一般是 - ，如 ls -la
    public final static String PREFIX = "-";

    // 命令名
    private String commandName = "";
    // 参数列表

    private ArrayList<String> paramList = new ArrayList<>();
    // 操作数列表
    private ArrayList<String> dataList = new ArrayList<>();

    // 通过构造函数传递进来命令
    public CommandVO(String commandStr) {
        // 常规判断  TODO 拆分命令到 paramList 和 dataList

    }

    public ArrayList<String> getParamList() {
        return paramList;
    }

    public ArrayList<String> getDataList() {
        return dataList;
    }

    public String getCommandName() {
        return commandName;
    }
}
