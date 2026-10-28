package dev.boreo.settingshub;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Settings Hub",
	description = "Apply community activity bundles and colour themes",
	tags = {"settings", "config", "bundles", "themes", "colours", "colors"}
)
public class SettingsHubPlugin extends Plugin
{
	@Override
	protected void startUp() throws Exception
	{
		log.debug("Settings Hub started");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.debug("Settings Hub stopped");
	}

	@Provides
	SettingsHubConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SettingsHubConfig.class);
	}
}
