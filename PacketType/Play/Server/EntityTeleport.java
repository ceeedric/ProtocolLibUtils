/* This packet is sent when an entity moves more than 8 blocks */

entity_teleport.getIntegers().read(0); // Entity ID
entity_teleport.getEntityModifier(world).read(0); // Entity

entity_teleport.getDoubles().read(0); // X coordinate
entity_teleport.getDoubles().read(1); // Y coordinate
entity_teleport.getDoubles().read(2); // Z coordinate

entity_teleport.getBytes().read(0); // Yaw
entity_teleport.getBytes().read(1); // Pitch

entity_teleport.getBooleans().read(0); // isOnGround
