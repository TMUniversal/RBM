/*
 * This class is distributed as part of the RBM Mod.
 * Get the Source Code in github:
 * https://github.com/TMUniversal/RBM
 *
 * RBM is Open Source and distributed under the
 * GPL-3.0 License: https://www.gnu.org/licenses/gpl-3.0.en.html
 */
package eu.tmuniversal.rbm.common.item;

import eu.tmuniversal.rbm.common.lib.LibItemNames;
import eu.tmuniversal.rbm.common.lib.TooltipHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemTeaLeaf extends ModItem {
  public ItemTeaLeaf() {
    super(ModItem.defaultBuilder().rarity(Rarity.UNCOMMON));
  }

  @Override
  public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    super.addInformation(stack, worldIn, tooltip, flagIn);
    tooltip.add(TooltipHelper.itemTooltip(LibItemNames.TEA_LEAF));
  }
}
