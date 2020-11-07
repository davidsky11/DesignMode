package com.kv.mixed.chain_command;

import com.google.common.collect.Sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

/**
 * Client
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();

        Set<String> quitCmdSet = Sets.newHashSet("quit", "exit");
        while (true) {
            // UNIX下的默认提示符号
            System.out.print("#");
            // 捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            // 输入quit或exit则退出
            if (quitCmdSet.contains(input)) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }

}
