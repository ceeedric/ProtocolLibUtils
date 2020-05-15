/* This packet is sent when a player joins maybe to set up channel? */

PacketContainer custom_payload = e.getPacket();

custom_payload.getMinecraftKeys().read(0); // Returns current channel

/* important info: after 1.13 channel names are in lower case */

custom_payload.getModifier().withType(ByteBuf.class).read(0); // Returns byte buff
