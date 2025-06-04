package com.example.mcserversideai;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mcserversideai implements ModInitializer {
    public static final String MOD_ID = "mcserversideai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Mcserversideai mod initialized!");
    }
}
