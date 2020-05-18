/* Velocity is believed to be in units of 1/8000 of a block per server tick (50ms);
 for example, -1343 would move (-1343 / 8000) = −0.167875 blocks per tick (or −3,3575 blocks per second). */

entity_velocity.getIntegers().read(0); // Entity ID

entity_velocity.getIntegers().read(1); // Velocity X
entity_velocity.getIntegers().read(2); // Velocity Y
entity_velocity.getIntegers().read(3); // Velocity Z
