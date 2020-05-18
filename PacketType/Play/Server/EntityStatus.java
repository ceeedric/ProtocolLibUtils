/* Entity statuses generally trigger an animation for an entity */
/* https://wiki.vg/Entity_statuses */

PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY_STATUS);
packet.getIntegers().read(0); // Entity ID
packet.getBytes().read(0); // Status ID, check wiki
