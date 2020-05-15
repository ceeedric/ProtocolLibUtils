// Packet sent when a player chats

PacketContainer chat = e.getPacket();
chat.getChatComponents().read(0); // returns the message
chat.getChatTypes().read(0); // returns chat type: SYSTEM, GAME_INFO, or CHAT.
