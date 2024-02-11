package hypersquare.hypersquare.dev.code.player.event;

import hypersquare.hypersquare.item.action.player.PlayerEventItems;
import hypersquare.hypersquare.item.event.Event;
import hypersquare.hypersquare.item.event.EventItem;
import hypersquare.hypersquare.util.color.Colors;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PlayerBreakBlockEvent implements Event {
    @Override
    public ItemStack item() {
        return new EventItem()
            .setMaterial(Material.BEDROCK)
            .setName(Component.text("Player Break Block Event").color(Colors.SKY))
            .setDescription(
                Component.text("Executes code when a player"),
                Component.text("breaks a block."))
            .setCancellable(true)
            .build()
            ;
    }

    @Override
    public String getId() {
        return "break_block";
    }

    @Override
    public String getCodeblockId() {
        return "player_event";
    }

    @Override
    public String getSignName() {
        return "BreakBlock";
    }

    @Override
    public PlayerEventItems getCategory() {
        return PlayerEventItems.CLICK_EVENTS_CATEGORY;
    }
}
