# String Utilities Plugin

This plugin provides a Velocity viewtool that is intended to provide String Utilities.

## Build

Requires Java 25 (the Java version dotCMS core runs on). Built against dotCMS core 26.11.x.

```sh
./mvnw package
```

The OSGi bundle is written to `target/com.dotcms.plugins.text-<version>.jar`. Upload it through the dotCMS Plugins portlet or drop it into the `felix/load` folder.
