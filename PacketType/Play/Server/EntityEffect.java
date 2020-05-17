/* This packet is sent whenever an entity gets an effect */
PacketContainer entity_effect = e.getPacket();
World world = e.getPlayer().getWorld();

entity_effect.getIntegers().read(0); // returns entity id
entity_effect.getIntegers().read(1); // Returns effect duration

entity_effect.getEntityModifier(world).read(0); // returns entity

entity_effect.getBytes().read(0); // Returns effect ID
entity_effect.getBytes().read(1); // Returns amplifier, starting from zero, meaning if you write 0 here it will turn into a level 1 effect
entity_effect.getBytes().read(2); // Whether or not to hide particles, 0 means hidden, 1 means shown

// Effect IDs: https://minecraft.gamepedia.com/Status_effect#List_of_effects
