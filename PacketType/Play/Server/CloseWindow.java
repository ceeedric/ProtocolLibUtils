// Sent when a player closes a window
PacketContainer close_window = e.getPacket();
close_window.getIntegers().read(0); // returns window ID
