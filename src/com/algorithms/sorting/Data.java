/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.sorting;

/**
 *
 * @author Arun
 */
public class Data implements Comparable<Data>{
    
    private String dataString;
    private Integer dataInteger;

    public Data() {
    }

    public Data(String dataString, Integer dataInteger) {
        this.dataString = dataString;
        this.dataInteger = dataInteger;
    }
    
    

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public Integer getDataInteger() {
        return dataInteger;
    }

    public void setDataInteger(Integer dataInteger) {
        this.dataInteger = dataInteger;
    }
    
    @Override
    public int compareTo(Data o) {
        if(this.dataInteger==o.getDataInteger()){
            return 0;
        }else if(this.dataInteger>o.getDataInteger()){
            return 1;
        }else if(this.dataInteger < o.getDataInteger()){
            return -1;
        }else{
            return  this.dataString.compareTo(o.getDataString());
        }
    }
    
}
