// This packet is sent by the server when a player arm's swings.

PacketContainer animation = e.getPacket();
animation.getIntegers().read(0); // Entity id
animation.getIntegers().read(1); // Hand used in the animation. This will return 0 for Main Hand and 1 for Off hand

