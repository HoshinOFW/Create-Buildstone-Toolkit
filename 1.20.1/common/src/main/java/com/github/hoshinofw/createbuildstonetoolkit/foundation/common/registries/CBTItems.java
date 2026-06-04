package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries;

import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core.CreateBuildstoneToolkit;
import dev.architectury.extensions.injected.InjectedItemPropertiesExtension;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CBTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CreateBuildstoneToolkit.MOD_ID, Registries.ITEM);

    public static final Supplier<BlockItem> ASSEMBLY_PROXY = ITEMS.register("assembly_proxy",
            () -> new BlockItem(CBTBlocks.ASSEMBLY_PROXY.get(),
                    ((InjectedItemPropertiesExtension) new Item.Properties()).arch$tab(CreativeModeTabs.REDSTONE_BLOCKS)
            ));

    public static void register() {
        ITEMS.register();
    }
}
