package com.leviathan143.ellipsis;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.leviathan143.ellipsis.Ellipsis.Constants;
import com.leviathan143.ellipsis.common.CommonProxy;
import com.leviathan143.ellipsis.common.blocks.EllipsisBlocks;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION, acceptedMinecraftVersions = Constants.MCVERSION)
public class Ellipsis 
{

	public class Constants
	{
		public static final String MODNAME = "...(aka Ellipsis)";
		public static final  String  MODID = "ellipsis";
		public static final  String  VERSION = "0.1";
		public static final  String  MCVERSION = "1.7.10";
		public static final String COMMONPROXY_PATH="com.leviathan143.ellipsis.common.CommonProxy";
		public static final String CLIENTPROXY_PATH="com.leviathan143.ellipsis.client.ClientProxy";
	}

	@SidedProxy(clientSide = Constants.CLIENTPROXY_PATH,
			serverSide=Constants.COMMONPROXY_PATH)
	public static CommonProxy proxy;

	@Mod.Instance(Constants.MODID)
	public static Ellipsis instance;
	
	public static CreativeTabs ellipsisTab =  new CreativeTabs(Constants.MODID) 
	{	
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item.getItemFromBlock(EllipsisBlocks.omnidirectionalMuffler);
		}
	};

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}

}
