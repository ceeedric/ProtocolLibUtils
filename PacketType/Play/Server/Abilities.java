// This packet is sent before a player joins. 
// Methods:

PacketContainer abilities = e.getPacket();
abilities.getBooleans().read(0); // Boolean isInvunerable
abilities.getBooleans().read(1); // Boolean isFlying
abilities.getBooleans().read(2); // Boolean canFly
abilities.getBooleans().read(3); // Boolean canInstantlyBuild
abilities.getFloat().read(0); // Float flying speed
abilities.getFloat().read(1); // Float walking speed
