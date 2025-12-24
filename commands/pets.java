package ua.anna.commands;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;


public class pets implements Listener {

    @EventHandler
    public void onPetHit(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getDamager();
        ItemStack itemHand = player.getInventory().getItemInMainHand();

        if (itemHand.getType() != Material.AIR) {
            return;
        }

        if (player.isSneaking()) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f,1.0f);
            event.getEntity().getWorld().spawnParticle(
                    Particle.HEART,
                    event.getEntity().getLocation().add(0, 1, 0),
                    10,
                    0.3, 0.3, 0.3
            );
        }

    }
}
