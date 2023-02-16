package com.atiguigu.spring.proxy;

public class CalculatorStaticProxy implements Calculator{
    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        int result = 0;
        try {
            System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
            result = target.add(i, j);
            System.out.println("[日志] add 方法结束了，结果是：" + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

        }
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        int result = target.sub(i, j);
        System.out.println("[日志] sub 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
        int result = target.mul(i, j);
        System.out.println("[日志] mul 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int result = target.div(i, j);
        System.out.println("[日志] div 方法结束了，结果是：" + result);
        return result;
    }
}
