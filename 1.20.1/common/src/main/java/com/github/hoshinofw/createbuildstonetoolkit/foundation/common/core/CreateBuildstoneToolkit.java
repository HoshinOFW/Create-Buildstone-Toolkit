package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core;

import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTBlockEntities;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTBlocks;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateBuildstoneToolkit {

    public static final String MOD_ID = "createbuildstonetoolkit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        CBTBlocks.register();
        CBTItems.register();
        CBTBlockEntities.register();
    }

}
