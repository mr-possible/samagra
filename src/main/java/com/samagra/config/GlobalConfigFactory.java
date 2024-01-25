package com.samagra.config;

import org.aeonbits.owner.ConfigCache;

public final class GlobalConfigFactory {
    private GlobalConfigFactory() {
    }

    public static GlobalConfig getConfig() {
        return ConfigCache.getOrCreate(GlobalConfig.class);
    }
}
