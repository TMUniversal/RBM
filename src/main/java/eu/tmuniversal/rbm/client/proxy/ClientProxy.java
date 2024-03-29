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
package eu.tmuniversal.rbm.client.proxy;

import eu.tmuniversal.rbm.client.render.entity.RendererSnowGiant;
import eu.tmuniversal.rbm.common.core.proxy.IProxy;
import eu.tmuniversal.rbm.common.entity.ModEntities;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ClientProxy implements IProxy {

  private static void registerEntityRenderers(net.minecraft.client.renderer.ItemRenderer itemRendererIn) {
    RenderingRegistry.registerEntityRenderingHandler(ModEntities.SNOW_GIANT, manager -> new RendererSnowGiant(manager, ModEntities.SNOW_GIANT_SCALE));
    //                                                                                                                                                                Should emit light?
    RenderingRegistry.registerEntityRenderingHandler(ModEntities.BIG_SNOWBALL, manager -> new SpriteRenderer<>(manager, itemRendererIn, ModEntities.SNOW_GIANT_SCALE, false));
  }

  @Override
  public void registerHandlers() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    modBus.addListener(this::clientSetup);

//    IEventBus forgeBus = MinecraftForge.EVENT_BUS;
  }

  private void clientSetup(FMLClientSetupEvent event) {
    registerEntityRenderers(event.getMinecraftSupplier().get().getItemRenderer());
  }
}
