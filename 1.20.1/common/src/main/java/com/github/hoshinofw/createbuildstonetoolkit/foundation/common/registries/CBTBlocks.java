package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries;



import com.github.hoshinofw.buildstonetoolkit.foundation.common.core.BuildstoneToolkit;
import com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.AssemblyProxyBlock;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.core.CreateBuildstoneToolkit;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class CBTBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CreateBuildstoneToolkit.MOD_ID, Registries.BLOCK);

    public static final Supplier<AssemblyProxyBlock> ASSEMBLY_PROXY = BLOCKS.register("assembly_proxy",
            () -> new AssemblyProxyBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 6.0f)
                    .sound(SoundType.STONE)));

    public static void register() {
        BLOCKS.register();
    }

}
