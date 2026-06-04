package com.github.hoshinofw.createbuildstonetoolkit.neoforge.registries;

import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTTooltips;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientTooltipComponentFactoriesEvent;

@EventBusSubscriber(value = Dist.CLIENT)
public class CBTNeoForgeEvents {

    @SubscribeEvent
    public static void onTooltipRegistration(RegisterClientTooltipComponentFactoriesEvent event) {
        CBTTooltips.register();
    }

}
