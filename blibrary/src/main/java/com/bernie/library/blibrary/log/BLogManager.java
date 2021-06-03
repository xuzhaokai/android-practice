package com.bernie.library.blibrary.log;

import androidx.annotation.NonNull;

public class BLogManager {
    private BLogConfig config;
    private static BLogManager instance;
    private BLogManager(BLogConfig config){
        this.config = config;
    }
    public static BLogManager getInstance(){
        return instance;
    }

    public static void init(@NonNull BLogConfig config) {
        instance = new BLogManager(config);
    }

    public BLogConfig getConfig() {
        return config;
    }
}
