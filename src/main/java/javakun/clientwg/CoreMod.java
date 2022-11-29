package javakun.clientwg;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

import static javakun.clientwg.ModConstants.MC_VERSION;
import static javakun.clientwg.ModConstants.NAME;

@IFMLLoadingPlugin.MCVersion(MC_VERSION)
@IFMLLoadingPlugin.Name(NAME)
@IFMLLoadingPlugin.SortingIndex(1001)
public final class CoreMod implements IFMLLoadingPlugin
{
	private static boolean isObfuscated = false;

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[] { "com.gamerforea.clientwg.asm.ASMTransformer" };
	}

	@Override
	public String getModContainerClass()
	{
		return null;
	}

	@Override
	public String getSetupClass()
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data)
	{
		isObfuscated = (Boolean) data.get("runtimeDeobfuscationEnabled");
	}

	@Override
	public String getAccessTransformerClass()
	{
		return null;
	}

	public static boolean isObfuscated()
	{
		return isObfuscated;
	}
}
