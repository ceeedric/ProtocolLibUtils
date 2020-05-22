/* This packet is sent to spawn a "living" entity */
/* https://wiki.vg/Protocol#Spawn_Living_Entity */
                
named_entity_spawn.getIntegers().read(0); // Entity ID
named_entity_spawn.getUUIDs().read(0); // UUID

named_entity_spawn.getDoubles().read(0); // X
named_entity_spawn.getDoubles().read(0); // Y
named_entity_spawn.getDoubles().read(0); // Z

named_entity_spawn.getBytes().read(0); // Yaw
named_entity_spawn.getBytes().read(1); // Pitch
