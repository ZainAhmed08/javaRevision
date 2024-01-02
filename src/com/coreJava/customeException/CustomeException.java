package com.coreJava.customeException;

public class CustomeException {
    public static void main(String[] args) throws  AgeLessthanZeroException {
        validateAge(-1);
    }

    public static void validateAge(int age) throws  AgeLessthanZeroException{
        if(age < 0){
            throw new AgeLessthanZeroException("The age cannot be less than zero !");
        }
    }
}
