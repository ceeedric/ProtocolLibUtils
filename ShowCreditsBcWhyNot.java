PacketContainer packet = new PacketContainer(PacketType.Play.Server.GAME_STATE_CHANGE);
packet.getIntegers().write(0, 4);
packet.getFloat().write(0, 1F);

try {
  ProtocolLibrary.getProtocolManager().sendServerPacket(p, packet);
} catch (InvocationTargetException e) {
  e.printStackTrace();
}
