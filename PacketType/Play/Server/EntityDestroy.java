/* This packet is sent when an entity is destroyed */

PacketContainer entity_destroy = e.getPacket();
entity_destroy.getIntegerArrays().read(0); // Entity IDs of entities being destroyed
