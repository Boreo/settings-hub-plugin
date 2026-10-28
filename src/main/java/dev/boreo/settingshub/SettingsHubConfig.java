package dev.boreo.settingshub;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;

@ConfigGroup(SettingsHubConfig.GROUP)
public interface SettingsHubConfig extends Config
{
	String GROUP = "settingshub";
}
