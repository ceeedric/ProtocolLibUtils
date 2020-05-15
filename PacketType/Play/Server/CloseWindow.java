// Sent when a window is forcibly closed.
PacketContainer close_window = e.getPacket();
close_window.getIntegers().read(0); // returns window ID
