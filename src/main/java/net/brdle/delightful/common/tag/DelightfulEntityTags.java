package net.brdle.delightful.common.tag;

import net.brdle.delightful.Delightful;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class DelightfulEntityTags {

	public static final TagKey<EntityType<?>> FATTY_ANIMALS = create("fatty_animals");

	private static TagKey<EntityType<?>> create(String pName) {
		return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation(Delightful.MODID, pName));
	}
}
