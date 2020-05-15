// This packet is sent when a player is breaking a block
                
PacketContainer block_break_animation = e.getPacket();
block_break_animation.getIntegers().read(0); // returns entity id
block_break_animation.getBlockPositionModifier().read(0); // get block location
block_break_animation.getIntegers().read(1); /* This will return the destroy stage, an integer
from 1 to 9, 10 means broken. It will return -1 if you cancel the block break animation */
