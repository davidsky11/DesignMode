package com.kv.mixed.chain_command;

/**
 * LS
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class LS extends AbstractLS {

    // 最简单的ls命令
    @Override
    public String echo(CommandVO vo) {
        return AbstractLS.DEFAULT_PARAM;
    }

    @Override
    protected String getOperateParam() {
        return null;
    }
}
