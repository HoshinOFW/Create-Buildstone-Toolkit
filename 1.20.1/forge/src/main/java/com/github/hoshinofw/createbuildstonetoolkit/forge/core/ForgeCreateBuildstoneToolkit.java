package com.github.hoshinofw.createbuildstonetoolkit.forge.core;

import com.github.hoshinofw.createbuildstonetoolkit.forge.registries.CBTForgeEvents;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core.CreateBuildstoneToolkit;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Objects;

@Mod(CreateBuildstoneToolkit.MOD_ID)
public final class ForgeCreateBuildstoneToolkit {


    public ForgeCreateBuildstoneToolkit() {
        IEventBus modBus = Objects.requireNonNull(FMLJavaModLoadingContext.get().getModEventBus());
        EventBuses.registerModEventBus(CreateBuildstoneToolkit.MOD_ID, modBus);

        CreateBuildstoneToolkit.init();
    }
}