// This packet is sent whenever a block changes within render distance
// Blocks breaking, blocks being placed, etc.

PacketContainer block_change = e.getPacket();
block_change.getBlockData().read(0); // block data
block_change.getBlockPositionModifier().read(0); // get block position
