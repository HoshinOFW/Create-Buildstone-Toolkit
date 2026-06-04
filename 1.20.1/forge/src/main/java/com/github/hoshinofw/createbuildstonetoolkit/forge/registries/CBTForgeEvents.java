package com.github.hoshinofw.createbuildstonetoolkit.forge.registries;

import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTTooltips;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBTForgeEvents {

    @SubscribeEvent
    public static void onTooltipRegistration(RegisterClientTooltipComponentFactoriesEvent event) {
        CBTTooltips.register();
    }

}
