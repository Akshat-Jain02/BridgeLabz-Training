package com.annotations.depricatedmethods;

public class UseDeprecatedMethod {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        //compiler shows warning
        api.oldFeature(); 
        // recommended method
        api.newFeature(); 
    }
}
