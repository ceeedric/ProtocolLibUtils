/* This packet is to do with paintings according to PacketWrapper but it does not seem to be working */
/* When listening to this packet I also could not find when it is sent */

/* I found methods but no idea what they are */

PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY);
packet.getIntegers().write(0, 929); // entity id?
packet.getBooleans().write(0, true); // unknown
packet.getBooleans().write(1, true); // unknown
packet.getBooleans().write(2, true); // unknown
packet.getBytes().write(0, (byte) 0); // unknown
packet.getShorts().write(0, (short) 0); // unknown
packet.getShorts().write(1, (short) 1); // unknown
packet.getShorts().write(2, (short) 2); // unknown
packet.getBytes().write(0, (byte) 1); // unknown
