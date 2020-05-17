/* Sent when an entity rotates its head */

PacketContainer entity_head_rotation = e.getPacket();
World world = e.getPlayer().getWorld();
entity_head_rotation.getIntegers().read(0); // Entity id
entity_head_rotation.getEntityModifier(world).read(0); // Returns entity
entity_head_rotation.getBytes().read(0); // Returns Yaw
