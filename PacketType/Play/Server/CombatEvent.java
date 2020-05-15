/* This was originally used for twitch streaming in 1.8. Now it is used to display the gamer over screen */
                
/* 0 ENTER COMBAT */
/* 1 END COMBAT */
/* 2 ENTITY DEAD */

PacketContainer combat_event = e.getPacket();
combat_event.getCombatEvents().read(0); /* Will return one of the combat types listed above */
combat_event.getIntegers().read(0); /* If type is 1, will return duration */
combat_event.getIntegers().read(0); /* If type is 2, will return entity id */
combat_event.getChatComponents().read(0); /* If type is 2, this will return the message */
