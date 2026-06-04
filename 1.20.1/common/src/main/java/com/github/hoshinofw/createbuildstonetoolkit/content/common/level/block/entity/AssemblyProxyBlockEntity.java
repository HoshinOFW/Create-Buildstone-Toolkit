package com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.entity;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.blocks.entity.ProxyBlockEntity;
import com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.AssemblyProxyBlock;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTBlockEntities;
import com.github.hoshinofw.createbuildstonetoolkit.foundation.common.registries.CBTBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.state.BlockState;

public class AssemblyProxyBlockEntity extends ProxyBlockEntity<AssemblyProxyBlock, AssemblyProxyBlockEntity> {

    public AssemblyProxyBlockEntity(BlockPos arg2, BlockState arg3) {
        super(CBTBlockEntities.ASSEMBLY_PROXY.get(), arg2, arg3);
    }

    @Override
    public Class<AssemblyProxyBlockEntity> selfClass() {
        return AssemblyProxyBlockEntity.class;
    }

    @Override
    public AssemblyProxyBlock getBlock() {
        return CBTBlocks.ASSEMBLY_PROXY.get();
    }
}
