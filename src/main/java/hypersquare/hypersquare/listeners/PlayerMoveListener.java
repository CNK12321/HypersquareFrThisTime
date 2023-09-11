package hypersquare.hypersquare.listeners;

import hypersquare.hypersquare.ChangeGameMode;
import hypersquare.hypersquare.Database;
import hypersquare.hypersquare.Hypersquare;
import hypersquare.hypersquare.RestrictMovement;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.io.IOException;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void playerMove(PlayerMoveEvent event) throws IOException {
        Player player = event.getPlayer();

        RestrictMovement.movementCheck(player);

    }
}
