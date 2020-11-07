package com.kv.mixed.chain_command;

/**
 * LS_A
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class LS_A extends AbstractLS {

    @Override
    protected String getOperateParam() {
        return AbstractLS.A_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return null;
    }
}
