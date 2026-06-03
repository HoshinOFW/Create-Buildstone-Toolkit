package com.github.hoshinofw.createbuildstonetoolkit.mixin;

import com.github.hoshinofw.buildstonetoolkit.content.common.blocks.unstable.ObserverProxyBlock;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ObserverProxyBlock.class)
public class ObserverProxyBlockMixin implements IWrenchable {
}
