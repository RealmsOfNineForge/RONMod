
package net.mcreator.realmsofnine.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public abstract class ShardsArmorItem extends ArmorItem {
	public ShardsArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.SHARDS_OF_SURTURS_BLADE.get()));
			}

			@Override
			public String getName() {
				return "shards_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ShardsArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "realms_of_nine:textures/models/armor/shards_layer_1.png";
		}
	}

	public static class Chestplate extends ShardsArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "realms_of_nine:textures/models/armor/shards_layer_1.png";
		}
	}

	public static class Leggings extends ShardsArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "realms_of_nine:textures/models/armor/shards_layer_2.png";
		}
	}

	public static class Boots extends ShardsArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "realms_of_nine:textures/models/armor/shards_layer_1.png";
		}
	}
}
