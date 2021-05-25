package net.mcreator.nowemody.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.nowemody.NowemodyModElements;
import net.mcreator.nowemody.NowemodyMod;

import java.util.Map;

@NowemodyModElements.ModElement.Tag
public class LakiBlok3BlockDestroyedByPlayerProcedure extends NowemodyModElements.ModElement {
	public LakiBlok3BlockDestroyedByPlayerProcedure(NowemodyModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NowemodyMod.LOGGER.warn("Failed to load dependency entity for procedure LakiBlok3BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NowemodyMod.LOGGER.warn("Failed to load dependency x for procedure LakiBlok3BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NowemodyMod.LOGGER.warn("Failed to load dependency y for procedure LakiBlok3BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NowemodyMod.LOGGER.warn("Failed to load dependency z for procedure LakiBlok3BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NowemodyMod.LOGGER.warn("Failed to load dependency world for procedure LakiBlok3BlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double lucky = 0;
		lucky = (double) Math.round((Math.random() * 4));
		if (((lucky) == 1)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_BLOCK.getDefaultState(), 3);
		}
		if (((lucky) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 600, (int) 1));
		}
		if (((lucky) == 3)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel((int) 5);
		}
		if (((lucky) == 4)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new CatEntity(EntityType.CAT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
