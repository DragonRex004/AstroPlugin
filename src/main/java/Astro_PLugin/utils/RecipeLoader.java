package Astro_PLugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class RecipeLoader {

    public void Taschenlampe(){
        ItemStack taschenlampe = new ItemStack(Material.BLAZE_ROD);
        ItemMeta taschenlampenMeta = taschenlampe.getItemMeta();

        taschenlampenMeta.setDisplayName("§6Taschenlampe");
        taschenlampenMeta.setLore(Collections.singletonList("Drücke rechtsclick zum aktievieren"));
        taschenlampenMeta.setCustomModelData(2);
        taschenlampenMeta.setUnbreakable(true);
        taschenlampe.setItemMeta(taschenlampenMeta);

        ShapedRecipe Taschenlampe = new ShapedRecipe(taschenlampe);
        Taschenlampe.shape(" M " , " F " , " F ");
        Taschenlampe.setIngredient('M', Material.BLAZE_POWDER);
        Taschenlampe.setIngredient('F', Material.IRON_INGOT);

        Bukkit.addRecipe(Taschenlampe);





    }


}
