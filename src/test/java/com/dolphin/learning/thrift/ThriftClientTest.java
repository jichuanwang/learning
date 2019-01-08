package com.dolphin.learning.thrift;

import com.dolphin.learning.rpc.iface.Calculator;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author wangjichuan
 * @description
 * @date 2019-01-02 18:25
 **/
public class ThriftClientTest {

    public static void main(String[] args) {
       try {
           TTransport tTransport = new TSocket("localhost",9090);
           tTransport.open();

           TProtocol protocol = new TBinaryProtocol(tTransport);
           Calculator.Client client = new Calculator.Client(protocol);
           perform(client);
           tTransport.close();
       }catch (Exception e){
           e.printStackTrace();
       }

    }

    private static void perform(Calculator.Client client) throws TException {
        client.sum(100L,20L);
    }

}
