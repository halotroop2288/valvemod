package halotroop2288.valvemod.init;

import java.util.ArrayList;
import java.util.List;

import halotroop2288.valvemod.items.ItemBase;
import halotroop2288.valvemod.items.armor.ArmorBase;
import halotroop2288.valvemod.items.food.FoodBase;
import halotroop2288.valvemod.items.food.FoodEffectBase;
import halotroop2288.valvemod.items.tools.ToolAxe;
import halotroop2288.valvemod.items.tools.ToolHoe;
import halotroop2288.valvemod.items.tools.ToolPickaxe;
import halotroop2288.valvemod.items.tools.ToolSpade;
import halotroop2288.valvemod.items.tools.ToolSword;
import halotroop2288.valvemod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
		// Materials
				// Tools
	//public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1024, 8.5F, 3.0F, 10); // Ruby
				// Armor
	//public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14,
	//new int[] {2, 7, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);  // Ruby
	
		// Items
	//public static final Item ITEM_NAME = new ItemType("item_name");
	
		// Tools
				// Ruby
	//public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	
		// Armor
				// Ruby
	//public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	//public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	//public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	//public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
		// Food
	//public static final Item ROCK_CANDY = new FoodBase("rock_candy", 20, 2.4F, false);
	//public static final Item ROCK_CANDY = new FoodEffectBase("rock_candy", 20, 2.4F, false, new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 1, false, false));
}
