# Settings Hub plugin

RuneLite plugin that applies Settings Hub activity bundles and colour themes inside the client. Bundle and theme formats follow the schemas in the `schemas/` folder of the `boreo/runelite-settings-hub` monorepo; match them exactly and change them there first.

- Package: `dev.boreo.settingshub`. Config group: `settingshub` (`SettingsHubConfig.GROUP`).
- Build with JDK 17: `./gradlew build`. The Gradle wrapper does not run on newer JDKs; the code targets Java 11.

@AGENTS.md
