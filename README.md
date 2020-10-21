# javafx-filepicker

Using JavaFX to pick a file from the local drive.

## Setting up JavaFX with Intellij

### Setting up Java 11

1. Download and install OpenJDK 11 (LTS) from https://adoptopenjdk.net/
Press on your windows key or click the windows icon, then search for "path"
2. Once the System Properties window is open, click on Environment Varaibles.
3. Under System Varaibles, verify that there is a "JAVA_HOME" variable and it's set to "C:\Program Files\AdoptOpenJDK\jdk-11.x.x.xx-hotspot"
4. Scroll down to the "Path" variable and double click it.
5. Verify that the AdoptOpenJDK variable is above all other JDKs installed on your system.
6. Click on ok and apply the new environment variable settings then close the System Properties window.
7. Open a command prompt and type "where java"
8. Verify that AdoptOpenJDK shows up on screen.
9. Type "java --version"
10. Verify that "openjdk 11.x.x" shows up on screen.

### Setting up JavaFX

1. Add the following dependencies to pom.xml
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-base -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-base</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-controls -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-fxml -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-graphics -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-media -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-media</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-swing -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-swing</artifactId>
            <version>11</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.openjfx/javafx-web -->
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-web</artifactId>
            <version>11</version>
        </dependency>
    </dependencies>
```

2. Go to https://gluonhq.com/products/scene-builder/ and download the Scene Builder installer for your operating system.

### Setting up Intellij

1. Go to File > Settings > Plugins
2. Install JavaFX Runtime for Plugins
3. Right click on the resources folder and create a fxml file.
4. Double click to open the fxml file.
5. Near the bottom of the screen click on the tab for Scene Builder.
6. When trying to open the Scene Builder for the first time, a warning will show near the top of the screen asking to install Scene Builder.
