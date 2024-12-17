## StrikePracticeAPI


## [JavaDoc here](https://strikepractice-api.toppe.dev/)

For example:  
[StrikePracticeAPI.java](https://strikepractice-api.toppe.dev/doc/ga/strikepractice/api/StrikePracticeAPI.html)  
[StrikePractice Events](https://strikepractice-api.toppe.dev/doc/ga/strikepractice/events/package-summary.html)


## Installation

Download the API jar to use in your own plugins here:
<https://strikepractice-api.toppe.dev/strikepractice-api.jar>

Create a folder called libs (or whatever you want) in your plugin folder and put the jar there.

```sh
wget https://strikepractice-api.toppe.dev/strikepractice-api.jar -P libs
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
Now you can do anything with the api.

### Example: message to opponent
```java
Player player = ...
Player opponent = api.getDuelOpponent(player);
if (opponent != null) {
  opponent.sendMessage("Hello opponent!");
}
```

You will find most useful methods in the ga.strikepractice.api.StrikePracticeAPI

### Example: events, fight end and statistics

There are also custom Bukkit events for each fight type and more. You will find these under ga.strikepractice.events. Just use them like any other Bukkit event.
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

### Example: change knockback when receiving a kit

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

### Example: customize elo calculations

```java
StrikePracticeAPI api = StrikePractice.getAPI();

// Fully custom elo calculations
api.setEloCalculator(elos -> {
    // "how much better the winner was before this match"
    int diff = elos.getWinnerOldElo() - elos.getLoserOldElo();
    if (diff > 10) {
        elos.setLoserNewElo(elos.getLoserOldElo() - 20);
        elos.setWinnerNewElo(elos.getWinnerOldElo() + 20);
    }
    if (diff > 20) {
        elos.setLoserNewElo(elos.getLoserOldElo() - 50);
        elos.setWinnerNewElo(elos.getWinnerOldElo() + 50);
    } else {
        elos.setLoserNewElo(elos.getLoserOldElo() - 100);
        elos.setWinnerNewElo(elos.getWinnerOldElo() + 100);
    }
});

// ...or
// Modify existing calculator by just multiplying the changes by 2
StrikePracticeAPI api = StrikePractice.getAPI();
EloCalculator defaltCalc = api.getEloCalculator();
api.setEloCalculator(elos -> {
    defaltCalc.calculateElo(elos);
    elos.setWinnerNewElo(elos.getWinnerNewElo() * 2);
    elos.setLoserNewElo(elos.getLoserNewElo() * 2);
});
```
