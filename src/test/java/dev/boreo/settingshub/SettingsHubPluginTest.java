package dev.boreo.settingshub;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SettingsHubPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SettingsHubPlugin.class);
		RuneLite.main(args);
	}
}
