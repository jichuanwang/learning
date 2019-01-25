package com.dolphin.learning;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author wangjichuan
 * @description
 * @date 2019-01-08 19:26
 **/
public class SimpleTest {

    @Test
    public void testIntegerMax(){
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void test(){

        List<Long> a = new ArrayList<>();
        a.add(10L);
        a.add(14L);
        a.add(16L);
        a.add(13L);
        a.add(15L);
        a.add(11L);
        List<Long> b = new ArrayList<>();
        b.add(10L);
        a.add(24L);
        a.add(9L);
        b.add(23L);
        a.add(35L);
        b.add(21L);
        a.addAll(b);
        long start = System.currentTimeMillis();
        for(int i=0;i<1;i++){
            collectionSub(a,b);
        }
        for(Long l : a){
            System.out.println(l);
        }
        long end = System.currentTimeMillis();
        System.out.println("end - start ="+(end-start) );
    }
    public void collectionSub2(List<Long> a,List<Long> b){
        List<Long> result = new ArrayList<>();
        Set<Long> tmpSet = new HashSet<>();
        a.addAll(b);
        for(Long l : a){
            if(!tmpSet.contains(l)){
                result.add(l);
                tmpSet.add(l);
            }
        }
        a = result;
    }
    public void collectionSub(List<Long> a,List<Long> b){
        b.removeAll(a);
        a.addAll(b);
    }
}
