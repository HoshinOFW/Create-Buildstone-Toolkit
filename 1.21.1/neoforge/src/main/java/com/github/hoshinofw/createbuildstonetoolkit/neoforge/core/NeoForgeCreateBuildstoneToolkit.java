package com.github.hoshinofw.createbuildstonetoolkit.neoforge.core;

import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core.CreateBuildstoneToolkit;
import net.neoforged.fml.common.Mod;

@Mod(CreateBuildstoneToolkit.MOD_ID)
public final class NeoForgeCreateBuildstoneToolkit {

    public NeoForgeCreateBuildstoneToolkit() {
        CreateBuildstoneToolkit.init();
    }
}