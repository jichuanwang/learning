package com.dolphin.learning.rpc.impl;

import com.dolphin.learning.rpc.iface.Calculator;
import org.apache.thrift.TException;

/**
 * @author wangjichuan
 * @description
 * @date 2019-01-02 19:45
 **/
public class CalculatorHandler implements Calculator.Iface {
    @Override
    public void sum(long a, long b) throws TException {
        System.out.println("a="+a+",b="+b+" a+b="+(a+b));
    }
}
