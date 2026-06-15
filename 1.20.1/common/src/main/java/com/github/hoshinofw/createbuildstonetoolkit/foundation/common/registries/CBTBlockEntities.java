package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.registries.BuildstoneBlockEntities;
import com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.entity.AssemblyProxyBlockEntity;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core.CreateBuildstoneToolkit;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class CBTBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(CreateBuildstoneToolkit.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final Supplier<BlockEntityType<AssemblyProxyBlockEntity>> ASSEMBLY_PROXY = BLOCK_ENTITY_TYPES.register("assembly_proxy",
            () -> BlockEntityType.Builder.of(
                    AssemblyProxyBlockEntity::new,
                    CBTBlocks.ASSEMBLY_PROXY.get())
                    .build(null)
    );

    public static void register() {
        BLOCK_ENTITY_TYPES.register();
        BuildstoneBlockEntities.registerProxyType(ASSEMBLY_PROXY);
    }

}
