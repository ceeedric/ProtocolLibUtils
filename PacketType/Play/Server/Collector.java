// This packet is sent when an entity picks up an item from the ground

PacketContainer collect = e.getPacket();
collect.getIntegers().read(0); // returns collected entity id
collect.getIntegers().read(1); // returns collector entity id
