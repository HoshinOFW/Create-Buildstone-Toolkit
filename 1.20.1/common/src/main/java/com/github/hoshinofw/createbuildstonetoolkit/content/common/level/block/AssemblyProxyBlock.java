package com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.blocks.ProxyBlock;
import com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.entity.AssemblyProxyBlockEntity;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class AssemblyProxyBlock extends ProxyBlock<AssemblyProxyBlock, AssemblyProxyBlockEntity> implements IWrenchable {
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public AssemblyProxyBlock(Properties arg) {
        super(arg, AssemblyProxyBlockEntity.class);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(POWERED, false));
    }

    public boolean isPowered(BlockState state) {
        return state.getValue(POWERED);
    }

    private void setPowered(@NotNull Level level, BlockPos proxyPos, BlockState proxyState, boolean powered) {
        if (proxyState.getBlock() instanceof AssemblyProxyBlock) {
            level.setBlock(proxyPos, proxyState.setValue(POWERED, level.hasNeighborSignal(proxyPos)), Block.UPDATE_ALL);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(POWERED);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new AssemblyProxyBlockEntity(pos, state);
    }

    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos pos2, boolean bl) {
        setPowered(level, pos, state, level.hasNeighborSignal(pos));
    }
}
