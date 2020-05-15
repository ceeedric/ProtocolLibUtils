// This packet is sent when you start destroying a block, when you stop, and when you cancel it.

PacketContainer block_break = e.getPacket();
block_break.getBlockPositionModifier().read(0); // gets block location
block_break.getBlockData().read(0); // gets block
block_break.getPlayerDigTypes().read(0); // returns Dig Type. check below
block_break.getBooleans().read(0); // boolean getSuccessful

System.out.println(block_break.getPlayerDigTypes().read(0));



/*
PlayerDigType is part of EnumWrappers

Those values seem to be the only ones to be returned while 
EnumWrappers.PlayerDigType.START_DESTROY_BLOCK
EnumWrappers.PlayerDigType.ABORT_DESTROY_BLOCK
EnumWrappers.PlayerDigType.STOP_DESTROY_BLOCK
 */
