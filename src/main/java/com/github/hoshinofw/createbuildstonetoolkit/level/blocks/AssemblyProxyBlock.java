package com.github.hoshinofw.createbuildstonetoolkit.level.blocks;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.blocks.IdProxyBlock;
import com.github.hoshinofw.createbuildstonetoolkit.level.blocks.entities.AssemblyProxyBlockEntity;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.piston.PistonMovingBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Optional;

@ParametersAreNonnullByDefault
public class AssemblyProxyBlock extends IdProxyBlock<AssemblyProxyBlockEntity> implements IWrenchable {
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public AssemblyProxyBlock(BlockBehaviour.Properties arg) {
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