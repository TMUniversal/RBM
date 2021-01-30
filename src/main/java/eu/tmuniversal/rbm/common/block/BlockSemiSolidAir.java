package eu.tmuniversal.rbm.common.block;

import eu.tmuniversal.rbm.common.lib.LibBlockNames;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

import static eu.tmuniversal.rbm.common.lib.TranslationKeyHelper.blockTooltip;

public class BlockSemiSolidAir extends BlockSolidAirBase {

  public static final Properties PROPERTIES = BlockSolidAirBase.PROPERTIES.doesNotBlockMovement();

  public BlockSemiSolidAir() {
    super(PROPERTIES);
  }

  @Override
  public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    super.addInformation(stack, worldIn, tooltip, flagIn);
    tooltip.add(blockTooltip(LibBlockNames.SEMI_SOLID_AIR));
  }
}