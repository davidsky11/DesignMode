package com.kv.mixed.chain_command;

/**
 * LS_L
 *
 * @author KVLT
 * @date 2020-11-07.
 */
public class LS_L extends AbstractLS {

    @Override
    protected String getOperateParam() {
        return AbstractLS.L_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return null;
    }
}
