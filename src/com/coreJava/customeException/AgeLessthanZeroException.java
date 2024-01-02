package com.coreJava.customeException;

public class AgeLessthanZeroException  extends  Exception{
    public AgeLessthanZeroException(){}
    public AgeLessthanZeroException(String message){
        super(message);
    }
}
