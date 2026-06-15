package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.mixin;

import com.github.hoshinofw.buildstonetoolkit.foundation.common.blocks.entity.ProxyBlockEntity;
import com.github.hoshinofw.createbuildstonetoolkit.content.common.level.block.AssemblyProxyBlock;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.simibubi.create.content.contraptions.Contraption;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Queue;
import java.util.Set;

@Mixin(value = Contraption.class, remap = false)
public abstract class ContraptionMixin {

    @Inject(method = "moveBlock",
            at = @At(value = "HEAD", remap = true))
    protected void beforeMoveBlock(Level world, @Nullable Direction forcedDirection, Queue<BlockPos> frontier, Set<BlockPos> visited, CallbackInfoReturnable<Boolean> cir
    ) {
        BlockPos pos = frontier.peek();
        if (pos == null) {return;}
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof AssemblyProxyBlock assemblyProxyBlock) {
            if (!assemblyProxyBlock.isPowered(state)) {
                BlockPos targetPos = assemblyProxyBlock.getLinkedAbsPos(world, pos);
                if (!visited.contains(targetPos)) {
                    frontier.add(targetPos);
                }
            }
        }
    }
}
