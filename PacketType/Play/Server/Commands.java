/* Not sure what this packet is... Apparently it is supposed to return all the commands in the server */
PacketContainer commands = e.getPacket();
commands.getModifier().read(0); // Returns a <root> when you sout... not sure what this is
