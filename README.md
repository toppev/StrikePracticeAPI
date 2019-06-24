## StrikePracticeAPI
**Note:** StrikePracticeAPI was moved to ```ga.strikepractice.api``` in ```2.9.0``` update. The old version of the API is still available at ```ga.strikepractice.StrikePracticeAPI```.

## Getting Started

- Either clone this repository
- or use the StrikePractice.jar if you have purchased it
- or see [releases](https://github.com/toppev/StrikePracticeAPI/releases) and download the jar from there 
- (More options coming soon)

**Get the StrikePracticeAPI with the following:**

```
StrikePracticeAPI api = StrikePractice.getAPI();
```
Now you can do anything with the api. For example

```
Player player = ...
Player opponent = api.getDuelOpponent(player);
if(opponent != null) {
  opponent.sendMessage("Hello opponent!");
}
```

You will find most useful methods in the ga.strikepractice.api.StrikePracticeAPI

There are also custom Bukkit events for each fight type and more. You will find these under ga.strikepractice.events. Just use them like any other Bukkit event.
For example:
```
    
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

```
    
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
