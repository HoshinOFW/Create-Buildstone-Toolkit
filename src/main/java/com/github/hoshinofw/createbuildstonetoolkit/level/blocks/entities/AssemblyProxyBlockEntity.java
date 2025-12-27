package com.github.hoshinofw.createbuildstonetoolkit.level.blocks.entities;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.blocks.entity.unstable.IdProxyBlockEntity;
import com.github.hoshinofw.createbuildstonetoolkit.registries.CBTBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.state.BlockState;

public class AssemblyProxyBlockEntity extends IdProxyBlockEntity<AssemblyProxyBlockEntity> {
    public static final String NBT_REL_POS_KEY = "buildstonetoolkit$relativeTarget";

    public AssemblyProxyBlockEntity(BlockPos arg2, BlockState arg3) {
        super(CBTBlockEntities.ASSEMBLY_PROXY.get(), arg2, arg3);
    }

    @Override
    public Class<AssemblyProxyBlockEntity> selfClass() {
        return AssemblyProxyBlockEntity.class;
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.putLong(NBT_REL_POS_KEY, this.getLinkedRelPos().asLong());
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        this.setLinkedRelPos(nbt.getLong(NBT_REL_POS_KEY));
    }
}
