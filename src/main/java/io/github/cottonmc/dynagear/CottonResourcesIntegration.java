package io.github.cottonmc.dynagear;

import io.github.cottonmc.dynagear.api.ConfiguredMaterial;
import io.github.cottonmc.dynagear.api.MaterialAdder;
import io.github.cottonmc.dynagear.impl.MaterialManager;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;
import java.util.Map;

public class CottonResourcesIntegration implements MaterialAdder {
	private static Map<String, ConfiguredMaterial> materials = new HashMap<>();
	
	
	@Override
	public void addMaterials(MaterialManager manager) {
		if (FabricLoader.getInstance().isModLoaded("cotton-resources")) {
			//TODO: switch to dynamic once ore vote is in?
			for (ConfiguredMaterial mat : materials.values()) {
				manager.registerMaterial(mat);
			}
		}
	}
	
	static {
		materials.put("aluminum", new ConfiguredMaterial("aluminum", "#f9b9b9", "#c:aluminum_ingots", "#c:aluminum_blocks", 16,
				300, 1, 5, 2,
				16, new int[]{3, 4, 5, 3}, 0.25f, 0.0f,SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("brass", new ConfiguredMaterial("brass", "#ffbe3a", "#c:brass_ingots", "#c:brass_blocks", 16,
				400, 2, 5.5f, 2.5f,
				18, new int[]{4, 4, 4, 4}, 0.3f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("cobalt", new ConfiguredMaterial("cobalt", "#1d41c4", "#c:cobalt_ingots", "#c:cobalt_blocks", 16,
				800, 3, 12, 4,
				22, new int[]{4, 6, 6, 4}, 0.3f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("copper", new ConfiguredMaterial("copper", "#c35d12", "#c:copper_ingots", "#c:copper_blocks", 12,
				275, 1, 5.3f, 1,
				12, new int[]{2, 4, 5, 2}, 0.5f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("electrum", new ConfiguredMaterial("electrum", "#ffe86d", "#c:electrum_ingots", "#c:electrum_blocks", 16,
				440, 2, 6, 3,
				20, new int[]{5, 3, 3, 5}, 0.3f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("iridium", new ConfiguredMaterial("iridium", "#80e0c2", "#c:iridium_ingots", "#c:iridium_blocks", 22,
				600, 3, 6.5f, 5,
				25, new int[]{5, 5, 5, 5}, 2f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("lead", new ConfiguredMaterial("lead", "#64536d", "#c:lead_ingots", "#c:lead_blocks", 20,
				375, 1, 5.25f, 1.5f,
				18, new int[]{2, 4, 4, 2}, 0.6f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_GOLD));
		materials.put("osmium", new ConfiguredMaterial("osmium", "#afc0ed", "#c:osmium_ingots", "#c:osmium_blocks", 16,
				500, 2, 4.25f, 2,
				20, new int[]{3, 6, 6, 3}, 1, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("palladium", new ConfiguredMaterial("palladium", "#c3a5d2", "#c:palladium_ingots", "#c:palladium_blocks", 16,
				100, 3, 16, 3.5f,
				10, new int[]{3, 6, 8, 3}, 2.5f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("platinum", new ConfiguredMaterial("platinum", "#ffffff", "#c:platinum_ingots", "#c:platinum_blocks", 16,
				150, 2, 10, 2,
				12, new int[]{2, 5, 5, 2}, 1, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("silver", new ConfiguredMaterial("silver", "#96b2ff", "#c:silver_ingots", "#c:silver_blocks", 25,
				325, 1, 5, 3,
				15, new int[]{3, 4, 5, 3}, 1.75f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_GOLD));
		materials.put("steel", new ConfiguredMaterial("steel", "#464a57", "#c:steel_ingots", "#c:steel_blocks", 10,
				600, 2, 6, 3,
				18, new int[]{3, 6, 7, 3}, 1.25f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("tin", new ConfiguredMaterial("tin", "#6592dd", "#c:tin_ingots", "#c:tin_blocks", 16,
				290, 1, 5.1f, 2,
				12, new int[]{3, 4, 5, 3}, 0.5f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("titanium", new ConfiguredMaterial("titanium", "#6c6c6c", "#c:titanium_ingots", "#c:titanium_blocks", 14,
				600, 1, 5, 2.7f,
				25, new int[]{4, 5, 5, 4}, 0.75f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("tungsten", new ConfiguredMaterial("tungsten", "#31374a", "#c:tungsten_ingots", "#c:tungsten_blocks", 16,
				700, 3, 8, 3,
				27, new int[]{5, 5, 5, 5}, 2, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
		materials.put("zinc", new ConfiguredMaterial("zinc", "#839c94", "#c:zinc_ingots", "#c:zinc_blocks", 16,
				200, 1, 4.75f, 1,
				18, new int[]{3, 3, 3, 3}, 0.75f, 0.0f, SoundEvents.ITEM_ARMOR_EQUIP_IRON));
	}
}
