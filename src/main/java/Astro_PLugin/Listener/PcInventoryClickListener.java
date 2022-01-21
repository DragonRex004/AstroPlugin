package Astro_PLugin.Listener;

import Astro_PLugin.AstroPlugin;
import Astro_PLugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PcInventoryClickListener implements Listener {

    @EventHandler
    public void PcInvClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player)) return;

        if (event.getCurrentItem() == null) return;
        if (event.getInventory().equals(AstroPlugin.getInstance().getInventoryManager().getPc())) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§6LavaCoal")) {
                if (player.getInventory().contains(Material.EMERALD, 5)) {
                    if(player.getInventory().getItemInMainHand().equals(Material.EMERALD)) {
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                        player.getInventory().addItem(new ItemBuilder(Material.COAL).setName("§6LavaCoal").addEnchant(Enchantment.MENDING, 1, false).setAmount(15).build());
                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 5);
                    } else {
                        player.sendMessage("Du musst das bezahl item in der Hand halten");
                    }
                } else {
                    player.sendMessage("Du hast nicht genug §2Emeralds");
                }
            }

                if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§4Steel Ingots")) {
                    if (player.getInventory().contains(Material.COAL, 5)) {
                        if (player.getInventory().getItemInMainHand().getType().equals(Material.COAL)) {
                            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                            player.getInventory().addItem(new ItemBuilder(Material.IRON_INGOT).setName("§cSteel Ingots").addEnchant(Enchantment.MENDING, 1, false).setAmount(32).build());
                            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 5);
                        } else {
                            player.sendMessage("Du must das bezahl Item in der Hand halten");
                        }
                    } else {
                        player.sendMessage("Du hast nicht genug §6LavaCoal");
                    }
                }

                    if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§7Luft dichte MetallBlöcke")) {
                        if (player.getInventory().contains(Material.IRON_INGOT, 15)) {
                            if (player.getInventory().getItemInMainHand().getType().equals(Material.IRON_INGOT)) {
                                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                player.getInventory().addItem(new ItemBuilder(Material.IRON_BLOCK).setName("§7Luft dichte MetallBlöcke").setAmount(64).build());
                                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 15);
                            } else {
                                player.sendMessage("Du must das bezahl Item in der Hand halten");
                            }
                        } else {
                            player.sendMessage("Du hast nicht genug §4Steel Ingots");
                        }
                    }

                            if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§6Taschenlampe")) {
                                if (player.getInventory().contains(Material.EMERALD, 8)) {
                                    if (player.getInventory().getItemInMainHand().getType().equals(Material.EMERALD)) {
                                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                        player.getInventory().addItem(new ItemBuilder(Material.BLAZE_ROD).setName("§6Taschenlampe").build());
                                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 8);
                                    } else {
                                        player.sendMessage("Du must das bezahl Item in der Hand halten");
                                    }
                                } else {
                                    player.sendMessage("Du hast nicht genug §2Emeralds");
                                }
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§2Space Bohrer 1")) {
                                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                player.getInventory().addItem(new ItemBuilder(Material.WOODEN_PICKAXE).setName("§2Space Bohrer 1").build());
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cSpace Bohrer 3")) {
                                if(player.getInventory().contains(Material.EMERALD, 15)){
                                    if(player.getInventory().getItemInMainHand().getType().equals(Material.EMERALD)){
                                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                        player.getInventory().addItem(new ItemBuilder(Material.DIAMOND_PICKAXE).setName("§cSpace Bohrer 3").build());
                                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 15);
                                    } else {
                                        player.sendMessage("Du must das bezahl Item in der Hand halten");
                                    }
                                } else {
                                    player.sendMessage("Du hast nicht genug §2Emeralds");
                                }
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§6Space Bohrer 2")) {
                                if(player.getInventory().contains(Material.EMERALD, 5)) {
                                    if(player.getInventory().getItemInMainHand().getType().equals(Material.EMERALD)){
                                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                        player.getInventory().addItem(new ItemBuilder(Material.IRON_PICKAXE).setName("§6Space Bohrer 2").build());
                                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 5);
                                    } else {
                                        player.sendMessage("Du must das bezahl Item in der Hand halten");
                                    }
                                } else {
                                    player.sendMessage("Du hast nicht genug §2Emralds");
                                }
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§2Space Sword 1")) {
                                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP ,1, 1);
                                player.getInventory().addItem(new ItemBuilder(Material.WOODEN_SWORD).setName("§2Space Sword 1").build());
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§6Space Sword 2")) {
                                if(player.getInventory().contains(Material.EMERALD, 5)) {
                                    if(player.getInventory().getItemInMainHand().getType().equals(Material.EMERALD)) {
                                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                                        player.getInventory().addItem(new ItemBuilder(Material.IRON_SWORD).setName("§6Space Sword 2").build());
                                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 5);
                                    } else {
                                        player.sendMessage("Du must das bezahl Item in der Hand halten");
                                    }
                                } else {
                                    player.sendMessage("Du hast nicht genug §2Emeralds");
                                }
                            }

                            if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§cSpace Sword 3")) {
                                if(player.getInventory().contains(Material.EMERALD, 15)) {
                                    if(player.getInventory().getItemInMainHand().getType().equals(Material.EMERALD)) {
                                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP ,1 , 1);
                                        player.getInventory().addItem(new ItemBuilder(Material.DIAMOND_SWORD).setName("§cSpace Sword 3").build());
                                        player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInHand().getAmount() - 15);
                                    } else {
                                        player.sendMessage("Du must das bezahl Item in der Hand halten");
                                    }
                                } else {
                                    player.sendMessage("Du hast nicht genug §2Emeralds");
                                }
                            }
                        }
                    }
                }



