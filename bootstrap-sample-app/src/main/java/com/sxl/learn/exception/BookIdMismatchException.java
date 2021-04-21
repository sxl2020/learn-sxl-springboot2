package com.sxl.learn.exception;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException(){

    }

    public BookIdMismatchException(String msg,Throwable cause){
        super(msg,cause);
    }
}
