/* Packet sent when an entity looks */

PacketContainer entity_look = e.getPacket();
World world = e.getPlayer().getWorld();

entity_look.getIntegers().read(0); // Returns entity ID
entity_look.getEntityModifier(world).read(0); // Returns Entity

entity_look.getBytes().read(0); // Returns Yaw
entity_look.getBytes().read(1); // Return pitch

entity_look.getBooleans().read(0); // Boolean isOnGround
