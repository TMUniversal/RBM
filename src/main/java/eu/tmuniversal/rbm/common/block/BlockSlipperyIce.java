/*
 * This class is distributed as part of the RBM Mod.
 * Get the Source Code on github:
 * https://github.com/TMUniversal/RBM
 *
 * RBM is Open Source and distributed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0
 * International Public License (CC BY-NC-SA 4.0):
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package eu.tmuniversal.rbm.common.block;

import eu.tmuniversal.rbm.common.lib.LibBlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

import static eu.tmuniversal.rbm.common.lib.TooltipHelper.blockTooltip;

public class BlockSlipperyIce extends Block {

  public BlockSlipperyIce() {
    super(ModBlock.getDefaultProperties(Material.PACKED_ICE)
      .slipperiness(1.0F) // TODO: find good number
      .hardnessAndResistance(0.5F)
      .sound(SoundType.GLASS));
  }

  public BlockSlipperyIce(Properties properties) {
    super(properties);
  }

  @Override
  @ParametersAreNonnullByDefault
  public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    super.addInformation(stack, worldIn, tooltip, flagIn);
    tooltip.add(blockTooltip(LibBlockNames.SLIPPERY_ICE));
  }
}
