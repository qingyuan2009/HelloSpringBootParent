package com.rui.demo.service;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static Random random = new Random();
    
    @Async  //�첽ִ��
    @Override
    public Future<String> doTask1() throws Exception {
        System.out.println("����һ��ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("����һ��������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("����һ����");
    }

    @Async
    @Override
    public Future<String> doTask2() throws Exception {
        System.out.println("�������ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("�������������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("���������");
    }

    @Async
    @Override
    public Future<String> doTask3() throws Exception {
        System.out.println("��������ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("��������������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("����������");
    }

}
