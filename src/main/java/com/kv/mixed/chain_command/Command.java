package com.kv.mixed.chain_command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public abstract class Command {

    public abstract String execute(CommandVO vo);

    // 建立链表
    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {
        // 取出所有的命令名下的子类
        List<Class> classes = ClassUtils.getSonClass(abstractClass);

        // 存放命令的实例，并建立链表关系
        List<CommandName> commandNames = new ArrayList<>();
        for (Class clazz : classes) {
            CommandName commandName = null;
            try {
                // 产生实例
                commandName = (CommandName) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                // TODO 异常处理
            }

            // 建立链表
            if (commandNames.size() > 0) {
                commandNames.get(commandNames.size() - 1).setNext(commandName);
            }
            commandNames.add(commandName);
        }
        return commandNames;
    }

}
