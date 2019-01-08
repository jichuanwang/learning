package com.dolphin.learning.thrift;

import com.dolphin.learning.rpc.iface.Calculator;
import com.dolphin.learning.rpc.impl.CalculatorHandler;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * @author wangjichuan
 * @description
 * @date 2019-01-02 19:42
 **/
public class ThriftServerTest {

    public static void main(String[] args) {
        try {
            Calculator.Processor processor = new Calculator.Processor(new CalculatorHandler());

            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
            System.out.println("starting the simple server.....");
            server.serve();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
