package hypersquare.hypersquare.Listeners;

import hypersquare.hypersquare.ItemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerRightClickListener implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEvent event){
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){
            switch (ItemManager.getItemID(event.getItem())) {
                case ("myPlots"):{



                    break;
                }
            }
        }
    }
}
