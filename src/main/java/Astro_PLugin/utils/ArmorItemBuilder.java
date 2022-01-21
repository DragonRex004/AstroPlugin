package Astro_PLugin.utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.Arrays;

public class ArmorItemBuilder {

    private ItemStack item;
    private LeatherArmorMeta armorMeta;

    public ArmorItemBuilder(Material material) {
        item = new ItemStack(material, 1);
        armorMeta = (LeatherArmorMeta) item.getItemMeta();
    }

    public ArmorItemBuilder setName(String name) {
        armorMeta.setDisplayName(name);
        return this;
    }

    public ArmorItemBuilder setAmount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ArmorItemBuilder setLore(String ... lore) {
        armorMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ArmorItemBuilder setColor(Color color) {
        armorMeta.setColor(color);
        return this;
    }

    public ArmorItemBuilder setUnbreakable(boolean b) {
        armorMeta.setUnbreakable(b);
        return this;
    }

    public ArmorItemBuilder setCostomModelData(int data) {
        armorMeta.setCustomModelData(data);
        return this;
    }

    public ArmorItemBuilder setLocalizedName(String name) {
        armorMeta.setLocalizedName(name);
        return this;
    }

    public ArmorItemBuilder addEnchantment(Enchantment enchantment, int level, boolean see) {
        armorMeta.addEnchant(enchantment, level, see);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(armorMeta);
        return item;
    }
}
