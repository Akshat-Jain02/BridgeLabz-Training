package com.annotations.suppressuncheckedwarning;
import java.util.ArrayList;
import java.util.List;

public class SuppressUncheckedWarning {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Using raw type 
        List names = new ArrayList();

        
        names.add("Akshat");
        names.add("Jain");

        
        for (Object obj : names) {
            String name = (String) obj;
            System.out.println(name);
        }
    }
}
