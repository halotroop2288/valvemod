package halotroop2288.valvemod.init;

import java.util.ArrayList;
import java.util.List;

import halotroop2288.valvemod.items.ItemBase;
import halotroop2288.valvemod.items.Record;
import halotroop2288.valvemod.items.armor.ArmorBase;
import halotroop2288.valvemod.items.food.FoodBase;
import halotroop2288.valvemod.items.food.FoodEffectBase;
import halotroop2288.valvemod.items.tools.ToolAxe;
import halotroop2288.valvemod.items.tools.ToolHoe;
import halotroop2288.valvemod.items.tools.ToolPickaxe;
import halotroop2288.valvemod.items.tools.ToolSpade;
import halotroop2288.valvemod.items.tools.ToolSword;
import halotroop2288.valvemod.util.ModSoundEvent;
import halotroop2288.valvemod.util.Reference;
import halotroop2288.valvemod.util.handlers.SoundsHandler;
import net.minecraft.init.Items;
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

public class ModItems extends Items {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
		// Materials
				// Tools
	public static final ToolMaterial MATERIAL_MOON_ROCK = EnumHelper.addToolMaterial("material_moonrock", 1, 128, 4.0F, 1.0F, 20); // Moon Rocks
	//public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1024, 8.5F, 3.0F, 10); // Ruby
				// Armor
	public static final ArmorMaterial ARMOR_MATERIAL_MOON_ROCK = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":moon_rock", 14,
	new int[] {2, 7, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);  // Moon Rocks
	//public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14,
	//new int[] {2, 7, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);  // Ruby
	
		// Items
	public static final Item MOON_ROCK = new ItemBase("moon_rock"); // Moon Rock
	public static final Item MOON_ROCK_DUST = new ItemBase("moon_rock_dust"); // Moon Rock Dust
	public static final Item MOON_ROCK_INGOT = new ItemBase("moon_rock_ingot"); // Moon Rock Ingot
	//public static final Item ITEM_NAME = new ItemType("item_name");
	
		// Tools
				// Ruby
	//public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
				// Moon Rocks
	public static final ItemSword MOON_ROCK_SWORD = new ToolSword("moon_rock_sword", MATERIAL_MOON_ROCK); // Moon Rock Sword
	public static final ItemPickaxe MOON_ROCK_PICKAXE = new ToolPickaxe("moon_rock_pickaxe", MATERIAL_MOON_ROCK); // Moon Rock Pickaxe
	public static final ItemAxe MOON_ROCK_AXE = new ToolAxe("moon_rock_axe", MATERIAL_MOON_ROCK); // Moon Rock Axe
	public static final ItemSpade MOON_ROCK_SHOVEL = new ToolSpade("moon_rock_shovel", MATERIAL_MOON_ROCK); // Moon Rock Shovel
	public static final ItemHoe MOON_ROCK_HOE = new ToolHoe("moon_rock_hoe", MATERIAL_MOON_ROCK); // Moon Rock Hoe
	
		// Armor
				// Ruby
	//public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	//public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	//public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	//public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
		// Food
	//public static final Item ROCK_CANDY = new FoodBase("rock_candy", 20, 2.4F, false);
	//public static final Item ROCK_CANDY = new FoodEffectBase("rock_candy", 20, 2.4F, false, new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 1, false, false));
	
		// Records (Sounds will have to be provided by the player to avoid copyright issues)
	public static final Item RECORD_PORTAL_PROCEDURAL_JIGGLE_BONE = new Record("record_portal_procedural_jiggle_bone", SoundsHandler.PROCEDURAL_JIGGLE_BONE); // Title Screen Music
	public static final Item RECORD_PORTAL_SELF_ESTEEM_FUND = new Record("record_portal_self_esteem_fund", SoundsHandler.SELF_ESTEEM_FUND); // In-game music 1
	public static final Item RECORD_PORTAL_SUBJECT_NAME_HERE = new Record("record_portal_subject_name_here", SoundsHandler.SUBJECT_NAME_HERE); // In-game music 2
	public static final Item RECORD_PORTAL_PARTY_ESCORT = new Record("record_portal_party_escort", SoundsHandler.PARTY_ESCORT); // In-game music 3
	public static final Item RECORD_PORTAL_TASTE_OF_BLOOD = new Record("record_portal_taste_of_blood", SoundsHandler.TASTE_OF_BLOOD); // In-game music 4
	public static final Item RECORD_PORTAL_ANDROID_HELL = new Record("record_portal_android_hell", SoundsHandler.ANDROID_HELL); // In-game music 5
	public static final Item RECORD_PORTAL_4000_DEGREES_KELVIN = new Record("record_portal_4000_degrees_kelvin",SoundsHandler.FOUR_THOUSAND_DEGREES_KELVIN); // In-game music 6
	public static final Item RECORD_PORTAL_STOP_WHAT_YOU_ARE_DOING = new Record("record_portal_stop_what_you_are_doing", SoundsHandler.STOP_WHAT_YOU_ARE_DOING); // In-game music 7
	public static final Item RECORD_PORTAL_NO_CAKE_FOR_YOU = new Record("record_portal_no_cake_for_you", SoundsHandler.NO_CAKE_FOR_YOU); // In-game music 8
	public static final Item RECORD_PORTAL_YOURE_NOT_A_GOOD_PERSON = new Record("record_portal_youre_not_a_good_person", SoundsHandler.YOURE_NOT_A_GOOD_PERSON); // In-game music 9
	public static final Item RECORD_PORTAL_YOU_CANT_ESCAPE = new Record("record_portal_you_cant_escape", SoundsHandler.YOU_CANT_ESCAPE); // In-game music 10
	public static final Item RECORD_PORTAL_STILL_ALIVE = new Record("record_portal_still_alive", SoundsHandler.STILL_ALIVE); // End game music 1
	public static final Item RECORD_PORTAL_STILL_ALIVE_RADIO_LOOP = new Record("record_portal_still_alive_radio_loop", SoundsHandler.STILL_ALIVE_RADIO_LOOP); // Radio loop
	public static final Item RECORD_PORTAL_WANT_YOU_GONE = new Record("record_portal_want_you_gone", SoundsHandler.WANT_YOU_GONE); // End game music 2
}
