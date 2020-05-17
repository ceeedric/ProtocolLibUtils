/* This packet is sent when an entity wears any piece of equipment */
/* This includes stuff like a skeleton's bow, a pillager's crossbow, etc */
/* In players this means their armor and item in main hand or offhand */

PacketContainer entity_equipment = e.getPacket();
World world = e.getPlayer().getWorld();
entity_equipment.getIntegers().read(0); // Returns entity ID
entity_equipment.getEntityModifier(world).read(0); // Returns entity
entity_equipment.getItemSlots().read(0); // Returns ItemSlot value
entity_equipment.getItemModifier().read(0); // Returns ItemStack

// ItemSlot is part of EnumWrappers, ItemSlot. to see values
