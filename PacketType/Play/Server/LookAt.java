/* I could not see this packet sent in game */
/* Used to rotate the client player to face the given location or entity (for /teleport [<targets>] <x> <y> <z> facing). */

look_at.getBooleans().read(0); // boolean isEntity
look_at.getIntegers().read(0); // Entity ID, only if isEntity is true

look_at.getDoubles().read(0); // X coordinate of the point to face towards
look_at.getDoubles().read(1); // Y coordinate of the point to face towards
look_at.getDoubles().read(2); // Z coordinate of the point to face towards
