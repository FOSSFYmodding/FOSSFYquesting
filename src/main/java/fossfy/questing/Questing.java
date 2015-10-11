package fossfy.questing;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fossfy.questing.reference.Metadata;
import fossfy.questing.reference.Reference;

@Mod(name = Reference.NAME, modid = Reference.ID, version = Reference.VERSION_FULL)
public class Questing
{
    @Mod.Metadata(Reference.ID)
    public static ModMetadata metadata;

    @Mod.Instance(value = Reference.ID)
    public static Questing INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        metadata = Metadata.init(metadata);
    }
}
