/* I could not find when this is sent */

PacketContainer entity = e.getPacket();
entity.getIntegers().read(0); // Returns entity ID
entity.getEntityModifier(e.getPlayer().getWorld()).read(0); // Returns entity
