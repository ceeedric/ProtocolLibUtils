/* This packet is sent when Game State changes */

/*

https://wiki.vg/Protocol#Change_Game_State

 */

game_state_change.getIntegers().read(0); // Reason
game_state_change.getFloat().read(0); // Value, depends on reason

/* Make sure to check the wiki before writing those values */
