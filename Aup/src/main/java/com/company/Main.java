package com.company;

public class Main{
    public static void main(String[] args) throws Throwable {
        Updater updaterObject=new Updater();
        updaterObject.startUpdate();
        int vno=(int) updaterObject.dloadsystemVersion();
        System.out.println(vno);
        System.exit(0);
    }

}

