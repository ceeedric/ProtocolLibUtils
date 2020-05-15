// This packet is sent when an entity has been leashed by another

PacketContainer attach_entity = e.getPacket();
attach_entity.getIntegers().read(0); // This will return the entity ID of the entity being pushed
attach_entity.getIntegers().read(1); // This will return the entity ID of the entity pushing
