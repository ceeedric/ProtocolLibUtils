PacketContainer toReceive = new PacketContainer(PacketType.Play.Client.CHAT);
toReceive.getStrings().write(0, "ProtocolLib is a great API.");

try{
    ProtocolLibrary.getProtocolManager().recieveClientPacket(p, toReceive);
} catch (Exception e) {
    throw new RuntimeException("Error while receiving packet:", e);
}



// Method recieveClientPacket forces the Client to send the server a packet
// yes i know it is spelled wrong report that to dmulloy2 not me
// This only works with .Client packets (cant send server packets to server lol)
// PacketType.Play.Client.<packetname> <-- only packets like this will work (Status, legacy, login, and handshake might work but i didnt test)
//
