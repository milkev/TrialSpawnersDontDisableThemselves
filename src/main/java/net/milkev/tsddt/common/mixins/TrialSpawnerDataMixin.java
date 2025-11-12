package net.milkev.tsddt.common.mixins;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Set;
import java.util.UUID;

@Mixin(net.minecraft.block.spawner.TrialSpawnerData.class)
public class TrialSpawnerDataMixin {

    @Shadow @Final protected Set<UUID> players;

    @Shadow protected int totalSpawnedMobs;

    @Shadow protected long nextMobSpawnsAt;

    @Shadow protected long cooldownEnd;

    @Shadow
    @Final
    protected Set<UUID> spawnedMobsAlive;

    /**
     * @Milkev
     * @Need to remove a function call (specifically setting the mob data to null)
     */
    @Overwrite
    public void reset() {
        this.players.clear();
        this.totalSpawnedMobs = 0;
        this.nextMobSpawnsAt = 0L;
        this.cooldownEnd = 0L;
        this.spawnedMobsAlive.clear();
    }
}
