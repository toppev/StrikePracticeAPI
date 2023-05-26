## StrikePracticeAPI


## [JavaDoc here](http://api.strikepractice.ga/)

For example:  
[StrikePracticeAPI.java](https://api.strikepractice.ga/doc/ga/strikepractice/api/StrikePracticeAPI.html)  
[StrikePractice Events](https://api.strikepractice.ga/doc/ga/strikepractice/events/package-summary.html)


## Installation

Download the API jar to use in your own plugins here:
<http://api.strikepractice.ga/strikepractice-api.jar>

Create a folder called libs (or whatever you want) in your plugin folder and put the jar there.

```sh
wget http://api.strikepractice.ga/strikepractice-api.jar -P libs
```

Now include the .jar in your pom.xml or build.gradle* file.

### Maven

```xml
<dependencies>
    <!-- Your other dependencies -->
    <dependency>
        <groupId>ga.strikepractice</groupId>
        <artifactId>strikepractice-api</artifactId>
        <systemPath>${project.basedir}/libs/strikepractice-api.jar</systemPath>
    </dependency>
</dependencies>
```

### Gradle (Kotlin DSL)

```kotlin

repositories {
    // ...
    // Include libs directory as a repository
    flatDir { dirs("libs") }
}

dependencies {
    // ...
    // Add the API as a compileOnly dependency
    compileOnly("ga.strikepractice:strikepractice-api")
}
```

## Getting started with the API

**Get current instance of the StrikePracticeAPI with the following:**

```java
StrikePracticeAPI api = StrikePractice.getAPI();
```
Now you can do anything with the api. For example

```java
Player player = ...
Player opponent = api.getDuelOpponent(player);
if (opponent != null) {
  opponent.sendMessage("Hello opponent!");
}
```

You will find most useful methods in the ga.strikepractice.api.StrikePracticeAPI

There are also custom Bukkit events for each fight type and more. You will find these under ga.strikepractice.events. Just use them like any other Bukkit event.
For example:
```java
    
@EventHandler
public void onFightEnd(DuelEndEvent event) {
    Player p = event.getWinner();
    if(event.getFight().getKit().isElo()) {
        PlayerStats stats = StrikePractice.getAPI().getPlayerStats(p);
        int globalElo = stats.getGlobalElo();
        p.sendMessage("Your global elo is now " + globalElo);
    }
}
```

Or to set a custom spigot knockback to specific kits
(Obviously not a working example but to get you started...):

```java
    
@EventHandler
public void onKitSelect(KitSelectEvent event) {
    String kit = event.getKit().getName();
    Knockback kb = getKnockback(kit);
    // Set the kb found or default knockback
    event.getPlayer().setKnockback(kb == null ? getKnockback("default") : kb);
}
    
private KnockBack getKnockback(String key) {
    return ... // Your stuff here
}
    
//Also see KitDeselectEvent (called when the kit is removed from the player)
```
